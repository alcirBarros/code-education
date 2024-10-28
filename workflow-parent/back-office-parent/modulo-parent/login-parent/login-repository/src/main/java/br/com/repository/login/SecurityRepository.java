package br.com.repository.login;

import br.com.context.model.Operador;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityRepository extends JpaRepository<Operador, Integer> {

    Optional<Operador> findByUsername(String username);
}
