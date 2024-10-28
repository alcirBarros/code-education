//package br.com.domain.integracao.consultafichaaluno.model;
//
//import java.io.Serializable;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "cra_consulta_registro_aluno")
//public class ConsultaRA implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cra_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "cra_registro_aluno", length = 12)
//    private String inRA;
//
//    @Column(name = "cra_digito_registro_aluno", length = 2)
//    private String inDigitoRA;
//
//    @Column(name = "cra_unidade_federativa", length = 2)
//    private String inUF;
//
//    public static ConsultaRA criarInstancia() {
//        ConsultaRA consultaRA = new ConsultaRA();
//        return consultaRA;
//    }
//
//    public static ConsultaRA criarInstancia(FichaAluno fichaAluno) {
//        ConsultaRA consultaRA = criarInstancia();
//        consultaRA.setInRA(fichaAluno.getOutRA());
//        consultaRA.setInDigitoRA(fichaAluno.getOutDigitoRA());
//        consultaRA.setInUF(fichaAluno.getOutUFRA());
//        return consultaRA;
//    }
//
//    public static boolean isEmpty(ConsultaRA consultaRA) {
//        if (consultaRA == null) {
//            return true;
//        }
//        if (consultaRA.getId() != null) {
//            return false;
//        }
//        if (consultaRA.getInRA() != null && !consultaRA.getInRA().trim().isEmpty()) {
//            return false;
//        }
//        if (consultaRA.getInDigitoRA() != null && !consultaRA.getInDigitoRA().trim().isEmpty()) {
//            return false;
//        }
//        if (consultaRA.getInUF() != null && !consultaRA.getInUF().trim().isEmpty()) {
//            return false;
//        }
//        return true;
//    }
//
//    public Integer getId() {
//        return id;
//    }
//
//    public void setId(Integer id) {
//        this.id = id;
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
//        this.inDigitoRA =  inDigitoRA;
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
//}
