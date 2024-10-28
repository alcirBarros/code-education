package br.com.context.model;

import br.com.context.type.AdjustmentStatusEnum;

import javax.persistence.*;

@Entity
@Table(name = "TDSV_STTUS_PCELA_AJUST")
public class AdjustmentStatus {

  @Id
  @Column(name = "ID_STTUS_PCELA_AJUST")
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(name = "DS_STTUS_PCELA_AJUST")
  private AdjustmentStatusEnum description;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AdjustmentStatusEnum getDescription() {
    return description;
  }

  public void setDescription(AdjustmentStatusEnum description) {
    this.description = description;
  }
}
