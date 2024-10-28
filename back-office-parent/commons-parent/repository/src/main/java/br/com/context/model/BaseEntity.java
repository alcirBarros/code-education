package br.com.context.model;

import br.com.context.enumerator.TypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Comment;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "base_entity")
public class BaseEntity {

    @Id
    @Comment("uuid")
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "uuidType", updatable = false, unique = true, nullable = false)
    private UUID uuid;

    @Comment("stringType")
    @Column(name = "stringType")
    private String stringType;

    @Comment("integerType")
    @Column(name = "integerType")
    private Integer integerType;

    @Comment("bigIntegerType")
    @Column(name = "bigIntegerType")
    private BigInteger bigIntegerType;

    @Comment("bigDecimalType")
    @Column(name = "bigDecimalType")
    private BigDecimal bigDecimalType;

    @Comment("booleanType")
    @Column(name = "booleanType")
    private Boolean booleanType;

    @Comment("longType")
    @Column(name = "longType")
    private Long longType;

    @Comment("dateType")
    @Column(name = "dateType")
    private Date dateType;

    @Temporal(TemporalType.DATE)
    private Date temporalDateType;

    @Temporal(TemporalType.TIME)
    private Date temporalTimeType;

    @Temporal(TemporalType.TIMESTAMP)
    private Date temporalTimeStampType;

    @Comment("localDateType")
    @Column(name = "localDateType")
    private LocalDate localDateType;

    @Comment("localDateTimeType")
    @Column(name = "localDateTimeType")
    private LocalDateTime localDateTimeType;

    @Enumerated(EnumType.STRING)
    @Column(name = "tpe_enum")
    private TypeEnum typeEnum;

}
