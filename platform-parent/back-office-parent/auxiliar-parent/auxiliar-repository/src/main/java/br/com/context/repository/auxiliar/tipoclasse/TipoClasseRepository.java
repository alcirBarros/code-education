package br.com.context.repository.auxiliar.tipoclasse;

import br.com.context.model.tipoclasse.model.TipoClasse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoClasseRepository extends JpaRepository<TipoClasse, Integer> {
}
