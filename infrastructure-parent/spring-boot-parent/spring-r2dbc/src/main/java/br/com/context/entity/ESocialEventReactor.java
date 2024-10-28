package br.com.context.entity;

import br.com.context.model.ESocialEvent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Getter
@Setter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "esocial_event")
public class ESocialEventReactor extends ESocialEvent {

  @Id
  @Column(value = "id")
  private Long id;

  @CreatedDate
  @Column("create_date")
  protected LocalDateTime created;

  @LastModifiedDate
  @Column("changed")
  protected LocalDateTime changed;

  @Column(value = "client_id")
  private UUID clientId;

  @Column(value = "company_id")
  private UUID companyId;

  @Column(value = "type")
  private Integer type;

  @Column(value = "status")
  protected Integer status;

  @Column("period_effect")
  private LocalDate periodEffect;

  @Column("event_code")
  protected Integer eventCode;

}
