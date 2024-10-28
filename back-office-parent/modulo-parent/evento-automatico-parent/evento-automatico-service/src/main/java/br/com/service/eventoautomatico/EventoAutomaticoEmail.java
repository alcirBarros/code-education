package br.com.service.eventoautomatico;


import br.com.context.model.tipoevento.enumerator.IEventoAutomaticoEmail;
import org.springframework.stereotype.Component;


@Component
public class EventoAutomaticoEmail implements IEventoAutomaticoEmail {

    @Override
    public void evento(Object eventoAutomatico) throws Exception {

    }
}
