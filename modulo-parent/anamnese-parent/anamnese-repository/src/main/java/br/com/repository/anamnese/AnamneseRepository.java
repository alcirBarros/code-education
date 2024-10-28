package br.com.repository.anamnese;

import br.com.context.model.pessoa.AnamneseEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AnamneseRepository extends JpaRepository<AnamneseEntity, Integer> {

}
