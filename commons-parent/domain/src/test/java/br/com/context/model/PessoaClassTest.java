package br.com.context.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PessoaClassTest {

    private String nome;
    private String cpf;

}
