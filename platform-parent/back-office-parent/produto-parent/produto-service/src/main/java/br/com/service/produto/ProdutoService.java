package br.com.service.produto;

import br.com.domain.produto.Produto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.repository.produto.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

    public Produto save(Produto instituicao) {
        return produtoRepository.save(instituicao);
    }

    public List<Produto> findAll() {
        return produtoRepository.findAll();
    }
}
