package br.com.repository.funcao;

import br.com.context.model.funcao.FuncaoEntity;
import br.com.context.model.funcao.TipoFuncaoEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FuncaoRepository extends JpaRepository<FuncaoEntity, Integer> {

    public FuncaoEntity findByTipoFuncaoEnum(TipoFuncaoEnum tipoFuncaoEnum);

}
