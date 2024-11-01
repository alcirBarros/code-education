package br.com.context.repository.auxiliar.tipodadoclinico;

import br.com.context.model.tipodadoclinico.model.TipoDadoClinico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoDadoClinicoRepository extends JpaRepository<TipoDadoClinico, Integer> {

    public TipoDadoClinico findByDescricaoIgnoreCase(String descricao);
}
