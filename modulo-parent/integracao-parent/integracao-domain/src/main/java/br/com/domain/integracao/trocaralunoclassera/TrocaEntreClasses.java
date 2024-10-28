//package br.com.domain.integracao.trocaralunoclassera;
//
//import java.io.Serializable;
//import java.util.Objects;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "tac_trocar_aluno_classe_registro_aluno")
//public class TrocaEntreClasses implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "tac_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "tac_erro", columnDefinition = "TEXT")
//    private String outErro;
//
//    @Column(name = "tac_horario", columnDefinition = "TEXT")
//    private String outHorario;
//
//    @Column(name = "tac_numero_classe", columnDefinition = "TEXT")
//    private String outNumClasse;
//
//    @Column(name = "tac_tac_ano", columnDefinition = "TEXT")
//    private String outOpcao;
//
//    @Column(name = "tac_sucesso", columnDefinition = "TEXT")
//    private String outSucesso;
//
//    @Column(name = "tac_tipo_ensino", columnDefinition = "TEXT")
//    private String outTipoEnsino;
//
//    @Column(name = "tac_turma", columnDefinition = "TEXT")
//    private String outTurma;
//
//    @Column(name = "tac_turno", columnDefinition = "TEXT")
//    private String outTurno;
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
//    }
//
//    public String getOutErro() {
//        return outErro;
//    }
//
//    public void setOutErro(String outErro) {
//        this.outErro = outErro;
//    }
//
//    public String getOutHorario() {
//        return outHorario;
//    }
//
//    public void setOutHorario(String outHorario) {
//        this.outHorario = outHorario;
//    }
//
//    public String getOutNumClasse() {
//        return outNumClasse;
//    }
//
//    public void setOutNumClasse(String outNumClasse) {
//        this.outNumClasse = outNumClasse;
//    }
//
//    public String getOutOpcao() {
//        return outOpcao;
//    }
//
//    public void setOutOpcao(String outOpcao) {
//        this.outOpcao = outOpcao;
//    }
//
//    public String getOutSucesso() {
//        return outSucesso;
//    }
//
//    public void setOutSucesso(String outSucesso) {
//        this.outSucesso = outSucesso;
//    }
//
//    public String getOutTipoEnsino() {
//        return outTipoEnsino;
//    }
//
//    public void setOutTipoEnsino(String outTipoEnsino) {
//        this.outTipoEnsino = outTipoEnsino;
//    }
//
//    public String getOutTurma() {
//        return outTurma;
//    }
//
//    public void setOutTurma(String outTurma) {
//        this.outTurma = outTurma;
//    }
//
//    public String getOutTurno() {
//        return outTurno;
//    }
//
//    public void setOutTurno(String outTurno) {
//        this.outTurno = outTurno;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 7;
//        hash = 83 * hash + Objects.hashCode(this.id);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj) {
//            return true;
//        }
//        if (obj == null) {
//            return false;
//        }
//        if (getClass() != obj.getClass()) {
//            return false;
//        }
//        final TrocaEntreClasses other = (TrocaEntreClasses) obj;
//        if (!Objects.equals(this.id, other.id)) {
//            return false;
//        }
//        return true;
//    }
//}
