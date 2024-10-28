package br.com.repository.initialize;

import br.com.context.model.tipoevento.enumerator.TipoEventoEnum;
import br.com.context.model.tipoevento.model.TipoEvento;
import br.com.context.model.evento.Evento;
import br.com.context.repository.auxiliar.tipoevento.TipoEventoRepository;
import br.com.repository.evento.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;

@Order(2)
@Configuration
@Profile("evento")
public class InitializeEvento implements CommandLineRunner {

    @Autowired
    private TipoEventoRepository tipoEventoRepository;
    @Autowired
    private EventoRepository eventoRepository;
    
    
    @Override
    public void run(String... args) throws Exception {
        TipoEvento tipoEvento = tipoEventoRepository.findAll().stream().filter(x -> x.getTipoEventoEnum().equals(TipoEventoEnum.E_MAIL)).findAny().get();
        Evento evento = new Evento();
        evento.setDescricao("E-MAIL");
        evento.setTipoEvento(tipoEvento);
        eventoRepository.save(evento);
        System.out.println(tipoEvento);
    }
}
