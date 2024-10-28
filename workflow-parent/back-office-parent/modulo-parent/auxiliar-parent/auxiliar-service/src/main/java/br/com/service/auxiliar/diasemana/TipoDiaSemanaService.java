package br.com.service.auxiliar.diasemana;

import br.com.context.model.diasemana.model.TipoDiaSemana;
import br.com.context.repository.auxiliar.diasemana.TipoDiaSemanaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TipoDiaSemanaService {

    @Autowired
    private TipoDiaSemanaRepository tipoDiaSemanaRepository;

    public List<TipoDiaSemana> findAll() {
        return tipoDiaSemanaRepository.findAll();
    }
}