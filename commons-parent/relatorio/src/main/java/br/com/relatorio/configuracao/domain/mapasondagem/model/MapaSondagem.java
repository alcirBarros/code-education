package br.com.relatorio.configuracao.domain.mapasondagem.model;

import br.com.relatorio.configuracao.domain.alunolocalizacao.model.AlunosLocalizacao;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

@Entity
@Table(name = "mps_mapa_sondagem")
public class MapaSondagem implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mps_id")
    private Integer id;

    @Column(name = "mps_faltas")
    private int faltas;

    @Column(name = "mps_observacao")
    private String observacao;

    @Transient
//    @Column(name = "mps_data_aplicacao")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAplicacao;

    @Transient
//    @Column(name = "mps_data_inicio_periodo")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date dataInicioPeriodo;

    @Transient
//    @Column(name = "mps_data_fim_periodo")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFimPeriodo;

    @Transient
//    @Column(name = "mps_data_cadastro")
//    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCadastro;

    @Column(name = "mps_periodo_avaliacao")
    private String mpsPeriodoAvaliacao;

    @Column(name = "mps_hipotese")
    private String hipotese;

    @ManyToOne
    @JoinColumn(name = "tbalunos_localizacao_id", referencedColumnName = "tbalunos_localizacao_id")
    private AlunosLocalizacao alunosLocalizacao;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(Date dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Date getDataInicioPeriodo() {
        return dataInicioPeriodo;
    }

    public void setDataInicioPeriodo(Date dataInicioPeriodo) {
        this.dataInicioPeriodo = dataInicioPeriodo;
    }

    public Date getDataFimPeriodo() {
        return dataFimPeriodo;
    }

    public void setDataFimPeriodo(Date dataFimPeriodo) {
        this.dataFimPeriodo = dataFimPeriodo;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getMpsPeriodoAvaliacao() {
        return mpsPeriodoAvaliacao;
    }

    public void setMpsPeriodoAvaliacao(String mpsPeriodoAvaliacao) {
        this.mpsPeriodoAvaliacao = mpsPeriodoAvaliacao;
    }

    public String getHipotese() {
        return hipotese;
    }

    public void setHipotese(String hipotese) {
        this.hipotese = hipotese;
    }

    public AlunosLocalizacao getAlunosLocalizacao() {
        return alunosLocalizacao;
    }

    public void setAlunosLocalizacao(AlunosLocalizacao alunosLocalizacao) {
        this.alunosLocalizacao = alunosLocalizacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MapaSondagem other = (MapaSondagem) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
