//package br.com.domain.integracao.alterarenderecofichaaluno.model;
//
//import br.com.domain.prodesp.ProdespHeader;
//import br.com.domain.integracao.realizarmatricula.model.EndIndicativo;
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
//@Table(name = "lna_alterar_endereco_ficha_aluno")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_lna_pdh_id"))})
//public class AlterarEnderecoFichaAluno extends ProdespHeader implements Serializable {
//
//    @Column(name = "lna_registro_aluno", columnDefinition = "TEXT")
//    private String inRA;
//
//    @Column(name = "lna_bairro", columnDefinition = "TEXT")
//    private String inBairro;
//
//    @Column(name = "lna_cep", columnDefinition = "TEXT")
//    private String inCep;
//
//    @Column(name = "lna_cidade", columnDefinition = "TEXT")
//    private String inCidade;
//
//    @Column(name = "lna_complemento", columnDefinition = "TEXT")
//    private String inComplemento;
//
//    @Column(name = "lna_ddd", columnDefinition = "TEXT")
//    private String inDDD;
//
//    @Column(name = "lna_fone_recado", columnDefinition = "TEXT")
//    private String inFoneRecados;
//
//    @Column(name = "lna_residencial", columnDefinition = "TEXT")
//    private String inFoneResidencial;
//
//    @Column(name = "lna_logradouro", columnDefinition = "TEXT")
//    private String inLogradouro;
//
//    @Column(name = "lna_nome_fone_recado", columnDefinition = "TEXT")
//    private String inNomeFoneRecado;
//
//    @Column(name = "lna_numero", columnDefinition = "TEXT")
//    private String inNumero;
//
//    @Column(name = "lna_tipo_logradouro", columnDefinition = "TEXT")
//    private String inTipoLogradouro;
//
//    @Column(name = "lna_uf", columnDefinition = "TEXT")
//    private String inUF;
//
//    @Column(name = "lna_digito_registro_aluno", columnDefinition = "TEXT")
//    private String inDigitoRA;
//
//    @Column(name = "lna_uf_registro_aluno", columnDefinition = "TEXT")
//    private String inUFRA;
//
//    @Column(name = "lna_sms", columnDefinition = "TEXT")
//    private String inSMS;
//
//    @Column(name = "lna_ddd_celular", columnDefinition = "TEXT")
//    private String inDDDCel;
//
//    @Column(name = "lna_numero_celular", columnDefinition = "TEXT")
//    private String inFoneCel;
//
//    @Column(name = "lna_latitude", columnDefinition = "TEXT")
//    private String inLatitude;
//
//    @Column(name = "lna_longitude", columnDefinition = "TEXT")
//    private String inLongitude;
//
////    @XmlElement(name = "EndIndicativo")
//    @JoinColumn(name = "enc_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private EndIndicativo endIndicativo;
//
//    @JoinColumn(name = "ear_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private AlterarEnderecoFichaAlunoResponse alterarEnderecoFichaAlunoResponse;
//    
//    
//    public static AlterarEnderecoFichaAluno criarInstancia() {
//        AlterarEnderecoFichaAluno alterarEnderecoFichaAluno = new AlterarEnderecoFichaAluno();
//        alterarEnderecoFichaAluno.setEndIndicativo(new EndIndicativo());
//        return alterarEnderecoFichaAluno;
//    }
//
//    public static AlterarEnderecoFichaAluno setNull(AlterarEnderecoFichaAluno alterarEnderecoFichaAluno) {
//        return alterarEnderecoFichaAluno;
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
//    public String getInBairro() {
//        return inBairro;
//    }
//
//    public void setInBairro(String inBairro) {
//        this.inBairro = inBairro;
//    }
//
//    public String getInCep() {
//        return inCep;
//    }
//
//    public void setInCep(String inCep) {
//        this.inCep = inCep;
//    }
//
//    public String getInCidade() {
//        return inCidade;
//    }
//
//    public void setInCidade(String inCidade) {
//        this.inCidade = inCidade;
//    }
//
//    public String getInComplemento() {
//        return inComplemento;
//    }
//
//    public void setInComplemento(String inComplemento) {
//        this.inComplemento = inComplemento;
//    }
//
//    public String getInDDD() {
//        return inDDD;
//    }
//
//    public void setInDDD(String inDDD) {
//        this.inDDD = inDDD;
//    }
//
//    public String getInFoneRecados() {
//        return inFoneRecados;
//    }
//
//    public void setInFoneRecados(String inFoneRecados) {
//        this.inFoneRecados = inFoneRecados;
//    }
//
//    public String getInFoneResidencial() {
//        return inFoneResidencial;
//    }
//
//    public void setInFoneResidencial(String inFoneResidencial) {
//        this.inFoneResidencial = inFoneResidencial;
//    }
//
//    public String getInLogradouro() {
//        return inLogradouro;
//    }
//
//    public void setInLogradouro(String inLogradouro) {
//        this.inLogradouro = inLogradouro;
//    }
//
//    public String getInNomeFoneRecado() {
//        return inNomeFoneRecado;
//    }
//
//    public void setInNomeFoneRecado(String inNomeFoneRecado) {
//        this.inNomeFoneRecado = inNomeFoneRecado;
//    }
//
//    public String getInNumero() {
//        return inNumero;
//    }
//
//    public void setInNumero(String inNumero) {
//        this.inNumero = inNumero;
//    }
//
//    public String getInTipoLogradouro() {
//        return inTipoLogradouro;
//    }
//
//    public void setInTipoLogradouro(String inTipoLogradouro) {
//        this.inTipoLogradouro = inTipoLogradouro;
//    }
//
//    public String getInUF() {
//        return inUF;
//    }
//
//    public void setInUF(String inUF) {
//        this.inUF = inUF;
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
//    public String getInSMS() {
//        return inSMS;
//    }
//
//    public void setInSMS(String inSMS) {
//        this.inSMS = inSMS;
//    }
//
//    public String getInDDDCel() {
//        return inDDDCel;
//    }
//
//    public void setInDDDCel(String inDDDCel) {
//        this.inDDDCel = inDDDCel;
//    }
//
//    public String getInFoneCel() {
//        return inFoneCel;
//    }
//
//    public void setInFoneCel(String inFoneCel) {
//        this.inFoneCel = inFoneCel;
//    }
//
//    public String getInLatitude() {
//        return inLatitude;
//    }
//
//    public void setInLatitude(String inLatitude) {
//        this.inLatitude = inLatitude;
//    }
//
//    public String getInLongitude() {
//        return inLongitude;
//    }
//
//    public void setInLongitude(String inLongitude) {
//        this.inLongitude = inLongitude;
//    }
//
//    public EndIndicativo getEndIndicativo() {
//        return endIndicativo;
//    }
//
//    public void setEndIndicativo(EndIndicativo endIndicativo) {
//        this.endIndicativo = endIndicativo;
//    }
//
//    public AlterarEnderecoFichaAlunoResponse getAlterarEnderecoFichaAlunoResponse() {
//        return alterarEnderecoFichaAlunoResponse;
//    }
//
//    public void setAlterarEnderecoFichaAlunoResponse(AlterarEnderecoFichaAlunoResponse alterarEnderecoFichaAlunoResponse) {
//        this.alterarEnderecoFichaAlunoResponse = alterarEnderecoFichaAlunoResponse;
//    }
//}
