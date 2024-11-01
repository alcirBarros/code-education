//package br.com.domain.integracao.consultarescolacie;
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
//@Table(name = "cse_consultar_escola_cie")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_cse_pdh_id"))})
//public class ConsultarEscolaCIE extends ProdespHeader implements Serializable {
//
//    @Column(name = "cse_codigo_escola", length = 7)
//    private String inCodEscola;
//
//    @JoinColumn(name = "pdr_id", referencedColumnName = "pdr_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ConsultarEscolaCIEResponse consultarEscolaCIEResponse;
//
//    public static Object setNull(ConsultarEscolaCIE consultarFichaAluno) {
//        return consultarFichaAluno;
//    }
//
//    public String getInCodEscola() {
//        return inCodEscola;
//    }
//
//    public void setInCodEscola(String inCodEscola) {
//        
//        this.inCodEscola = inCodEscola;
//    }
//
//    public ConsultarEscolaCIEResponse getConsultarEscolaCIEResponse() {
//        return consultarEscolaCIEResponse;
//    }
//
//    public void setConsultarEscolaCIEResponse(ConsultarEscolaCIEResponse consultarEscolaCIEResponse) {
//        this.consultarEscolaCIEResponse = consultarEscolaCIEResponse;
//    }
//}
