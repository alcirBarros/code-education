
package br.com.context.model.eventoautomatico;

import br.com.context.model.evento.Evento;
import br.com.context.model.evento.StatusExecucaoEnum;
import br.com.context.model.AbstractEntidade;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import org.apache.commons.lang3.StringUtils;


@Entity
@Table(name = "eva_evento_automatico")
public class EventoAutomatico extends AbstractEntidade implements Serializable {

    private static final long serialVersionUID = -266101065075065554L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "eva_id", nullable = false)
    private Integer id;

    @Column(name = "eva_data_hora")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataHora = new Date();

    @Column(name = "eva_descricao", length = 100)
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "evt_id", referencedColumnName = "evt_id", nullable = false)
    private Evento evento;

    @Column(name = "eva_ativo")
    private Boolean ativo = Boolean.TRUE;

    @Enumerated(EnumType.STRING)
    @Column(name = "eva_tipo_repeticao_enum", length = 45)
    private TipoRepeticaoEnum tipoRepeticaoEnum = TipoRepeticaoEnum.DIARIO;

    @OneToMany(mappedBy = "eventoAutomatico", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<FrequenciaRepeticao> frequenciaRepeticaoList = new ArrayList<>();

    @Enumerated(EnumType.STRING)
    @Column(name = "eva_termino_enum", length = 45)
    private TerminoEnum terminoEnum = TerminoEnum.OCORRENCIA;

    @Column(name = "pmv_ocorrencia_termino")
    private BigDecimal ocorrenciaTermino;

    @Column(name = "eva_data_hora_termino")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date dataHoraTermino;

    @Column(name = "eva_hora_execucao")
    @Temporal(javax.persistence.TemporalType.TIME)
    private Date horaExecucao = new Date(0, 0, 0, 0, 0);

    @Column(name = "eva_proxima_execucao_date_hora")
    @Temporal(javax.persistence.TemporalType.TIMESTAMP)
    private Date proximaExecucaoDateHora;

    @Enumerated(EnumType.STRING)
    @Column(name = "eva_status_execucao_enum", length = 45)
    private StatusExecucaoEnum statusExecucaoEnum = StatusExecucaoEnum.NAO_AGENDADO;

    public EventoAutomatico() {
    }

    private static boolean conteans(List<FrequenciaRepeticao> frequenciaRepeticaoList, TipoFrequenciaEnum tipoFrequenciaEnum) {
        return frequenciaRepeticaoList.stream().filter(x -> x.getTipoFrequenciaEnum().equals(tipoFrequenciaEnum)).findFirst().isPresent();
    }

    private Function<TipoFrequenciaEnum, FrequenciaRepeticao> tipoFrequenciaEnumFunction() {
        Function<TipoFrequenciaEnum, FrequenciaRepeticao> function = (TipoFrequenciaEnum t) -> {
            FrequenciaRepeticao frequenciaRepeticao = new FrequenciaRepeticao();
            frequenciaRepeticao.setEventoAutomatico(this);
            frequenciaRepeticao.setTipoFrequenciaEnum(t);
            return frequenciaRepeticao;
        };
        return function;
    }

    private List<FrequenciaRepeticao> adicionarFrequenciaRepeticao(TipoFrequenciaEnum[] tipoFrequenciaEnumArray) {
        List<FrequenciaRepeticao> frequenciaRepeticaoList = new ArrayList<>();
        this.frequenciaRepeticaoList.stream().forEach((frequenciaRepeticao) -> {
            frequenciaRepeticaoList.add(frequenciaRepeticao);
        });

        List<FrequenciaRepeticao> list = Stream.of(tipoFrequenciaEnumArray).map(tipoFrequenciaEnumFunction()).collect(Collectors.toList());
        for (FrequenciaRepeticao frequenciaRepeticao : list) {
            if (!EventoAutomatico.conteans(frequenciaRepeticaoList, frequenciaRepeticao.getTipoFrequenciaEnum())) {
                frequenciaRepeticaoList.add(frequenciaRepeticao);
            }
        }
        return frequenciaRepeticaoList;
    }

    public void setFrequenciaRepeticaoArray(TipoFrequenciaEnum[] tipoFrequenciaEnumArray) {
        List<TipoFrequenciaEnum> tipoFrequenciaEnumList = Stream.of(tipoFrequenciaEnumArray).collect(Collectors.toList());
        List<FrequenciaRepeticao> frequenciaRepeticaoList = adicionarFrequenciaRepeticao(tipoFrequenciaEnumArray);
        this.frequenciaRepeticaoList = frequenciaRepeticaoList.stream().filter((FrequenciaRepeticao t) -> tipoFrequenciaEnumList.contains(t.getTipoFrequenciaEnum())).collect(Collectors.toList());
    }

    public TipoFrequenciaEnum[] getFrequenciaRepeticaoArray() {
        return frequenciaRepeticaoList.stream().map(x -> x.getTipoFrequenciaEnum()).toArray(TipoFrequenciaEnum[]::new);
    }

    public void terminoExecucao(TerminoEnum terminoEnum) {
        switch (terminoEnum) {
            case NUNCA: {
                this.ocorrenciaTermino = null;
                this.dataHoraTermino = null;
                break;
            }
            case OCORRENCIA: {
                this.dataHoraTermino = null;
                break;
            }
            case DATA: {
                this.ocorrenciaTermino = null;
                break;
            }
        }
    }

    public String cronBuilder() {
        LocalTime toLocalTime = toLocalTime(horaExecucao);
        String cron = null;
        switch (tipoRepeticaoEnum) {
            case MENSAL: {
                List<TipoFrequenciaEnum> tipoFrequenciaEnumList = frequenciaRepeticaoList.stream().map(x -> x.getTipoFrequenciaEnum()).collect(Collectors.toList());
                cron = createCronMes(toLocalTime.getMinute(), toLocalTime.getHour(), tipoFrequenciaEnumList);
                break;
            }
            case DIARIO: {
                List<TipoFrequenciaEnum> tipoFrequenciaEnumList = frequenciaRepeticaoList.stream().map(x -> x.getTipoFrequenciaEnum()).collect(Collectors.toList());
                List<DayOfWeek> dayOfWeekList = TipoFrequenciaEnum.converter(tipoFrequenciaEnumList);
                cron = createCronDiario(toLocalTime.getMinute(), toLocalTime.getHour(), dayOfWeekList);
                break;
            }
        }
        return cron;
    }

    private LocalTime toLocalTime(Date date) {
        Instant instant = Instant.ofEpochMilli(date.getTime());
        LocalTime res = LocalDateTime.ofInstant(instant, ZoneId.systemDefault()).toLocalTime();
        return res;
    }

    private String createCronMes(int minute, int hora, List<TipoFrequenciaEnum> tipoFrequenciaEnumList) {
        String[] toArray = tipoFrequenciaEnumList.stream().map(x -> x.getDescricao()).toArray(String[]::new);
        String join = StringUtils.join(toArray, ",");
        return String.format("0 %d %d %s * ? *", minute, hora, join);
    }

    private String createCronDiario(int minute, int hour, List<DayOfWeek> dayOfWeekList) {
        String[] toArray = dayOfWeekList.stream().map(x -> x.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase()).toArray(String[]::new);
        String join = StringUtils.join(toArray, ",");
        return String.format("0 %d %d ? * %s", minute, hour, join);
    }

    public String repetirString() {
        Stream<TipoFrequenciaEnum> sorted = frequenciaRepeticaoList.stream().map(x -> x.getTipoFrequenciaEnum()).sorted((x, y) -> Integer.compare(x.ordinal(), y.ordinal()));
        String collect = sorted.map(x -> x.getDescricao()).collect(Collectors.joining(", "));
        return collect.equals("") ? "Repetir" : collect;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public TipoRepeticaoEnum getTipoRepeticaoEnum() {
        return tipoRepeticaoEnum;
    }

    public void setTipoRepeticaoEnum(TipoRepeticaoEnum tipoRepeticaoEnum) {
        this.tipoRepeticaoEnum = tipoRepeticaoEnum;
    }

    public List<FrequenciaRepeticao> getFrequenciaRepeticaoList() {
        return frequenciaRepeticaoList;
    }

    public void setFrequenciaRepeticaoList(List<FrequenciaRepeticao> frequenciaRepeticaoList) {
        this.frequenciaRepeticaoList = frequenciaRepeticaoList;
    }

    public TerminoEnum getTerminoEnum() {
        return terminoEnum;
    }

    public void setTerminoEnum(TerminoEnum terminoEnum) {
        this.terminoEnum = terminoEnum;
    }

    public BigDecimal getOcorrenciaTermino() {
        return ocorrenciaTermino;
    }

    public void setOcorrenciaTermino(BigDecimal ocorrenciaTermino) {
        this.ocorrenciaTermino = ocorrenciaTermino;
    }

    public Date getDataHoraTermino() {
        return dataHoraTermino;
    }

    public void setDataHoraTermino(Date dataHoraTermino) {
        this.dataHoraTermino = dataHoraTermino;
    }

    public Date getHoraExecucao() {
        return horaExecucao;
    }

    public void setHoraExecucao(Date horaExecucao) {
        this.horaExecucao = horaExecucao;
    }

    public Date getProximaExecucaoDateHora() {
        return proximaExecucaoDateHora;
    }

    public void setProximaExecucaoDateHora(Date proximaExecucaoDateHora) {
        this.proximaExecucaoDateHora = proximaExecucaoDateHora;
    }

    public StatusExecucaoEnum getStatusExecucaoEnum() {
        return statusExecucaoEnum;
    }

    public void setStatusExecucaoEnum(StatusExecucaoEnum statusExecucaoEnum) {
        this.statusExecucaoEnum = statusExecucaoEnum;
    }

    
    
}
