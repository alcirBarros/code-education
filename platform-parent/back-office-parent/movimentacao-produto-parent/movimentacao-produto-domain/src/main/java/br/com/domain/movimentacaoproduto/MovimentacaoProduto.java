package br.com.domain.movimentacaoproduto;

import br.com.domain.grupoproduto.GrupoProduto;
import br.com.domain.tipodocumento.TipoDocumento;
import br.com.context.model.AbstractEntidade;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "mvp_movimentacao_produto")
@Inheritance(strategy = InheritanceType.JOINED)
public class MovimentacaoProduto extends AbstractEntidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mpd_id")
    private Integer id;

//    @ManyToOne
//    @JoinColumn(name = "sbs_id", referencedColumnName = "sbs_id", foreignKey = @ForeignKey(name = "fk_mpd_sbs_id"), updatable = false, nullable = false)
//    private Subsetor subsetor;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rgm_id", referencedColumnName = "rgm_id", foreignKey = @ForeignKey(name = "fk_mpd_rgm_id"))
    private Origem origem;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "dst_id", referencedColumnName = "dst_id", foreignKey = @ForeignKey(name = "fk_mpd_dst_id"))
    private Destino destino;
//
//    @ManyToOne
//    @JoinColumn(name = "opr_id", referencedColumnName = "opr_id", nullable = false, foreignKey = @ForeignKey(name = "fk_mpd_opr_id"))
//    private Operador operador;

    @Column(name = "mpd_data_emissao")
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataEmissao;

    @Column(name = "mpd_data_hora", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataHora;

    @ManyToOne
    @JoinColumn(name = "tdc_id", referencedColumnName = "tdc_id", nullable = false, foreignKey = @ForeignKey(name = "fk_mpd_tdc_id"))
    private TipoDocumento tipoDocumento;

    @Column(name = "mpd_validade_compra_em_meses", precision = 19, scale = 0, length = 5)
    private BigDecimal validadeCompraEmMeses;

    @Column(name = "nfs_numero_nota", length = 10)
    private String numeroNota;

    @Column(name = "mpd_numero_empenho", length = 45)
    private String numeroEmpenho;

    @Column(name = "mpd_numero_licitacao", length = 45)
    private String numerolicitacao;

    @Column(name = "mpd_numero_processo", length = 45)
    private String numeroProcesso;

//    @ManyToOne
//    @JoinColumn(name = "usr_id", referencedColumnName = "usr_id", foreignKey = @ForeignKey(name = "fk_mpd_usr_id"))
//    private Usuario usuario;
//
//    @ManyToOne
//    @JoinColumn(name = "usr_prc_id", referencedColumnName = "usr_id", foreignKey = @ForeignKey(name = "fk_mpd_usr_prc_id"))
//    private Usuario usuarioPrescricao;
    
    @Column(name = "mpd_base_icms")
    private BigDecimal baseIcms;

    @Column(name = "mpd_valor_icms")
    private BigDecimal valorIcms;

    @Column(name = "mpd_base_icms_subst")
    private BigDecimal baseIcmsSubst;

    @Column(name = "mpd_valor_icms_subst")
    private BigDecimal valorIcmsSubst;

    @Column(name = "mpd_valor_total_produtos")
    private BigDecimal valorTotalProdutos;

    @Column(name = "mpd_valor_frete")
    private BigDecimal valorFrete;

    @Column(name = "mpd_valor_seguro")
    private BigDecimal valorSeguro;

    @Column(name = "mpd_valor_outras_desp")
    private BigDecimal outrasDespesas;

    @Column(name = "mpd_valor_total_ipi")
    private BigDecimal valorTotalIpi;

    @Column(name = "mpd_valor_total_nota")
    private BigDecimal valorTotalNota;

    @Column(name = "mpd_observacao", length = 500)
    private String observacao;

    @Column(name = "epr_processada")
    private Boolean processada = Boolean.FALSE;

    @Column(name = "mpd_ativo")
    private Boolean ativo = Boolean.TRUE;

    @Enumerated(EnumType.STRING)
    @Column(name = "mpd_status_movimento_enum", length = 45, nullable = false)
    private StatusMovimentoEnum statusMovimentoEnum = StatusMovimentoEnum.DIGITADO;

    @OneToMany(mappedBy = "movimentacaoProduto", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<ProdutoMovimentacao> produtoMovimentacaoList = new ArrayList<>();

    public MovimentacaoProduto() {
    }
    
    public void adicionarProduto(ProdutoMovimentacao produtoMovimentacao){
        produtoMovimentacao.setMovimentacaoProduto(this);
        produtoMovimentacaoList.add(produtoMovimentacao);
    }

    public List<Map.Entry<GrupoProduto, List<ProdutoMovimentacao>>> getGrupoProdutoMovimentacao() {
        Map<GrupoProduto, List<ProdutoMovimentacao>> map = produtoMovimentacaoList.stream().collect(Collectors.groupingBy(x -> {
            return (x.getProduto() != null && x.getProduto().getGrupoProduto() != null) ? x.getProduto().getGrupoProduto() : new GrupoProduto();
        }, Collectors.toList()));

        Set<Map.Entry<GrupoProduto, List<ProdutoMovimentacao>>> a = map.entrySet();
        ArrayList<Map.Entry<GrupoProduto, List<ProdutoMovimentacao>>> arrayList = new ArrayList<>(a);
        return arrayList;
    }

    public BigDecimal getQuantidadeTotal() {
        return produtoMovimentacaoList.stream().map(ProdutoMovimentacao::getQuantidade).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    public BigDecimal getValorTotal() {
        return produtoMovimentacaoList.stream().map(ProdutoMovimentacao::getValorTotal).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Origem getOrigem() {
        return origem;
    }

    public void setOrigem(Origem origem) {
        this.origem = origem;
    }

    public Destino getDestino() {
        return destino;
    }

    public void setDestino(Destino destino) {
        this.destino = destino;
    }

    public Date getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(Date dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public BigDecimal getValidadeCompraEmMeses() {
        return validadeCompraEmMeses;
    }

    public void setValidadeCompraEmMeses(BigDecimal validadeCompraEmMeses) {
        this.validadeCompraEmMeses = validadeCompraEmMeses;
    }

    public String getNumeroNota() {
        return numeroNota;
    }

    public void setNumeroNota(String numeroNota) {
        this.numeroNota = numeroNota;
    }

    public String getNumeroEmpenho() {
        return numeroEmpenho;
    }

    public void setNumeroEmpenho(String numeroEmpenho) {
        this.numeroEmpenho = numeroEmpenho;
    }

    public String getNumerolicitacao() {
        return numerolicitacao;
    }

    public void setNumerolicitacao(String numerolicitacao) {
        this.numerolicitacao = numerolicitacao;
    }

    public String getNumeroProcesso() {
        return numeroProcesso;
    }

    public void setNumeroProcesso(String numeroProcesso) {
        this.numeroProcesso = numeroProcesso;
    }

    public BigDecimal getBaseIcms() {
        return baseIcms;
    }

    public void setBaseIcms(BigDecimal baseIcms) {
        this.baseIcms = baseIcms;
    }

    public BigDecimal getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(BigDecimal valorIcms) {
        this.valorIcms = valorIcms;
    }

    public BigDecimal getBaseIcmsSubst() {
        return baseIcmsSubst;
    }

    public void setBaseIcmsSubst(BigDecimal baseIcmsSubst) {
        this.baseIcmsSubst = baseIcmsSubst;
    }

    public BigDecimal getValorIcmsSubst() {
        return valorIcmsSubst;
    }

    public void setValorIcmsSubst(BigDecimal valorIcmsSubst) {
        this.valorIcmsSubst = valorIcmsSubst;
    }

    public BigDecimal getValorTotalProdutos() {
        return valorTotalProdutos;
    }

    public void setValorTotalProdutos(BigDecimal valorTotalProdutos) {
        this.valorTotalProdutos = valorTotalProdutos;
    }

    public BigDecimal getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(BigDecimal valorFrete) {
        this.valorFrete = valorFrete;
    }

    public BigDecimal getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(BigDecimal valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public BigDecimal getOutrasDespesas() {
        return outrasDespesas;
    }

    public void setOutrasDespesas(BigDecimal outrasDespesas) {
        this.outrasDespesas = outrasDespesas;
    }

    public BigDecimal getValorTotalIpi() {
        return valorTotalIpi;
    }

    public void setValorTotalIpi(BigDecimal valorTotalIpi) {
        this.valorTotalIpi = valorTotalIpi;
    }

    public BigDecimal getValorTotalNota() {
        return valorTotalNota;
    }

    public void setValorTotalNota(BigDecimal valorTotalNota) {
        this.valorTotalNota = valorTotalNota;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Boolean getProcessada() {
        return processada;
    }

    public void setProcessada(Boolean processada) {
        this.processada = processada;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public StatusMovimentoEnum getStatusMovimentoEnum() {
        return statusMovimentoEnum;
    }

    public void setStatusMovimentoEnum(StatusMovimentoEnum statusMovimentoEnum) {
        this.statusMovimentoEnum = statusMovimentoEnum;
    }

    public List<ProdutoMovimentacao> getProdutoMovimentacaoList() {
        return produtoMovimentacaoList;
    }

    public void setProdutoMovimentacaoList(List<ProdutoMovimentacao> produtoMovimentacaoList) {
        this.produtoMovimentacaoList = produtoMovimentacaoList;
    }

}
