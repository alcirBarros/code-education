//package br.com.domain.integracao.consultarmatriculasra;
//
//import br.com.domain.prodesp.ProdespHeader;
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
//@Table(name = "crt_consultar_matriculas_registro_aluno")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_crt_pdh_id"))})
//public class ConsultarMatriculasRa extends ProdespHeader implements Serializable {
//
//    @Column(name = "crt_registro_aluno", length = 12)
//    private String inRA;
//
//    @Column(name = "crt_digito_aluno", length = 2)
//    private String inDigitoRA;
//
//    @Column(name = "crt_uf", length = 2)
//    private String inUF;
//
//    @JoinColumn(name = "ccr_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ConsultarMatriculasRaResponse consultarMatriculasRaResponse;
//
//    public static Object setNull(ConsultarMatriculasRa consultarColetaClasse) {
//        return consultarColetaClasse;
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
//    public String getInDigitoRA() {
//        return inDigitoRA;
//    }
//
//    public void setInDigitoRA(String inDigitoRA) {
//        this.inDigitoRA = inDigitoRA;
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
//    public ConsultarMatriculasRaResponse getConsultarMatriculasRaResponse() {
//        return consultarMatriculasRaResponse;
//    }
//
//    public void setConsultarMatriculasRaResponse(ConsultarMatriculasRaResponse consultarMatriculasRaResponse) {
//        this.consultarMatriculasRaResponse = consultarMatriculasRaResponse;
//    }
//}