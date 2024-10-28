package br.com.context.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class InstallmentAdjustmentPK implements Serializable {

  @Column(name = "ID_SMULA_PCELA")
  private Long simulationInstallmentId;

  @ManyToOne
  @JoinColumn(name = "ID_AJUST")
  private Adjustment adjustment;

  public Long getSimulationInstallmentId() {
    return simulationInstallmentId;
  }

  public void setSimulationInstallmentId(Long simulationInstallmentId) {
    this.simulationInstallmentId = simulationInstallmentId;
  }

  public Adjustment getAdjustment() {
    return adjustment;
  }

  public void setAdjustment(Adjustment adjustment) {
    this.adjustment = adjustment;
  }
}
