package br.com.repository.municipio;

import br.com.context.model.MunicipioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MunicipioRepository extends JpaRepository<MunicipioEntity, Integer> {

}
