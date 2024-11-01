package br.com.context.model.pessoa;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum PersonEntityEnum {

  ID("pss_id");

  public final String value;

}
