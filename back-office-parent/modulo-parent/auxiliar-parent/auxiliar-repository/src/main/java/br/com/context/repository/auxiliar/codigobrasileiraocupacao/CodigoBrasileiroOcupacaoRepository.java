package br.com.context.repository.auxiliar.codigobrasileiraocupacao;


import br.com.context.model.codigobrasileiraocupacao.model.CodigoBrasileiroOcupacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CodigoBrasileiroOcupacaoRepository extends JpaRepository<CodigoBrasileiroOcupacao, Integer> {

}
