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
//@Table(name = "cnc_consulta_nome_completo")
//public class ConsultaNomeCompleto implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cnc_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "cnc_nome_aluno", length = 60)
//    private String inNomeComplAluno;
//
//    @Column(name = "cnc_nome_mae", length = 60)
//    private String inNomeComplMae;
//
//    @Column(name = "cnc_nome_pai", length = 60)
//    private String inNomeComplPai;
//
//    public static boolean isEmpty(ConsultaNomeCompleto consultaNomeCompleto) {
//        if (consultaNomeCompleto == null) {
//            return true;
//        }
//        if (consultaNomeCompleto.getId() != null) {
//            return false;
//        }
//        if (consultaNomeCompleto.getInNomeComplAluno() != null && !consultaNomeCompleto.getInNomeComplAluno().trim().isEmpty()) {
//            return false;
//        }
//        if (consultaNomeCompleto.getInNomeComplMae() != null && !consultaNomeCompleto.getInNomeComplMae().trim().isEmpty()) {
//            return false;
//        }
//        if (consultaNomeCompleto.getInNomeComplPai() != null && !consultaNomeCompleto.getInNomeComplPai().trim().isEmpty()) {
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
//    public String getInNomeComplAluno() {
//        return inNomeComplAluno;
//    }
//
//    public void setInNomeComplAluno(String inNomeComplAluno) {
//        this.inNomeComplAluno = inNomeComplAluno;
//    }
//
//    public String getInNomeComplMae() {
//        return inNomeComplMae;
//    }
//
//    public void setInNomeComplMae(String inNomeComplMae) {
//        this.inNomeComplMae = inNomeComplMae;
//    }
//
//    public String getInNomeComplPai() {
//        return inNomeComplPai;
//    }
//
//    public void setInNomeComplPai(String inNomeComplPai) {
//        this.inNomeComplPai = inNomeComplPai;
//    }
//
//}
