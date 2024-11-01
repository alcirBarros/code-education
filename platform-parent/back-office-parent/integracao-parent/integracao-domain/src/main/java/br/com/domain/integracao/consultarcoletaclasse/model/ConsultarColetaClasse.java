//package br.com.domain.integracao.consultarcoletaclasse.model;
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
//@Table(name = "ccc_consulta_coleta_classe")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_ccc_pdh_id"))})
//public class ConsultarColetaClasse extends ProdespHeader implements Serializable {
//
//    @Column(name = "ccc_ano", length = 4)
//    private String inAno;
//
//    @Column(name = "ccc_numero_classe", length = 9)
//    private String inNumClasse;
//
//    @JoinColumn(name = "ccr_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ConsultarColetaClasseResponse consultarColetaClasseResponse;
//
//    public static ConsultarColetaClasse criarInstancia() {
//        ConsultarColetaClasse consultarColetaClasse = new ConsultarColetaClasse();
//        return consultarColetaClasse;
//    }
//
//    public static Object setNull(ConsultarColetaClasse consultarColetaClasse) {
//        return consultarColetaClasse;
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
//    public String getInNumClasse() {
//        return inNumClasse;
//    }
//
//    public void setInNumClasse(String inNumClasse) {
//        this.inNumClasse = inNumClasse;
//    }
//
//    public ConsultarColetaClasseResponse getConsultarColetaClasseResponse() {
//        return consultarColetaClasseResponse;
//    }
//
//    public void setConsultarColetaClasseResponse(ConsultarColetaClasseResponse consultarColetaClasseResponse) {
//        this.consultarColetaClasseResponse = consultarColetaClasseResponse;
//    }
//}
