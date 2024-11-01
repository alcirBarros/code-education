package br.com.context.model.evento;

import br.com.context.model.tipoevento.model.TipoEvento;
import br.com.context.model.AbstractEntidade;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

@Entity
@Table(name = "evt_evento", catalog = "evento")
@Inheritance(strategy = InheritanceType.JOINED)
public class Evento extends AbstractEntidade implements Serializable {

    private static final long serialVersionUID = -21157219429439369L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "evt_id", nullable = false)
    private Integer id;

    @Column(name = "evt_data_hora", nullable = false)
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataHora = new Date();

//    @ManyToOne
//    @JoinColumn(name = "opr_id", referencedColumnName = "opr_id", nullable = false, foreignKey = @ForeignKey(name = "fk_evt_opr_id"))
//    private Operador operador;
    @Column(name = "evt_ativo")
    private Boolean ativo = Boolean.TRUE;

    @ManyToOne
    @JoinColumn(name = "tev_id", referencedColumnName = "tev_id")
    private TipoEvento tipoEvento;

    @Column(name = "evt_descricao", length = 100)
    private String descricao;

    @Column(name = "evt_data_hora_ultima_execucao")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataHoraUltimaExecucao;

    @Column(name = "evt_quantidade_execucao", precision = 19, scale = 0, nullable = false)
    private BigDecimal quantidadeExecucao = BigDecimal.ZERO;

    @Column(name = "evt_duracao_ultima_execucao")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date duracaoUltimaExecucao;

    @Column(name = "evt_observacao", length = 500)
    private String observacao;

    @ManyToOne
    @JoinColumn(name = "ehe_id", referencedColumnName = "ehe_id")
    private EventoHistoricoExecucao eventoHistoricoExecucao;

    @OneToMany(mappedBy = "evento", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<EventoHistoricoExecucao> eventoHistoricoExecucaoList = new ArrayList<>();

    @Override
    public Integer getId() {
        return id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataHoraUltimaExecucao() {
        return dataHoraUltimaExecucao;
    }

    public void setDataHoraUltimaExecucao(Date dataHoraUltimaExecucao) {
        this.dataHoraUltimaExecucao = dataHoraUltimaExecucao;
    }

    public BigDecimal getQuantidadeExecucao() {
        return quantidadeExecucao;
    }

    public void setQuantidadeExecucao(BigDecimal quantidadeExecucao) {
        this.quantidadeExecucao = quantidadeExecucao;
    }

    public Date getDuracaoUltimaExecucao() {
        return duracaoUltimaExecucao;
    }

    public void setDuracaoUltimaExecucao(Date duracaoUltimaExecucao) {
        this.duracaoUltimaExecucao = duracaoUltimaExecucao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public EventoHistoricoExecucao getEventoHistoricoExecucao() {
        return eventoHistoricoExecucao;
    }

    public void setEventoHistoricoExecucao(EventoHistoricoExecucao eventoHistoricoExecucao) {
        this.eventoHistoricoExecucao = eventoHistoricoExecucao;
    }

    public List<EventoHistoricoExecucao> getEventoHistoricoExecucaoList() {
        return eventoHistoricoExecucaoList;
    }

    public void setEventoHistoricoExecucaoList(List<EventoHistoricoExecucao> eventoHistoricoExecucaoList) {
        this.eventoHistoricoExecucaoList = eventoHistoricoExecucaoList;
    }

    @Override
    public String getDisplay() {
        return descricao;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final Evento other = (Evento) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

}
