package br.com.repository.grupoproduto;

import br.com.context.model.grupoproduto.GrupoProduto;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GrupoProdutoRepository extends JpaRepository<GrupoProduto, Integer> {

}
