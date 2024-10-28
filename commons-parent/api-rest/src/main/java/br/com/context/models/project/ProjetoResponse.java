package br.com.context.models.project;

import java.math.BigDecimal;
import java.time.LocalDate;

public class ProjetoResponse {

    private BigDecimal BigDecimalType = BigDecimal.ONE;

    private LocalDate LocalDateType = LocalDate.now();

    private String stringType = "stringType";

    private Long longType = 123456789L;

    private Integer integerType = 123456789;

    public BigDecimal getBigDecimalType() {
        return BigDecimalType;
    }

    public LocalDate getLocalDateType() {
        return LocalDateType;
    }

    public String getStringType() {
        return stringType;
    }

    public Long getLongType() {
        return longType;
    }

    public Integer getIntegerType() {
        return integerType;
    }
}
