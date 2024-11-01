package br.com.service.movimentacaoproduto;

import br.com.domain.movimentacaoproduto.MovimentacaoProduto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.repository.movimentacaoproduto.MovimentacaoProdutoRepository;

@Service
public class MovimentacaoProdutoService {

    @Autowired
    private MovimentacaoProdutoRepository instituicaoRepository;

    public MovimentacaoProduto save(MovimentacaoProduto instituicao) {
        return instituicaoRepository.save(instituicao);
    }

    public List<MovimentacaoProduto> findAll() {
        return instituicaoRepository.findAll();
    }
}
