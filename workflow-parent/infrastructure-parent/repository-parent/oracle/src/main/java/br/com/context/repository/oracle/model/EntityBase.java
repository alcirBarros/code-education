package br.com.context.repository.oracle.model;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;


@MappedSuperclass
public abstract class EntityBase {

  @Column(name = "DT_HORA_INCL",
          nullable = false,
          updatable = false)
  private LocalDateTime creationDate;

  @Column(name = "DT_HORA_ALT",
          nullable = false)
  private LocalDateTime modificationDate;

  @Column(name = "DS_USUAR_ALT",
          nullable = false)
  private String modificationUser;

  @Column(name = "DS_USUAR_INCL",
          nullable = false,
          updatable = false)
  private String creationUser;

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
}
