package br.com.domain.movimentacaoproduto;

import br.com.domain.produto.Produto;
import br.com.context.model.AbstractEntidade;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "pmv_produto_movimentacao")
@Inheritance(strategy = InheritanceType.JOINED)
public class ProdutoMovimentacao extends AbstractEntidade implements
        //        InterfaceProduto, 
        Serializable {

    private static final long serialVersionUID = -2376553343887255235L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pmv_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "mpd_id", referencedColumnName = "mpd_id", foreignKey = @ForeignKey(name = "fk_pmv_mpd_id"), updatable = false, nullable = false)
    private MovimentacaoProduto movimentacaoProduto;

    @Column(name = "pmv_saldo", nullable = false)
    private Integer saldo = 0;

    @Column(name = "pmv_saldo_anterior", precision = 19, scale = 0, nullable = false)
    private BigDecimal saldoAnterior = BigDecimal.ZERO;

//    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
//    @JoinColumn(name = "ses_id", referencedColumnName = "ses_id", foreignKey = @ForeignKey(name = "fk_pmv_ses_id"))
//    private SaldoEstoque saldoEstoque;
    


    @Column(name = "pmv_numero_lote", length = 255)
    private String numeroLote;

    @Temporal(javax.persistence.TemporalType.DATE)
    @Column(name = "pmv_validade")
    private Date dataValidade;

    @ManyToOne
    @JoinColumn(name = "pdt_id", referencedColumnName = "pdt_id", foreignKey = @ForeignKey(name = "fk_pmv_pdt_id"), nullable = false)
    private Produto produto;

//    @ManyToOne
//    @JoinColumn(name = "fbr_id", referencedColumnName = "fbr_id", foreignKey = @ForeignKey(name = "fk_pmv_fbr_id"))
//    private Fabricante fabricante;
    
    @Column(name = "pmv_quantidade_anterior_digitada", precision = 19, scale = 0, nullable = false)
    private BigDecimal quantidadeAnteriorDigitada = BigDecimal.ZERO;

    @Column(name = "pmv_quantidade", precision = 19, scale = 0, nullable = false)
    private BigDecimal quantidade;

    @Column(name = "pmv_valor_unitario", nullable = false)
    private BigDecimal valorUitario = BigDecimal.ZERO.setScale(5);

    @Column(name = "pmv_valor_total", nullable = false)
    private BigDecimal valorTotal = BigDecimal.ZERO.setScale(5);

    @Column(name = "pmv_total_saldo_produto", precision = 19, scale = 5, nullable = false)
    private BigDecimal totalSaldoProduto = BigDecimal.ZERO.setScale(5);

    @Column(name = "pmv_total_saldo_produto_anterior", nullable = false)
    private BigDecimal totalSaldoProdutoAnterior = BigDecimal.ZERO.setScale(5);

    @Column(name = "pmv_quantidade_nota", precision = 19, scale = 0, nullable = false)
    private BigDecimal quantidadeNota = BigDecimal.ZERO;

    @Column(name = "pmv_valor_unitario_nota", nullable = false)
    private BigDecimal valorUnitarioNota = BigDecimal.ZERO.setScale(5);

    @Column(name = "pmv_registro_anvisa", length = 45)
    private String registroAnvisa;

    @Column(name = "pmv_observacao")
    private String observacao;

    @Enumerated(EnumType.STRING)
    @Column(name = "pmv_status_produto_movimentacao_enum", length = 45, nullable = false)
    private StatusProdutoMovimentacaoEnum statusProdutoMovimentacaoEnum = StatusProdutoMovimentacaoEnum.DIGITADO;

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MovimentacaoProduto getMovimentacaoProduto() {
        return movimentacaoProduto;
    }

    public void setMovimentacaoProduto(MovimentacaoProduto movimentacaoProduto) {
        this.movimentacaoProduto = movimentacaoProduto;
    }

    public Integer getSaldo() {
        return saldo;
    }

    public void setSaldo(Integer saldo) {
        this.saldo = saldo;
    }

    public BigDecimal getSaldoAnterior() {
        return saldoAnterior;
    }

    public void setSaldoAnterior(BigDecimal saldoAnterior) {
        this.saldoAnterior = saldoAnterior;
    }

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public BigDecimal getQuantidadeAnteriorDigitada() {
        return quantidadeAnteriorDigitada;
    }

    public void setQuantidadeAnteriorDigitada(BigDecimal quantidadeAnteriorDigitada) {
        this.quantidadeAnteriorDigitada = quantidadeAnteriorDigitada;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValorUitario() {
        return valorUitario;
    }

    public void setValorUitario(BigDecimal valorUitario) {
        this.valorUitario = valorUitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public BigDecimal getTotalSaldoProduto() {
        return totalSaldoProduto;
    }

    public void setTotalSaldoProduto(BigDecimal totalSaldoProduto) {
        this.totalSaldoProduto = totalSaldoProduto;
    }

    public BigDecimal getTotalSaldoProdutoAnterior() {
        return totalSaldoProdutoAnterior;
    }

    public void setTotalSaldoProdutoAnterior(BigDecimal totalSaldoProdutoAnterior) {
        this.totalSaldoProdutoAnterior = totalSaldoProdutoAnterior;
    }

    public BigDecimal getQuantidadeNota() {
        return quantidadeNota;
    }

    public void setQuantidadeNota(BigDecimal quantidadeNota) {
        this.quantidadeNota = quantidadeNota;
    }

    public BigDecimal getValorUnitarioNota() {
        return valorUnitarioNota;
    }

    public void setValorUnitarioNota(BigDecimal valorUnitarioNota) {
        this.valorUnitarioNota = valorUnitarioNota;
    }

    public String getRegistroAnvisa() {
        return registroAnvisa;
    }

    public void setRegistroAnvisa(String registroAnvisa) {
        this.registroAnvisa = registroAnvisa;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public StatusProdutoMovimentacaoEnum getStatusProdutoMovimentacaoEnum() {
        return statusProdutoMovimentacaoEnum;
    }

    public void setStatusProdutoMovimentacaoEnum(StatusProdutoMovimentacaoEnum statusProdutoMovimentacaoEnum) {
        this.statusProdutoMovimentacaoEnum = statusProdutoMovimentacaoEnum;
    }

}
