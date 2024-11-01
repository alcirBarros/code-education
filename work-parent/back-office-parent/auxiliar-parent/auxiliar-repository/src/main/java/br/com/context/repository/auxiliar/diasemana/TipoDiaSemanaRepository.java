package br.com.context.repository.auxiliar.diasemana;


import br.com.context.model.diasemana.model.TipoDiaSemana;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDiaSemanaRepository extends JpaRepository<TipoDiaSemana, Integer> {

}
