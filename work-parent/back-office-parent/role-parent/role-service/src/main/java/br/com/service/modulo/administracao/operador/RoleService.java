package br.com.service.modulo.administracao.operador;

import br.com.context.model.Role;
import br.com.repository.perfil.RoleRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    public Iterable<Role> findAll() {
        return roleRepository.findAll();
    }

    public Page<Role> findAll(Pageable pageable) {
        return roleRepository.findAll(pageable);
    }

    public Role save(Role operador) {
        return roleRepository.save(operador);
    }

    public Optional<Role> findById(Integer id) {
        return roleRepository.findById(id);
    }

    public void deleteById(Integer id) {
        roleRepository.deleteById(id);
    }
}
