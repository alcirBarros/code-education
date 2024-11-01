package br.com.context.repository.auxiliar.estadocivil;

import br.com.context.model.estadocivil.model.TipoEstadoCivil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEstadoCivilRepository extends JpaRepository<TipoEstadoCivil, Integer> {

}
