package br.com.integration.controller.simulation.model.response;

import java.math.BigDecimal;


public class ExpenseResponse {

  private String expense;
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
