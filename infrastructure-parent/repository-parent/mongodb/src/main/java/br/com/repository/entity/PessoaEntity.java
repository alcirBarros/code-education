package br.com.repository.entity;

import org.springframework.data.annotation.Id;

public class PessoaEntity {

    @Id
    private Integer id;

    private String nome;
}
