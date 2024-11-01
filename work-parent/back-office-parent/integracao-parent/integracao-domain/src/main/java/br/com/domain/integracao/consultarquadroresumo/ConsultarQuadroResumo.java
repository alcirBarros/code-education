//package br.com.domain.integracao.consultarquadroresumo;
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
//@Table(name = "cqr_consultar_quadro_resumo")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_cqr_pdh_id"))})
//public class ConsultarQuadroResumo extends ProdespHeader implements Serializable {
//
//    @Column(name = "cqr_codigo_escola", columnDefinition = "TEXT")
//    private String inCodEscola;
//
//    @Column(name = "cqr_ano_letivo", columnDefinition = "TEXT")
//    private String inAno;
//
//    @JoinColumn(name = "ccr_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ConsultarQuadroResumoResponse consultarMatriculasRaResponse;
//
//    public static Object setNull(ConsultarQuadroResumo consultarQuadroResumo) {
//        return consultarQuadroResumo;
//    }
//
//    public String getInCodEscola() {
//        return inCodEscola;
//    }
//
//    public void setInCodEscola(String inCodEscola) {
//        this.inCodEscola = inCodEscola;
//    }
//
//    public String getInAno() {
//        return inAno;
//    }
//
//    public void setInAno(String inAno) {
//        this.inAno = inAno;
//    }
//
//    public ConsultarQuadroResumoResponse getConsultarMatriculasRaResponse() {
//        return consultarMatriculasRaResponse;
//    }
//
//    public void setConsultarMatriculasRaResponse(ConsultarQuadroResumoResponse consultarMatriculasRaResponse) {
//        this.consultarMatriculasRaResponse = consultarMatriculasRaResponse;
//    }
//}
