package br.com.context.repository.auxiliar.tiposexo;

import br.com.context.model.tiposexo.enumerator.TipoSexoEnum;
import br.com.context.model.tiposexo.model.TipoSexo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoSexoRepository extends JpaRepository<TipoSexo, Integer> {

    public TipoSexo findByTipoSexoEnum(TipoSexoEnum tipoSexoEnum);

}
