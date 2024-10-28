package br.com.context.repository.oracle.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "TDSV_SMULA")
public class Simulation extends EntityBase {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TDSV_SMULA_SEQ")
  @SequenceGenerator(sequenceName = "SDSV_SMULA", allocationSize = 1, name = "TDSV_SMULA_SEQ")
  @Column(name = "ID_SMULA")
  private Long id;

  @Column(name = "NU_SMULA")
  private Long simulationNumber;

  @Column(name = "NU_CNPJ")
  private String cnpj;

  @Column(name = "NU_EC")
  private Long ecNumber;

  @Column(name = "ID_PSSOA_UN")
  private Long personUnitId;

  @Column(name = "VR_SMULA")
  private BigDecimal creditValue;

  @Column(name = "QT_PCELA")
  private Integer installmentsListSize;

  @Column(name = "VR_TX_SMULA",  columnDefinition = "NUMBER(5,2)")
  private Double interestRate;

  @Column(name = "DT_VCTO_PRIM_PCELA")
  private LocalDate firstInstallmentDate;

  @Column(name = "DT_VCTO_ULT_PCELA")
  private LocalDate lastInstallmentDate;

  @Column(name = "VR_MIN")
  private BigDecimal minimumValue;

  @Column(name = "QT_MIN_PCELA")
  private Integer minimumNumberOfInstallments;

  @Column(name = "NU_PPSTA")
  private Long proposalNumber;

  @Column(name = "DT_HORA_ACEIT")
  private LocalDateTime acceptanceDate;

  @Column(name = "NU_CPF_USUAR_ACEIT")
  private String acceptanceResponsable;

  @Column(name = "CD_VRSAO_TERMO_ACEIT")
  private String agreementTermVersion;

  @Column(name = "CD_TPO_SMULA")
  private String type;

  @Column(name = "DT_PREVT_EFTVC")
  private LocalDate estimateHiringDate;

  @Column(name = "DS_MOTVO_REJEI")
  private String rejectionReason;

  @Column(name = "ID_PARCR")
  private Integer partner;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getSimulationNumber() {
    return simulationNumber;
  }

  public void setSimulationNumber(Long simulationNumber) {
    this.simulationNumber = simulationNumber;
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

  public Long getPersonUnitId() {
    return personUnitId;
  }

  public void setPersonUnitId(Long personUnitId) {
    this.personUnitId = personUnitId;
  }

  public BigDecimal getCreditValue() {
    return creditValue;
  }

  public void setCreditValue(BigDecimal creditValue) {
    this.creditValue = creditValue;
  }

  public Integer getInstallmentsListSize() {
    return installmentsListSize;
  }

  public void setInstallmentsListSize(Integer installmentsListSize) {
    this.installmentsListSize = installmentsListSize;
  }

  public Double getInterestRate() {
    return interestRate;
  }

  public void setInterestRate(Double interestRate) {
    this.interestRate = interestRate;
  }

  public LocalDate getFirstInstallmentDate() {
    return firstInstallmentDate;
  }

  public void setFirstInstallmentDate(LocalDate firstInstallmentDate) {
    this.firstInstallmentDate = firstInstallmentDate;
  }

  public LocalDate getLastInstallmentDate() {
    return lastInstallmentDate;
  }

  public void setLastInstallmentDate(LocalDate lastInstallmentDate) {
    this.lastInstallmentDate = lastInstallmentDate;
  }

  public BigDecimal getMinimumValue() {
    return minimumValue;
  }

  public void setMinimumValue(BigDecimal minimumValue) {
    this.minimumValue = minimumValue;
  }

  public Integer getMinimumNumberOfInstallments() {
    return minimumNumberOfInstallments;
  }

  public void setMinimumNumberOfInstallments(Integer minimumNumberOfInstallments) {
    this.minimumNumberOfInstallments = minimumNumberOfInstallments;
  }

  public Long getProposalNumber() {
    return proposalNumber;
  }

  public void setProposalNumber(Long proposalNumber) {
    this.proposalNumber = proposalNumber;
  }

  public LocalDateTime getAcceptanceDate() {
    return acceptanceDate;
  }

  public void setAcceptanceDate(LocalDateTime acceptanceDate) {
    this.acceptanceDate = acceptanceDate;
  }

  public String getAcceptanceResponsable() {
    return acceptanceResponsable;
  }

  public void setAcceptanceResponsable(String acceptanceResponsable) {
    this.acceptanceResponsable = acceptanceResponsable;
  }

  public String getAgreementTermVersion() {
    return agreementTermVersion;
  }

  public void setAgreementTermVersion(String agreementTermVersion) {
    this.agreementTermVersion = agreementTermVersion;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LocalDate getEstimateHiringDate() {
    return estimateHiringDate;
  }

  public void setEstimateHiringDate(LocalDate estimateHiringDate) {
    this.estimateHiringDate = estimateHiringDate;
  }

  public String getRejectionReason() {
    return rejectionReason;
  }

  public void setRejectionReason(String rejectionReason) {
    this.rejectionReason = rejectionReason;
  }

  public Integer getPartner() {
    return partner;
  }

  public void setPartner(Integer partner) {
    this.partner = partner;
  }
}
