package br.com.service.modulo.administracao.instituicao;

import br.com.context.model.InstituicaoEntity;
import br.com.repository.instituicao.InstituicaoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InstituicaoService {

    @Autowired
    private InstituicaoRepository instituicaoRepository;

    public InstituicaoEntity save(InstituicaoEntity instituicaoEntity) {
        return instituicaoRepository.save(instituicaoEntity);
    }

    public List<InstituicaoEntity> findAll() {
        return instituicaoRepository.findAll();
    }
}
