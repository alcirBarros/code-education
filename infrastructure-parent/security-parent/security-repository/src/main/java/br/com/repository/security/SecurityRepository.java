package br.com.repository.security;

import br.com.domain.Operador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SecurityRepository extends JpaRepository<Operador, Integer> {

    public Operador findByUsername(String username);
}
