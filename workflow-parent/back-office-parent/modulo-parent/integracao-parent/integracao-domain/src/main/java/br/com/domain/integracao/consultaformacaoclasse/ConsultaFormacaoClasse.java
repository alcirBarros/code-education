//package br.com.domain.integracao.consultaformacaoclasse;
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
//@Table(name = "cfc_consulta_formacao_classe")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_cfc_pdh_id"))})
//public class ConsultaFormacaoClasse extends ProdespHeader  implements Serializable {
//
//    @Column(name = "cfc_numero_classe", columnDefinition = "TEXT")
//    private String inNumClasse;
//
//    @JoinColumn(name = "pdr_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ConsultaFormacaoClasseResponse consultaFormacaoClasseResponse;
//
//    public static ConsultaFormacaoClasse criarInstancia() {
//        return new ConsultaFormacaoClasse();
//    }
//
//    public static ConsultaFormacaoClasse setNull(ConsultaFormacaoClasse consultaFormacaoClasse) {
//        return consultaFormacaoClasse;
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
//    public ConsultaFormacaoClasseResponse getConsultaFormacaoClasseResponse() {
//        return consultaFormacaoClasseResponse;
//    }
//
//    public void setConsultaFormacaoClasseResponse(ConsultaFormacaoClasseResponse consultaFormacaoClasseResponse) {
//        this.consultaFormacaoClasseResponse = consultaFormacaoClasseResponse;
//    }
//}
