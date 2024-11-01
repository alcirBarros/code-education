package br.com.service.auxiliar.turno;

import br.com.context.model.tipoturno.enumerator.TipoTurnoEnum;
import br.com.context.model.tipoturno.model.TipoTurno;
import br.com.context.repository.auxiliar.tipoturno.TipoTurnoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TipoTurnoService {

    @Autowired
    private TipoTurnoRepository tipoTurnoRepository;

    public List<TipoTurno> findAll() {
        return tipoTurnoRepository.findAll();
    }

    public TipoTurno findByCodigo(String codigo) {
        return tipoTurnoRepository.findByCodigo(codigo);
    }

    public TipoTurno findByTipoTurnoEnum(TipoTurnoEnum tipoTurnoEnum) {
        return tipoTurnoRepository.findByTipoTurnoEnum(tipoTurnoEnum);
    }
}
