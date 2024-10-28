package br.com.context.entity;

import br.com.context.model.ESocialEvent;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "esocial_event")
public class ESocialEventJpaEntity extends ESocialEvent {

  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "sequential_id")
  private String sequentialId;

  @Column(name = "client_id")
  private UUID clientId;

  @Column(name = "client_period_effect_id")
  private UUID clientPeriodEffectId;

  @Column(name = "client_name")
  private UUID clientName;

  @Column(name = "company_id")
  private UUID companyId;

  @Column(name = "batch_id")
  private UUID batchId;

  @Column(name = "type")
  private Integer type;

  @Column(name = "file_key")
  private String fileKey;

  @Column(name = "status")
  protected Integer status;

  @Column(name = "receipt_number")
  protected String receiptNumber;

  @Column(name = "protocol_number")
  private String protocolNumber;

//  @Column("period_effect_start")
//  private LocalDate periodEffectStart;

  @Column(name = "centralizing_client_id")
  protected UUID centralizingClientId;

  @Column(name = "contract_id")
  private UUID contractId;

  @Column(name = "contract_name")
  private String contractName;

  @Column(name = "workplace_id")
  private UUID workplaceId;

  @Column(name = "contract_period_effect_id")
  private UUID contractPeriodEffectId;

  @Column(name = "parameter_id")
  private UUID parameterId;

}
