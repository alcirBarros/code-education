package br.com.context.repository.endereco;

import br.com.context.model.endereco.EnderecoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<EnderecoEntity, Integer> {

}
