package br.com.service.modulo.administracao.operador;

import br.com.context.model.Operador;
import br.com.repository.perfil.OperadorRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;

@Service
public class OperadorService {

    @Autowired
    private OperadorRepository operadorRepository;

    public Iterable<Operador> findAll() {
        return operadorRepository.findAll();
    }

    public Page<Operador> findAll(Pageable pageable) {
        return operadorRepository.findAll(pageable);
    }

    public Operador save(Operador operador) {
        return operadorRepository.save(operador);
    }

    public Optional<Operador> findById(Integer id) {
        return operadorRepository.findById(id);
    }

    public Operador findByIdd(Integer id) {
        return operadorRepository.findById(id).orElseThrow(() -> new EntityNotFoundException());
    }

    public void deleteById(Integer id) {
        operadorRepository.deleteById(id);
    }
}
