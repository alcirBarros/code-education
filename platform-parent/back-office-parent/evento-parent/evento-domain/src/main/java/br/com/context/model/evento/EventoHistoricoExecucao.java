package br.com.context.model.evento;

import br.com.context.model.AbstractEntidade;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "ehe_evento_historico_execucao", catalog = "evento")
@Inheritance(strategy = InheritanceType.JOINED)
public class EventoHistoricoExecucao extends AbstractEntidade implements Serializable {

    private static final long serialVersionUID = -662828041405240669L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ehe_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "evt_id", referencedColumnName = "evt_id")
    private Evento evento;

    @Column(name = "ehe_data_hora", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataHora;

//    @Column(name = "ehe_duracao_execucao")
//    private Duration duracaoExecucao;

    @Enumerated(EnumType.STRING)
    @Column(name = "ehe_status_execucao_enum", length = 45)
    private StatusExecucaoEnum statusExecucao = StatusExecucaoEnum.EXECUTADO;

    public static EventoHistoricoExecucao criaInstancia() {
        EventoHistoricoExecucao eventoHistoricoExecucao = new EventoHistoricoExecucao();
        return criaInstancia(eventoHistoricoExecucao);
    }

    public static EventoHistoricoExecucao criaInstancia(Evento evento) {
        EventoHistoricoExecucao eventoHistoricoExecucao = criaInstancia();
       // eventoHistoricoExecucao.setEvento(evento);
        return eventoHistoricoExecucao;
    }

    public static EventoHistoricoExecucao criaInstancia(EventoHistoricoExecucao eventoHistoricoExecucao) {
        return eventoHistoricoExecucao;
    }

    public static EventoHistoricoExecucao setNULL(EventoHistoricoExecucao eventoHistoricoExecucao) {
        return eventoHistoricoExecucao;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

//    public Duration getDuracaoExecucao() {
//        return duracaoExecucao;
//    }
//
//    public void setDuracaoExecucao(Duration duracaoExecucao) {
//        this.duracaoExecucao = duracaoExecucao;
//    }

    public StatusExecucaoEnum getStatusExecucao() {
        return statusExecucao;
    }

    public void setStatusExecucao(StatusExecucaoEnum statusExecucao) {
        this.statusExecucao = statusExecucao;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 37 * hash + Objects.hashCode(this.id);
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
        final EventoHistoricoExecucao other = (EventoHistoricoExecucao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
