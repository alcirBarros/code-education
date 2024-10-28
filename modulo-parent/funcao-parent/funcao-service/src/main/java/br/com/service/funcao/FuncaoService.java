package br.com.service.funcao;

import br.com.context.model.funcao.FuncaoEntity;
import br.com.context.model.funcao.TipoFuncaoEnum;
import br.com.context.model.Entidade;
import br.com.context.service.ControleTelaService;

import br.com.repository.funcao.FuncaoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FuncaoService implements ControleTelaService{

    @Autowired
    private FuncaoRepository funcaoRepository;

    @Override
    public Entidade findByTipoFuncaoEnum(Entidade tipoFuncaoEnum) {
        return findByTipoFuncaoEnum((TipoFuncaoEnum) tipoFuncaoEnum);
    }

    public FuncaoEntity save(FuncaoEntity instituicao) {
        return funcaoRepository.save(instituicao);
    }

    public List<FuncaoEntity> findAll() {
        return funcaoRepository.findAll();
    }

    public FuncaoEntity findByTipoFuncaoEnum(TipoFuncaoEnum tipoFuncaoEnum) {
        return funcaoRepository.findByTipoFuncaoEnum(tipoFuncaoEnum);
    }
}
