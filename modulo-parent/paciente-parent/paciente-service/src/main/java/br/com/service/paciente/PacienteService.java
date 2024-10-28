package br.com.service.paciente;

import br.com.domain.paciente.Paciente;
import br.com.domain.pessoa.Pessoa;
import br.com.repository.paciente.PacienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente save(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> findAll() {
        return pacienteRepository.findAll();
    }

    public Paciente converter(Pessoa pessoa) {
        Integer id = pessoa.getId();
        try {
            pacienteRepository.converter(id);
        } catch (Exception e) {
        }
        return pacienteRepository.findById(id).get();
    }
}
