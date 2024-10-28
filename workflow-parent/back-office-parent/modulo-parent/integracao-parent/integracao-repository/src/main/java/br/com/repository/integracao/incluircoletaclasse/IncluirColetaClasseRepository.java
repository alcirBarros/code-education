package br.com.repository.integracao.incluircoletaclasse;

import br.com.domain.integracao.incluircoletaclasse.model.IncluirColetaClasse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IncluirColetaClasseRepository extends JpaRepository<IncluirColetaClasse, Integer> {

}
