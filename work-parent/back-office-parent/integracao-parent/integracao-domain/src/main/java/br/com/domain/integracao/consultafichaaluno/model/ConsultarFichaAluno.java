//package br.com.domain.integracao.consultafichaaluno.model;
//
//import br.com.domain.prodesp.ProdespHeader;
//import br.com.domain.auxiliar.tipoconsultafichaaluno.TipoConsultaFichaAluno;
//import java.io.Serializable;
//import javax.persistence.CascadeType;
//import javax.persistence.Entity;
//import javax.persistence.ForeignKey;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumns;
//import javax.persistence.Table;
//
//@Entity
//@Table(name = "cfl_consultar_ficha_aluno")
//@PrimaryKeyJoinColumns({@PrimaryKeyJoinColumn(name = "pdh_id", referencedColumnName = "pdh_id", foreignKey = @ForeignKey(name = "fk_cfl_pdh_id"))})
//public class ConsultarFichaAluno extends ProdespHeader implements Serializable {
//
//    @ManyToOne
//    @JoinColumn(name = "tcf_id")
//    private TipoConsultaFichaAluno tipoConsultaFichaAluno;
//
//    @JoinColumn(name = "cdc_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ConsultaDocumentos consultaDocumentos;
//
//    @JoinColumn(name = "cfn_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ConsultaFonetica consultaFonetica;
//
//    @JoinColumn(name = "cnc_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ConsultaNomeCompleto consultaNomeCompleto;
//
//    @JoinColumn(name = "cra_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ConsultaRA consultaRA;
//
//    @JoinColumn(name = "far_id")
//    @ManyToOne(cascade = CascadeType.ALL)
//    private ConsultarFichaAlunoResponse consultarFichaAlunoResponse;
//
//    public static ConsultarFichaAluno criarInstancia() {
//        ConsultarFichaAluno consultarFichaAluno = new ConsultarFichaAluno();
//        consultarFichaAluno.setConsultaDocumentos(new ConsultaDocumentos());
//        consultarFichaAluno.setConsultaFonetica(new ConsultaFonetica());
//        consultarFichaAluno.setConsultaNomeCompleto(new ConsultaNomeCompleto());
//        consultarFichaAluno.setConsultaRA(new ConsultaRA());
//        return consultarFichaAluno;
//    }
//
//    public static ConsultarFichaAluno criarInstancia(ConsultaFonetica consultaFonetica) {
//        ConsultarFichaAluno consultarFichaAluno = criarInstancia();
//        consultarFichaAluno.setConsultaFonetica(consultaFonetica);
//        return consultarFichaAluno;
//    }
//
//    public static ConsultarFichaAluno criarInstancia(ConsultaNomeCompleto consultaFonetica) {
//        ConsultarFichaAluno consultarFichaAluno = criarInstancia();
//        consultarFichaAluno.setConsultaNomeCompleto(consultaFonetica);
//        return consultarFichaAluno;
//    }
//
//    public static ConsultarFichaAluno criarInstancia(ConsultaRA consultaRA) {
//        ConsultarFichaAluno consultarFichaAluno = criarInstancia();
//        consultarFichaAluno.setConsultaRA(consultaRA);
//        return consultarFichaAluno;
//    }
//
//    public static ConsultarFichaAluno setNull(ConsultarFichaAluno consultarFichaAluno) {
//
//        if (ConsultaDocumentos.isEmpty(consultarFichaAluno.getConsultaDocumentos())) {
//            consultarFichaAluno.setConsultaDocumentos(null);
//        }
//
//        if (ConsultaFonetica.isEmpty(consultarFichaAluno.getConsultaFonetica())) {
//            consultarFichaAluno.setConsultaFonetica(null);
//        }
//
//        if (ConsultaNomeCompleto.isEmpty(consultarFichaAluno.getConsultaNomeCompleto())) {
//            consultarFichaAluno.setConsultaNomeCompleto(null);
//        }
//
//        if (ConsultaRA.isEmpty(consultarFichaAluno.getConsultaRA())) {
//            consultarFichaAluno.setConsultaRA(null);
//        }
//        return consultarFichaAluno;
//    }
//
//    public static boolean isEmpty(ConsultarFichaAluno consultarFichaAluno) {
//        return false;
//    }
//
//    public TipoConsultaFichaAluno getTipoConsultaFichaAluno() {
//        return tipoConsultaFichaAluno;
//    }
//
//    public void setTipoConsultaFichaAluno(TipoConsultaFichaAluno tipoConsultaFichaAluno) {
//        this.tipoConsultaFichaAluno = tipoConsultaFichaAluno;
//    }
//
//    public ConsultaDocumentos getConsultaDocumentos() {
//        return consultaDocumentos;
//    }
//
//    public void setConsultaDocumentos(ConsultaDocumentos consultaDocumentos) {
//        this.consultaDocumentos = consultaDocumentos;
//    }
//
//    public ConsultaFonetica getConsultaFonetica() {
//        return consultaFonetica;
//    }
//
//    public void setConsultaFonetica(ConsultaFonetica consultaFonetica) {
//        this.consultaFonetica = consultaFonetica;
//    }
//
//    public ConsultaNomeCompleto getConsultaNomeCompleto() {
//        return consultaNomeCompleto;
//    }
//
//    public void setConsultaNomeCompleto(ConsultaNomeCompleto consultaNomeCompleto) {
//        this.consultaNomeCompleto = consultaNomeCompleto;
//    }
//
//    public ConsultaRA getConsultaRA() {
//        return consultaRA;
//    }
//
//    public void setConsultaRA(ConsultaRA consultaRA) {
//        this.consultaRA = consultaRA;
//    }
//
//    public ConsultarFichaAlunoResponse getConsultarFichaAlunoResponse() {
//        return consultarFichaAlunoResponse;
//    }
//
//    public void setConsultarFichaAlunoResponse(ConsultarFichaAlunoResponse consultarFichaAlunoResponse) {
//        this.consultarFichaAlunoResponse = consultarFichaAlunoResponse;
//    }
//}
