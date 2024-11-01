//package br.com.domain.integracao.alterardocumentosfichaaluno.model;
//
//import br.com.domain.prodesp.ProdespHeader;
//import br.com.domain.integracao.realizarmatricula.model.CertidaoAntiga;
//import br.com.domain.integracao.realizarmatricula.model.CertidaoNova;
//import java.io.Serializable;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumns;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "afa_alterar_dados_pessoais_ficha_aluno")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_afa_pdh_id"))})
//public class AlterarDocumentosFichaAluno extends ProdespHeader implements Serializable {
//
//    @Column(name = "afa_registro_aluno", columnDefinition = "TEXT")
//    private String inRA;
//
//    @Column(name = "afa_ano_emissao", columnDefinition = "TEXT")
//    private String inAnoEmissao;
//
//    @Column(name = "afa_ano_entrada_brasil", columnDefinition = "TEXT")
//    private String inAnoEntBrasil;
//
//    @Column(name = "afa_dia_emissao", columnDefinition = "TEXT")
//    private String inDiaEmissao;
//
//    @Column(name = "afa_dia_entrada_brasil", columnDefinition = "TEXT")
//    private String inDiaEntBrasil;
//
//    @Column(name = "afa_mes_emissao", columnDefinition = "TEXT")
//    private String inMesEmissao;
//
//    @Column(name = "afa_mes_entrada_brasil", columnDefinition = "TEXT")
//    private String inMesEntBrasil;
//
//    @Column(name = "afa_municipio_nascimento", columnDefinition = "TEXT")
//    private String inMunicipioNasc;
//
//    @Column(name = "afa_nascionalidade", columnDefinition = "TEXT")
//    private String inNacionalidade;
//
//    @Column(name = "afa_numero_nis", columnDefinition = "TEXT")
//    private String inNumNIS;
//
//    @Column(name = "afa_pais_origem", columnDefinition = "TEXT")
//    private String inPaisOrigem;
//
//    @Column(name = "afa_rgrne_01", columnDefinition = "TEXT")
//    private String inRGRNE01;
//
//    @Column(name = "afa_rgrne_02", columnDefinition = "TEXT")
//    private String inRGRNE02;
//
//    @Column(name = "afa_rgrne_03", columnDefinition = "TEXT")
//    private String inRGRNE03;
//
//    @Column(name = "afa_uf_nascimento", columnDefinition = "TEXT")
//    private String inUFNasc;
//
//    @Column(name = "afa_cadastro_pessoa_fisica", columnDefinition = "TEXT")
//    private String inCPF;
//
//    @Column(name = "afa_digito_registro_geral", columnDefinition = "TEXT")
//    private String inDigitoRA;
//
//    @Column(name = "afa_uf_registro_geral", columnDefinition = "TEXT")
//    private String inUFRA;
//
////    @XmlElement(name = "CertidaoAntiga")
//    @JoinColumn(name = "cta_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private CertidaoAntiga certidaoAntiga;
//
////    @XmlElement(name = "CertidaoNova")
//    @JoinColumn(name = "cnv_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private CertidaoNova certidaoNova;
//
//    @JoinColumn(name = "dfa_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private AlterarDocumentosFichaAlunoResponse alterarDocumentosFichaAlunoResponse;
//
//    public static AlterarDocumentosFichaAluno setNull(AlterarDocumentosFichaAluno alterarDadosPessoaisFichaAluno) {
//        return alterarDadosPessoaisFichaAluno;
//    }
//
//    public String getInRA() {
//        return inRA;
//    }
//
//    public void setInRA(String inRA) {
//        this.inRA = inRA;
//    }
//
//    public String getInAnoEmissao() {
//        return inAnoEmissao;
//    }
//
//    public void setInAnoEmissao(String inAnoEmissao) {
//        this.inAnoEmissao = inAnoEmissao;
//    }
//
//    public String getInAnoEntBrasil() {
//        return inAnoEntBrasil;
//    }
//
//    public void setInAnoEntBrasil(String inAnoEntBrasil) {
//        this.inAnoEntBrasil = inAnoEntBrasil;
//    }
//
//    public String getInDiaEmissao() {
//        return inDiaEmissao;
//    }
//
//    public void setInDiaEmissao(String inDiaEmissao) {
//        this.inDiaEmissao = inDiaEmissao;
//    }
//
//    public String getInDiaEntBrasil() {
//        return inDiaEntBrasil;
//    }
//
//    public void setInDiaEntBrasil(String inDiaEntBrasil) {
//        this.inDiaEntBrasil = inDiaEntBrasil;
//    }
//
//    public String getInMesEmissao() {
//        return inMesEmissao;
//    }
//
//    public void setInMesEmissao(String inMesEmissao) {
//        this.inMesEmissao = inMesEmissao;
//    }
//
//    public String getInMesEntBrasil() {
//        return inMesEntBrasil;
//    }
//
//    public void setInMesEntBrasil(String inMesEntBrasil) {
//        this.inMesEntBrasil = inMesEntBrasil;
//    }
//
//    public String getInMunicipioNasc() {
//        return inMunicipioNasc;
//    }
//
//    public void setInMunicipioNasc(String inMunicipioNasc) {
//        this.inMunicipioNasc = inMunicipioNasc;
//    }
//
//    public String getInNacionalidade() {
//        return inNacionalidade;
//    }
//
//    public void setInNacionalidade(String inNacionalidade) {
//        this.inNacionalidade = inNacionalidade;
//    }
//
//    public String getInNumNIS() {
//        return inNumNIS;
//    }
//
//    public void setInNumNIS(String inNumNIS) {
//        this.inNumNIS = inNumNIS;
//    }
//
//    public String getInPaisOrigem() {
//        return inPaisOrigem;
//    }
//
//    public void setInPaisOrigem(String inPaisOrigem) {
//        this.inPaisOrigem = inPaisOrigem;
//    }
//
//    public String getInRGRNE01() {
//        return inRGRNE01;
//    }
//
//    public void setInRGRNE01(String inRGRNE01) {
//        this.inRGRNE01 = inRGRNE01;
//    }
//
//    public String getInRGRNE02() {
//        return inRGRNE02;
//    }
//
//    public void setInRGRNE02(String inRGRNE02) {
//        this.inRGRNE02 = inRGRNE02;
//    }
//
//    public String getInRGRNE03() {
//        return inRGRNE03;
//    }
//
//    public void setInRGRNE03(String inRGRNE03) {
//        this.inRGRNE03 = inRGRNE03;
//    }
//
//    public String getInUFNasc() {
//        return inUFNasc;
//    }
//
//    public void setInUFNasc(String inUFNasc) {
//        this.inUFNasc = inUFNasc;
//    }
//
//    public String getInCPF() {
//        return inCPF;
//    }
//
//    public void setInCPF(String inCPF) {
//        this.inCPF = inCPF;
//    }
//
//    public String getInDigitoRA() {
//        return inDigitoRA;
//    }
//
//    public void setInDigitoRA(String inDigitoRA) {
//        this.inDigitoRA = inDigitoRA;
//    }
//
//    public String getInUFRA() {
//        return inUFRA;
//    }
//
//    public void setInUFRA(String inUFRA) {
//        this.inUFRA = inUFRA;
//    }
//
//    public CertidaoAntiga getCertidaoAntiga() {
//        return certidaoAntiga;
//    }
//
//    public void setCertidaoAntiga(CertidaoAntiga certidaoAntiga) {
//        this.certidaoAntiga = certidaoAntiga;
//    }
//
//    public CertidaoNova getCertidaoNova() {
//        return certidaoNova;
//    }
//
//    public void setCertidaoNova(CertidaoNova certidaoNova) {
//        this.certidaoNova = certidaoNova;
//    }
//
//    public AlterarDocumentosFichaAlunoResponse getAlterarDocumentosFichaAlunoResponse() {
//        return alterarDocumentosFichaAlunoResponse;
//    }
//
//    public void setAlterarDocumentosFichaAlunoResponse(AlterarDocumentosFichaAlunoResponse alterarDocumentosFichaAlunoResponse) {
//        this.alterarDocumentosFichaAlunoResponse = alterarDocumentosFichaAlunoResponse;
//    }
//}
