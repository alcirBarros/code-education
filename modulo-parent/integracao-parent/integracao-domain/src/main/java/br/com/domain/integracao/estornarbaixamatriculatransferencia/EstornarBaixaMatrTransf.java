//package br.com.domain.integracao.estornarbaixamatriculatransferencia;
//
//import br.com.domain.prodesp.ProdespHeader;
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumns;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "estornar_baixa_matricula_transferencia")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_cqr_pdh_id"))})
//public class EstornarBaixaMatrTransf extends ProdespHeader implements Serializable {
//
//    @Column(name = "numero_classe", columnDefinition = "TEXT")
//    private String inNumClasse;
//
//    @Column(name = "codigo_escola", columnDefinition = "TEXT")
//    private String inCodEscola;
//
//    @Column(name = "cqr_codigo_escola", columnDefinition = "TEXT")
//    private String inRA;
//
//    @Column(name = "cqr_codigo_escola", columnDefinition = "TEXT")
//    private String inSerieAno;
//
//    @Column(name = "cqr_codigo_escola", columnDefinition = "TEXT")
//    private String inTipoEnsino;
//
//    @Column(name = "cqr_codigo_escola", columnDefinition = "TEXT")
//    private String inUFRA;
//
//    @Column(name = "cqr_codigo_escola", columnDefinition = "TEXT")
//    private String inDigitoRA;
//
//}
