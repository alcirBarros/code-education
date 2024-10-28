package br.com.service.perfil;

import br.com.context.model.PerfilEntity;
import br.com.repository.perfil.PerfilRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PerfilService {

    @Autowired
    private PerfilRepository perfilRepository;

    public Iterable<PerfilEntity> findAll() {
        return perfilRepository.findAll();
    }

    public Page<PerfilEntity> findAll(Pageable pageable) {
        return perfilRepository.findAll(pageable);
    }

    public PerfilEntity save(PerfilEntity perfil) {
        return perfilRepository.save(perfil);
    }

    public Optional<PerfilEntity> findById(Integer id) {
        return perfilRepository.findById(id);
    }

    public void deleteById(Integer id) {
        perfilRepository.deleteById(id);
    }
}
