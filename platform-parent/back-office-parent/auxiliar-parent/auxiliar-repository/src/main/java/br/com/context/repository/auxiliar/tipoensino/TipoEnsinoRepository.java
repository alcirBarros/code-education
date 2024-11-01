package br.com.context.repository.auxiliar.tipoensino;

import br.com.context.model.tipoensino.enumerator.TipoEnsinoEnum;
import br.com.context.model.tipoensino.model.TipoEnsino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoEnsinoRepository extends JpaRepository<TipoEnsino, Integer> {

    public TipoEnsino findByCodigo(String codigo);

    public TipoEnsino findByTipoEnsinoEnum(TipoEnsinoEnum tipoEnsinoEnum);

    public TipoEnsino findByDescricaoIgnoreCase(String descricao);
}
