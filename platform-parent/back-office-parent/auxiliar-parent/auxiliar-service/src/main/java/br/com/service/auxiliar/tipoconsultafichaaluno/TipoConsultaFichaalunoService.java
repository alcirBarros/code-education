package br.com.service.auxiliar.tipoconsultafichaaluno;

import br.com.context.model.tipoconsultafichaaluno.TipoConsultaFichaAluno;
import br.com.context.repository.auxiliar.tipoconsultafichaaluno.TipoConsultaFichaAlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class TipoConsultaFichaalunoService {

    @Autowired
    private TipoConsultaFichaAlunoRepository tipoConsultaFichaAlunoRepository;

    public List<TipoConsultaFichaAluno> findAll() {
        return tipoConsultaFichaAlunoRepository.findAll();
    }

}
