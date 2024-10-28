package br.com.context.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TDSV_PCELA_AJUST")
public class InstallmentAdjustment {

  @EmbeddedId
  private InstallmentAdjustmentPK id;

  public InstallmentAdjustmentPK getId() {
    return id;
  }

  public void setId(InstallmentAdjustmentPK id) {
    this.id = id;
  }
}
