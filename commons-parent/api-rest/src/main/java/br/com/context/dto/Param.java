package br.com.context.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Getter
@Setter
public class Param {

  private String key1;
  private String key2;
  private String key3;
  @CPF
  private String key4;

}
