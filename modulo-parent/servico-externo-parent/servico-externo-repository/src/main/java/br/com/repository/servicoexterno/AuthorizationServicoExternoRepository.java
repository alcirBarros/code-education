package br.com.repository.servicoexterno;

import br.com.context.model.servicoexterno.model.AuthorizationServicoExterno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorizationServicoExternoRepository extends JpaRepository<AuthorizationServicoExterno, Integer>{
    
}

