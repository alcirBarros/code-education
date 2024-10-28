package br.com.service.evento;

import br.com.context.model.evento.Evento;
import br.com.repository.evento.EventoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public Evento save(Evento evento) {
        return eventoRepository.save(evento);
    }

    public List<Evento> findAll() {
        return eventoRepository.findAll();
    }
}