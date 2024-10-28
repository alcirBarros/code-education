package br.com.context.repository.auxiliar.tipogrupoanamnese;

import br.com.context.model.tipogrupoanamnese.enumerator.TipoGrupoAnamneseEnum;
import br.com.context.model.tipogrupoanamnese.model.TipoGrupoAnamnese;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoGrupoAnamnseRepository extends JpaRepository<TipoGrupoAnamnese, Integer> {

    public TipoGrupoAnamnese findByTipoGrupoAnamneseEnum(TipoGrupoAnamneseEnum tipoGrupoAnamneseEnum);

    public TipoGrupoAnamnese findByDescricaoIgnoreCase(String descricao);
}
