//package br.com.domain.integracao.consultafichaaluno.model;
//
//import java.io.Serializable;
//import java.time.LocalDate;
//import java.time.ZoneId;
//import java.util.Date;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table;
//import javax.persistence.Transient;
//
//@Entity
//@Table(name = "cfn_consulta_fonetica")
//public class ConsultaFonetica implements Serializable {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "cfn_id", nullable = false)
//    private Integer id;
//
//    @Column(name = "cnc_nome_aluno", length = 60)
//    private String inNomeAluno;
//
//    @Column(name = "cnc_nome_social", length = 50)
//    private String inNomeSocial;
//
//    @Column(name = "cnc_nome_mae", length = 60)
//    private String inNomeMae;
//
//    @Transient
////    @Temporal(TemporalType.DATE)
////    @Column(name = "cfn_data_nascimento")
//    private Date dataNascimento;
//
//    @Column(name = "cnc_dia_nacimento", length = 2)
//    private String inDiaNascimento;
//
//    @Column(name = "cnc_mes_nascimento", length = 2)
//    private String inMesNascimento;
//
//    @Column(name = "cnc_ano_nascimento", length = 4)
//    private String inAnoNascimento;
//
//    public static boolean isEmpty(ConsultaFonetica consultaFonetica) {
//        if (consultaFonetica == null) {
//            return true;
//        }
//        if (consultaFonetica.getId() != null) {
//            return false;
//        }
//        if (consultaFonetica.getInNomeAluno() != null && !consultaFonetica.getInNomeAluno().trim().isEmpty()) {
//            return false;
//        }
//        if (consultaFonetica.getInNomeMae() != null && !consultaFonetica.getInNomeMae().trim().isEmpty()) {
//            return false;
//        }
//        if (consultaFonetica.getInDiaNascimento() != null && !consultaFonetica.getInDiaNascimento().trim().isEmpty()) {
//            return false;
//        }
//        if (consultaFonetica.getInMesNascimento() != null && !consultaFonetica.getInMesNascimento().trim().isEmpty()) {
//            return false;
//        }
//        if (consultaFonetica.getInAnoNascimento() != null && !consultaFonetica.getInAnoNascimento().trim().isEmpty()) {
//            return false;
//        }
//        if (consultaFonetica.getInNomeSocial() != null && !consultaFonetica.getInNomeSocial().trim().isEmpty()) {
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
//    public String getInNomeAluno() {
//        return inNomeAluno;
//    }
//
//    public void setInNomeAluno(String inNomeAluno) {
//        this.inNomeAluno = inNomeAluno;
//    }
//
//    public String getInNomeSocial() {
//        return inNomeSocial;
//    }
//
//    public void setInNomeSocial(String inNomeSocial) {
//        this.inNomeSocial = inNomeSocial;
//    }
//
//    public String getInNomeMae() {
//        return inNomeMae;
//    }
//
//    public void setInNomeMae(String inNomeMae) {
//        this.inNomeMae = inNomeMae;
//    }
//
//    public Date getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public void setDataNascimento(Date dataNascimento) {
//        LocalDate localDate = (dataNascimento != null) ? dataNascimento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate() : null;
//        inAnoNascimento = localDate != null ? String.valueOf(localDate.getYear()) : null;
//        inMesNascimento = localDate != null ? String.valueOf(localDate.getMonthValue()) : null;
//        inDiaNascimento = localDate != null ? String.valueOf(localDate.getDayOfMonth()) : null;
//        this.dataNascimento = dataNascimento;
//    }
//
//    public String getInDiaNascimento() {
//        return inDiaNascimento;
//    }
//
//    public String getInMesNascimento() {
//        return inMesNascimento;
//    }
//
//    public String getInAnoNascimento() {
//        return inAnoNascimento;
//    }
//}
