package br.com.context.repository.auxiliar.tipoconsultafichaaluno;

import br.com.context.model.tipoconsultafichaaluno.TipoConsultaFichaAluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoConsultaFichaAlunoRepository extends JpaRepository<TipoConsultaFichaAluno, Integer> {
}
