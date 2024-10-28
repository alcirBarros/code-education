package br.com.context.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

public class Privilege {

    @JsonProperty(value = "integerType")
    private Integer integerType;

    @JsonProperty(value = "bigIntegerType")
    private BigInteger BigIntegerType;

    @JsonProperty(value = "bigDecimalType")
    private BigDecimal bigDecimalType;

    @JsonProperty(value = "stringType")
    private String stringType;

    @JsonProperty(value = "booleanType")
    private Boolean booleanType;

    @JsonProperty(value = "longType")
    private Long longType;

    @JsonProperty(value = "dateType")
    private Date dateType;

    public Integer getIntegerType() {
        return integerType;
    }

    public void setIntegerType(Integer integerType) {
        this.integerType = integerType;
    }

    public BigInteger getBigIntegerType() {
        return BigIntegerType;
    }

    public void setBigIntegerType(BigInteger bigIntegerType) {
        BigIntegerType = bigIntegerType;
    }

    public BigDecimal getBigDecimalType() {
        return bigDecimalType;
    }

    public void setBigDecimalType(BigDecimal bigDecimalType) {
        this.bigDecimalType = bigDecimalType;
    }

    public String getStringType() {
        return stringType;
    }

    public void setStringType(String stringType) {
        this.stringType = stringType;
    }

    public Boolean getBooleanType() {
        return booleanType;
    }

    public void setBooleanType(Boolean booleanType) {
        this.booleanType = booleanType;
    }

    public Long getLongType() {
        return longType;
    }

    public void setLongType(Long longType) {
        this.longType = longType;
    }

    public Date getDateType() {
        return dateType;
    }

    public void setDateType(Date dateType) {
        this.dateType = dateType;
    }
}
