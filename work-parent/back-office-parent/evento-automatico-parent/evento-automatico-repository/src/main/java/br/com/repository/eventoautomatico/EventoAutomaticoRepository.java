package br.com.repository.eventoautomatico;

import br.com.context.model.eventoautomatico.EventoAutomatico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoAutomaticoRepository extends JpaRepository<EventoAutomatico, Integer> {

}
