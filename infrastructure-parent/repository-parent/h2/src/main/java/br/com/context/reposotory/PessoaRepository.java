package br.com.context.reposotory;

import br.com.context.model.Pessoa;
import br.com.context.model.PessoaPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, PessoaPk> {

}
