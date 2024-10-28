package br.com.context.model;


import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "TDSV_AJUST")
public class Adjustment {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TDSV_PCELA_AJUST_SEQ")
  @SequenceGenerator(sequenceName = "SDSV_PCELA_AJUST", allocationSize = 1, name = "TDSV_PCELA_AJUST_SEQ")
  @Column(name = "ID_AJUST")
  private Long id;

  @Column(name = "NU_AJUST")
  private Long adjustmentNumber;

  @Column(name = "CD_DEPTO")
  private String department;

  @Column(name = "CD_AJUST")
  private String adjustmentCode;

  @Column(name = "CD_TPO_AJUST")
  private String adjustmentType;

  @Column(name = "VR_AJUST")
  private BigDecimal adjustmentValue;

  @Column(name = "DT_AJUST")
  private LocalDate adjustmentDate;

  @Column(name = "CD_TPO_CATAO")
  private Integer cardType;

  @Column(name = "DS_MOTVO_AJUST")
  private String reason;

  @Column(name = "CD_BANDE")
  private Integer flag;

  @Column(name = "NU_CNPJ")
  private String cnpj;

  @Column(name = "NU_EC")
  private Long ecNumber;

  @Column(name = "VR_BASE")
  private BigDecimal referenceValue;

  @Column(name = "ID_CONTR")
  private Long contractId;

  @OneToOne
  @JoinColumn(name = "ID_STTUS_PCELA_AJUST", nullable = false)
  private AdjustmentStatus status;

  @Column(name = "CD_REJEI")
  private Integer rejectionCode;

  @Column(name = "DS_MOTVO_REJEI")
  private String rejectionReason;

  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "ID_AJUST")
  private List<InstallmentAdjustment> installmentAdjustments;

  @Column(name = "IN_FILA", length=1, columnDefinition="CHAR")
  @Type(type = "org.hibernate.type.NumericBooleanType")
  private Boolean isSendToQueue;

  @Column(name = "VR_SDO")
  private BigDecimal esmeraldaBalanceValue;

  @Transient
  private Long simulationInstallmentId;

  @Transient
  private Long installmentNumber ;

  @Transient
  private Long numberOfInstallments ;

  @Column(name = "DT_HORA_INCL", nullable = false, updatable = false)
  private LocalDateTime creationDate;

  @Column(name = "DT_HORA_ALT", nullable = false)
  private LocalDateTime modificationDate;

  @Column(name = "DS_USUAR_ALT", nullable = false)
  private String modificationUser;

  @Column(name = "DS_USUAR_INCL", nullable = false, updatable = false)
  private String creationUser;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getAdjustmentNumber() {
    return adjustmentNumber;
  }

  public void setAdjustmentNumber(Long adjustmentNumber) {
    this.adjustmentNumber = adjustmentNumber;
  }

  public String getDepartment() {
    return department;
  }

  public void setDepartment(String department) {
    this.department = department;
  }

  public String getAdjustmentCode() {
    return adjustmentCode;
  }

  public void setAdjustmentCode(String adjustmentCode) {
    this.adjustmentCode = adjustmentCode;
  }

  public String getAdjustmentType() {
    return adjustmentType;
  }

  public void setAdjustmentType(String adjustmentType) {
    this.adjustmentType = adjustmentType;
  }

  public BigDecimal getAdjustmentValue() {
    return adjustmentValue;
  }

  public void setAdjustmentValue(BigDecimal adjustmentValue) {
    this.adjustmentValue = adjustmentValue;
  }

  public LocalDate getAdjustmentDate() {
    return adjustmentDate;
  }

  public void setAdjustmentDate(LocalDate adjustmentDate) {
    this.adjustmentDate = adjustmentDate;
  }

  public Integer getCardType() {
    return cardType;
  }

  public void setCardType(Integer cardType) {
    this.cardType = cardType;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public Integer getFlag() {
    return flag;
  }

  public void setFlag(Integer flag) {
    this.flag = flag;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Long getEcNumber() {
    return ecNumber;
  }

  public void setEcNumber(Long ecNumber) {
    this.ecNumber = ecNumber;
  }

  public BigDecimal getReferenceValue() {
    return referenceValue;
  }

  public void setReferenceValue(BigDecimal referenceValue) {
    this.referenceValue = referenceValue;
  }

  public Long getContractId() {
    return contractId;
  }

  public void setContractId(Long contractId) {
    this.contractId = contractId;
  }

  public AdjustmentStatus getStatus() {
    return status;
  }

  public void setStatus(AdjustmentStatus status) {
    this.status = status;
  }

  public Integer getRejectionCode() {
    return rejectionCode;
  }

  public void setRejectionCode(Integer rejectionCode) {
    this.rejectionCode = rejectionCode;
  }

  public String getRejectionReason() {
    return rejectionReason;
  }

  public void setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
  }

  public List<InstallmentAdjustment> getInstallmentAdjustments() {
    return installmentAdjustments;
  }

  public void setInstallmentAdjustments(List<InstallmentAdjustment> installmentAdjustments) {
    this.installmentAdjustments = installmentAdjustments;
  }

  public Boolean getSendToQueue() {
    return isSendToQueue;
  }

  public void setSendToQueue(Boolean sendToQueue) {
    isSendToQueue = sendToQueue;
  }

  public BigDecimal getEsmeraldaBalanceValue() {
    return esmeraldaBalanceValue;
  }

  public void setEsmeraldaBalanceValue(BigDecimal esmeraldaBalanceValue) {
    this.esmeraldaBalanceValue = esmeraldaBalanceValue;
  }

  public Long getSimulationInstallmentId() {
    return simulationInstallmentId;
  }

  public void setSimulationInstallmentId(Long simulationInstallmentId) {
    this.simulationInstallmentId = simulationInstallmentId;
  }

  public Long getInstallmentNumber() {
    return installmentNumber;
  }

  public void setInstallmentNumber(Long installmentNumber) {
    this.installmentNumber = installmentNumber;
  }

  public Long getNumberOfInstallments() {
    return numberOfInstallments;
  }

  public void setNumberOfInstallments(Long numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
  }

  public LocalDateTime getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(LocalDateTime creationDate) {
    this.creationDate = creationDate;
  }

  public LocalDateTime getModificationDate() {
    return modificationDate;
  }

  public void setModificationDate(LocalDateTime modificationDate) {
    this.modificationDate = modificationDate;
  }

  public String getModificationUser() {
    return modificationUser;
  }

  public void setModificationUser(String modificationUser) {
    this.modificationUser = modificationUser;
  }

  public String getCreationUser() {
    return creationUser;
  }

  public void setCreationUser(String creationUser) {
    this.creationUser = creationUser;
  }

  // D is Debit C is Credit
  public BigDecimal getAdjustmentValueWithSign(){
    if(getAdjustmentType().equals("D")){
      return adjustmentValue.negate();
    }
    return adjustmentValue;
  }
}
