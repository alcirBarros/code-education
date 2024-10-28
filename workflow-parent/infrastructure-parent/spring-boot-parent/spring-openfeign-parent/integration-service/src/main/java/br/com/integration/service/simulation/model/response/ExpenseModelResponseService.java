package br.com.integration.service.simulation.model.response;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.math.BigDecimal;

public class ExpenseModelResponseService {

  @JsonAlias("nomeDespesa")
  private String expense;

  @JsonAlias("valorDespesa")
  private BigDecimal value;

  public String getExpense() {
    return expense;
  }

  public void setExpense(String expense) {
    this.expense = expense;
  }

  public BigDecimal getValue() {
    return value;
  }

  public void setValue(BigDecimal value) {
    this.value = value;
  }
}
