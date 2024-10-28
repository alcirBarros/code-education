//package br.com.domain.integracao.consultafichaaluno.model;
//
//import br.com.domain.implement.ResponseEntity;
//import br.com.domain.prodesp.ProdespResponse;
//import java.io.Serializable;
//import java.util.HashSet;
//import java.util.Set;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumns;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "far_consulta_ficha_aluno_response")
//@PrimaryKeyJoinColumns({
//    @PrimaryKeyJoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_far_pdr_id"))})
//public class ConsultarFichaAlunoResponse extends ProdespResponse implements ResponseEntity, Serializable {
//
//    @Column(name = "far_sucesso")
//    private String outSucesso;
//
//    @Column(name = "far_erro")
//    private String outErro;
//
//    @Column(name = "far_codigo_processo")
//    private String outProcessoID;
//
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "lfc_aluno_ficha_consulta",
//            joinColumns = {
//                @JoinColumn(name = "pdr_id", referencedColumnName = "pdr_id", foreignKey = @ForeignKey(name = "fk_lfc_pdr_id"))},
//            inverseJoinColumns = {
//                @JoinColumn(name = "fln_id", referencedColumnName = "fln_id", foreignKey = @ForeignKey(name = "fk_lfc_fln_id"))})
//    private Set<FichaAluno> fichaAlunoList = new HashSet<>();
//
//    @JoinColumn(name = "fln_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private FichaAluno fichaAluno;
//
//    public String getOutSucesso() {
//        return outSucesso;
//    }
//
//    public void setOutSucesso(String outSucesso) {
//        this.outSucesso = (outSucesso != null && outSucesso.trim().equals("")) ? null : outSucesso;
//    }
//
//    public String getOutErro() {
//        return outErro;
//    }
//
//    public void setOutErro(String outErro) {
//        this.outErro = (outErro != null && outErro.trim().equals("")) ? null : outErro;
//    }
//
//    @Override
//    public String getOutProcessoID() {
//        return outProcessoID;
//    }
//
//    public void setOutProcessoID(String outProcessoID) {
//        this.outProcessoID = (outProcessoID != null && outProcessoID.trim().equals("")) ? null : outProcessoID;
//    }
//
//    public Set<FichaAluno> getFichaAlunoList() {
//        return fichaAlunoList;
//    }
//
//    public void setFichaAlunoList(Set<FichaAluno> fichaAlunoList) {
//        this.fichaAlunoList = fichaAlunoList;
//    }
//
//    public FichaAluno getFichaAluno() {
//        return fichaAluno;
//    }
//
//    public void setFichaAluno(FichaAluno fichaAluno) {
//        this.fichaAluno = fichaAluno;
//    }
//}
