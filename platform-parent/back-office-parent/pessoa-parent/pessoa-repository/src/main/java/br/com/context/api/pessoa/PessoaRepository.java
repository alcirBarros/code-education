package br.com.context.api.pessoa;

import br.com.context.model.pessoa.PessoaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

interface PessoaRepository extends JpaRepository<PessoaEntity, UUID> {

}
