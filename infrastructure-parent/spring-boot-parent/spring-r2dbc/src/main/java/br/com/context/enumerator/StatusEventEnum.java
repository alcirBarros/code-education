package br.com.context.enumerator;

public enum StatusEventEnum {

  IN_PROCESSING(1, "IN PROCESSING"),
  PENDING(2, "PENDING");

  private final Integer idStatus;
  private final String value;

  private StatusEventEnum(Integer idStatus, String value) {
    this.idStatus = idStatus;
    this.value = value;
  }
  public Integer getIdStatus() {
    return idStatus;
  }

  public String getValue() {
    return value;
  }
}
