package br.com.repository.perfil;

import br.com.context.model.Operador;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface OperadorRepository extends PagingAndSortingRepository<Operador, Integer> {

    Operador findByUsername(String username);
}
