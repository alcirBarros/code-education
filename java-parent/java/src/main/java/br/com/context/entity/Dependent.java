package br.com.context.entity;

import java.util.UUID;

public class Dependent implements Comparable<Dependent> {

  private UUID uuid;
  private String name;

  @Override
  public int compareTo(Dependent o) {
    return this.getUuid().compareTo(o.getUuid());
  }

  public UUID getUuid() {
    return uuid;
  }

  public void setUuid(UUID uuid) {
    this.uuid = uuid;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}
