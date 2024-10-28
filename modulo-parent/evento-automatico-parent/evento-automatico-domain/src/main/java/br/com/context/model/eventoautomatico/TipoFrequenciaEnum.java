package br.com.context.model.eventoautomatico;

import br.com.context.model.Entidade;
import java.io.Serializable;
import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public enum TipoFrequenciaEnum implements Entidade, EnumInterface {

    DIARIA_DOMINGO(TipoRepeticaoEnum.DIARIO, "Domingo", 1),
    DIARIA_SEGUNDA(TipoRepeticaoEnum.DIARIO, "Segunda", 2),
    DIARIA_TERCA(TipoRepeticaoEnum.DIARIO, "Terça", 3),
    DIARIA_QUARTA(TipoRepeticaoEnum.DIARIO, "Quarta", 4),
    DIARIA_QUINTA(TipoRepeticaoEnum.DIARIO, "Quinta", 5),
    DIARIA_SEXTA(TipoRepeticaoEnum.DIARIO, "Sexta", 6),
    DIARIA_SABADO(TipoRepeticaoEnum.DIARIO, "Sábado", 7),
    //---------------

    //    PRIMEIRO_DIA_DO_MES(TipoRepeticaoEnum.MENSAL, "Primeiro dia do mês"),
    //    UlTILMO_DIA_DO_MES(TipoRepeticaoEnum.MENSAL, "Último dia do mês"),
    //    PRIMEIRO_DIA_UTIL_MES(TipoRepeticaoEnum.MENSAL, "Primeiro dia útil do mês"),
    //    ULTIMO_DIA_UTIL_MES(TipoRepeticaoEnum.MENSAL, "Último dia útil do mês"),
    DIA_1(TipoRepeticaoEnum.MENSAL, "1", 1),
    DIA_2(TipoRepeticaoEnum.MENSAL, "2", 2),
    DIA_3(TipoRepeticaoEnum.MENSAL, "3", 3),
    DIA_4(TipoRepeticaoEnum.MENSAL, "4", 4),
    DIA_5(TipoRepeticaoEnum.MENSAL, "5", 5),
    DIA_6(TipoRepeticaoEnum.MENSAL, "6", 6),
    DIA_7(TipoRepeticaoEnum.MENSAL, "7", 7),
    DIA_8(TipoRepeticaoEnum.MENSAL, "8", 8),
    DIA_9(TipoRepeticaoEnum.MENSAL, "9", 9),
    DIA_10(TipoRepeticaoEnum.MENSAL, "10", 10),
    DIA_11(TipoRepeticaoEnum.MENSAL, "11", 11),
    DIA_12(TipoRepeticaoEnum.MENSAL, "12", 12),
    DIA_13(TipoRepeticaoEnum.MENSAL, "13", 13),
    DIA_14(TipoRepeticaoEnum.MENSAL, "14", 14),
    DIA_15(TipoRepeticaoEnum.MENSAL, "15", 15),
    DIA_16(TipoRepeticaoEnum.MENSAL, "16", 16),
    DIA_17(TipoRepeticaoEnum.MENSAL, "17", 17),
    DIA_18(TipoRepeticaoEnum.MENSAL, "18", 18),
    DIA_19(TipoRepeticaoEnum.MENSAL, "19", 19),
    DIA_20(TipoRepeticaoEnum.MENSAL, "20", 20),
    DIA_21(TipoRepeticaoEnum.MENSAL, "21", 21),
    DIA_22(TipoRepeticaoEnum.MENSAL, "22", 22),
    DIA_23(TipoRepeticaoEnum.MENSAL, "23", 23),
    DIA_24(TipoRepeticaoEnum.MENSAL, "24", 24),
    DIA_25(TipoRepeticaoEnum.MENSAL, "25", 25),
    DIA_26(TipoRepeticaoEnum.MENSAL, "26", 26),
    DIA_27(TipoRepeticaoEnum.MENSAL, "27", 27),
    DIA_28(TipoRepeticaoEnum.MENSAL, "28", 28),
    DIA_29(TipoRepeticaoEnum.MENSAL, "29", 29),
    DIA_30(TipoRepeticaoEnum.MENSAL, "30", 30),
    DIA_31(TipoRepeticaoEnum.MENSAL, "31", 31);

    private final String descricao;
    private final TipoRepeticaoEnum tipoRepeticaoEnum;
    private final Integer orderBy;

    private TipoFrequenciaEnum(TipoRepeticaoEnum tipoFrequenciaRepeticaoEnum, String descricao, Integer orderBy) {
        this.tipoRepeticaoEnum = tipoFrequenciaRepeticaoEnum;
        this.descricao = descricao;
        this.orderBy = orderBy;
    }

    public static List<DayOfWeek> converter(List<TipoFrequenciaEnum> frequenciaRepeticaoList) {
        List<DayOfWeek> list = new ArrayList<>();
        for (TipoFrequenciaEnum frequenciaRepeticao : frequenciaRepeticaoList) {
            switch (frequenciaRepeticao) {
                case DIARIA_DOMINGO: {
                    list.add(DayOfWeek.SUNDAY);
                    break;
                }
                case DIARIA_SEGUNDA: {
                    list.add(DayOfWeek.MONDAY);
                    break;
                }
                case DIARIA_TERCA: {
                    list.add(DayOfWeek.TUESDAY);
                    break;
                }
                case DIARIA_QUARTA: {
                    list.add(DayOfWeek.WEDNESDAY);
                    break;
                }
                case DIARIA_QUINTA: {
                    list.add(DayOfWeek.THURSDAY);
                    break;
                }
                case DIARIA_SEXTA: {
                    list.add(DayOfWeek.FRIDAY);
                    break;
                }
                case DIARIA_SABADO: {
                    list.add(DayOfWeek.SATURDAY);
                    break;
                }
            }
        }
        return list;
    }

    public static TipoFrequenciaEnum[] values(TipoRepeticaoEnum tipoRepeticaoEnum) {
        Predicate<TipoFrequenciaEnum> predicate = (TipoFrequenciaEnum tipoFrequenciaEnum) -> tipoFrequenciaEnum.getTipoRepeticaoEnum().equals(tipoRepeticaoEnum);
        return Stream.of(TipoFrequenciaEnum.values()).filter(predicate).toArray(TipoFrequenciaEnum[]::new);
    }

    @Override
    public String getValue() {
        return this.name();
    }

    @Override
    public String getDescricao() {
        return descricao;
    }
    
    @Override
    public int getRandomId() {
        return this.ordinal();
    }

    @Override
    public Serializable getId() {
        return this.name();
    }

    @Override
    public String getDisplay() {
        return this.descricao;
    }

    @Override
    public Serializable getOrderBy() {
        return orderBy;
    }

    public TipoRepeticaoEnum getTipoRepeticaoEnum() {
        return tipoRepeticaoEnum;
    }

}
