package br.com.integration.api.simulation.model.response;

import java.math.BigDecimal;
import java.time.LocalDate;

public class InstallmentResponse {

  private LocalDate date;
  private BigDecimal replacementValue;
  private BigDecimal additionalChargeAmount;
  private BigDecimal debitBalance;
  private BigDecimal installmentValue;

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public BigDecimal getReplacementValue() {
    return replacementValue;
  }

  public void setReplacementValue(BigDecimal replacementValue) {
    this.replacementValue = replacementValue;
  }

  public BigDecimal getAdditionalChargeAmount() {
    return additionalChargeAmount;
  }

  public void setAdditionalChargeAmount(BigDecimal additionalChargeAmount) {
    this.additionalChargeAmount = additionalChargeAmount;
  }

  public BigDecimal getDebitBalance() {
    return debitBalance;
  }

  public void setDebitBalance(BigDecimal debitBalance) {
    this.debitBalance = debitBalance;
  }

  public BigDecimal getInstallmentValue() {
    return installmentValue;
  }

  public void setInstallmentValue(BigDecimal installmentValue) {
    this.installmentValue = installmentValue;
  }
}
