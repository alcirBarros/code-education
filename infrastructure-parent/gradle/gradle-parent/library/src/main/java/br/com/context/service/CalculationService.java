package br.com.context.service;

import org.springframework.stereotype.Service;

@Service
public class CalculationService {

  public Integer sum(Integer a, Integer b) {
    return a + b;
  }
}
