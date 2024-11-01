package br.com.repository.movimentacaoproduto;

import br.com.domain.movimentacaoproduto.MovimentacaoProduto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoProdutoRepository extends JpaRepository<MovimentacaoProduto, Integer> {

}
