package br.com.relatorio.configuracao.repository;

import br.com.relatorio.configuracao.domain.mapasondagem.model.MapaSondagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MapaSondagemRepository extends JpaRepository<MapaSondagem, Integer> {

}
