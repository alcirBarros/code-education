package br.com.context.model.eventoautomatico;

import br.com.context.model.AbstractEntidade;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "frr_frequencia_repeticao")
public class FrequenciaRepeticao extends AbstractEntidade implements Serializable {

    private static final long serialVersionUID = 3231907718728240161L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "frr_id", nullable = false)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "eva_id", referencedColumnName = "eva_id", nullable = false)
    private EventoAutomatico eventoAutomatico;

    @Enumerated(EnumType.STRING)
    @Column(name = "frr_tipo_frequencia_enum", length = 45)
    private TipoFrequenciaEnum tipoFrequenciaEnum;

    public static FrequenciaRepeticao criaInstancia() {
        FrequenciaRepeticao frequenciaRepeticao = new FrequenciaRepeticao();
        return criaInstancia(frequenciaRepeticao);
    }

    public static FrequenciaRepeticao criaInstancia(FrequenciaRepeticao frequenciaRepeticao) {
        return frequenciaRepeticao;
    }

    public static FrequenciaRepeticao setNULL(FrequenciaRepeticao frequenciaRepeticao) {
        return frequenciaRepeticao;
    }

    @Override
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public EventoAutomatico getEventoAutomatico() {
        return eventoAutomatico;
    }

    public void setEventoAutomatico(EventoAutomatico eventoAutomatico) {
        this.eventoAutomatico = eventoAutomatico;
    }

    public TipoFrequenciaEnum getTipoFrequenciaEnum() {
        return tipoFrequenciaEnum;
    }

    public void setTipoFrequenciaEnum(TipoFrequenciaEnum tipoFrequenciaEnum) {
        this.tipoFrequenciaEnum = tipoFrequenciaEnum;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final FrequenciaRepeticao other = (FrequenciaRepeticao) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }
}
