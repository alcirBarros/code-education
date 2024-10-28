package br.com.repository.instituicao;

import br.com.context.model.InstituicaoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InstituicaoRepository extends JpaRepository<InstituicaoEntity, Integer> {

}
