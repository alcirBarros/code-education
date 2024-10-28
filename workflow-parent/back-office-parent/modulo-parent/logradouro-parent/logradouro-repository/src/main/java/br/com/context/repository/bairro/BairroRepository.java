package br.com.context.repository.bairro;

import br.com.context.model.bairro.BairroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BairroRepository extends JpaRepository<BairroEntity, Integer> {
}
