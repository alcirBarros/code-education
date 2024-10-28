package br.com.repository.servicoexterno;

import br.com.context.model.servicoexterno.model.ServicoExterno;
import br.com.context.model.servicoexterno.model.TipoServicoExterno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServicoExternoRepository extends JpaRepository<ServicoExterno, Integer> {

    public ServicoExterno findByTipoServicoExterno(TipoServicoExterno tipoServicoExterno);

}
