package br.com.service.grupoproduto;

import br.com.context.model.grupoproduto.GrupoProduto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.repository.grupoproduto.GrupoProdutoRepository;

@Service
public class GrupoProdutoService {

    @Autowired
    private GrupoProdutoRepository grupoProdutoRepository;

    public GrupoProduto save(GrupoProduto grupoProduto) {
        return grupoProdutoRepository.save(grupoProduto);
    }

    public List<GrupoProduto> findAll() {
        return grupoProdutoRepository.findAll();
    }
}
