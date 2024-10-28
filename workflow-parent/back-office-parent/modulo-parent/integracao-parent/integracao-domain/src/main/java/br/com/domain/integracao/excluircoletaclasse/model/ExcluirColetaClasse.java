//package br.com.domain.integracao.excluircoletaclasse.model;
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
//@Table(name = "ecc_excluir_coleta_classe")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_ecc_pdh_id"))})
//public class ExcluirColetaClasse extends ProdespHeader implements Serializable {
//
//    @Column(name = "ecc_numero_classe", columnDefinition = "TEXT")
//    private String inNumClasse;
//
//    @Column(name = "ecc_ano", columnDefinition = "TEXT")
//    private String inAno;
//
//    @JoinColumn(name = "lcr_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ExcluirColetaClasseResponse excluirColetaClasseResponse;
//
//    public static ExcluirColetaClasse setNull(ExcluirColetaClasse excluirColetaClasse) {
//        return excluirColetaClasse;
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
//    public String getInAno() {
//        return inAno;
//    }
//
//    public void setInAno(String inAno) {
//        this.inAno = inAno;
//    }
//
//    public ExcluirColetaClasseResponse getExcluirColetaClasseResponse() {
//        return excluirColetaClasseResponse;
//    }
//
//    public void setExcluirColetaClasseResponse(ExcluirColetaClasseResponse excluirColetaClasseResponse) {
//        this.excluirColetaClasseResponse = excluirColetaClasseResponse;
//    }
//}
