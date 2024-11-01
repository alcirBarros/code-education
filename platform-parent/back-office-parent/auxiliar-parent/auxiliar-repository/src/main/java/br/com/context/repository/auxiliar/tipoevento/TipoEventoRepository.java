package br.com.context.repository.auxiliar.tipoevento;

import br.com.context.model.tipoevento.model.TipoEvento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEventoRepository extends JpaRepository<TipoEvento, Integer> {
}
