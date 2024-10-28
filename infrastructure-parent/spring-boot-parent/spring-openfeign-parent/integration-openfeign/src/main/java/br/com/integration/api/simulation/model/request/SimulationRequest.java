package br.com.integration.api.simulation.model.request;

import java.math.BigDecimal;
import java.time.LocalDate;

public class SimulationRequest {

  private String cnpj;
  private BigDecimal value;
  private Integer numberOfInstallments;
  private LocalDate firstInstallmentDate;

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }

  public Integer getNumberOfInstallments() {
    return numberOfInstallments;
  }

  public void setNumberOfInstallments(Integer numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
  }

  public LocalDate getFirstInstallmentDate() {
    return firstInstallmentDate;
  }

  public void setFirstInstallmentDate(LocalDate firstInstallmentDate) {
    this.firstInstallmentDate = firstInstallmentDate;
  }
}
