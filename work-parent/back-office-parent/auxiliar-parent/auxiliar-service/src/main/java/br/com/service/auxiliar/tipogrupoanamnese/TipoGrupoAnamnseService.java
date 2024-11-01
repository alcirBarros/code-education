package br.com.service.auxiliar.tipogrupoanamnese;

import br.com.context.model.tipogrupoanamnese.enumerator.TipoGrupoAnamneseEnum;
import br.com.context.model.tipogrupoanamnese.model.TipoGrupoAnamnese;
import br.com.context.repository.auxiliar.tipogrupoanamnese.TipoGrupoAnamnseRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoGrupoAnamnseService {

    @Autowired
    private TipoGrupoAnamnseRepository tipoGrupoAnamnseRepository;

    public List<TipoGrupoAnamnese> findAll() {
        return tipoGrupoAnamnseRepository.findAll();
    }

    public TipoGrupoAnamnese findByTipoGrupoAnamneseEnum(TipoGrupoAnamneseEnum tipoGrupoAnamneseEnum) {
        return tipoGrupoAnamnseRepository.findByTipoGrupoAnamneseEnum(tipoGrupoAnamneseEnum);
    }

    public TipoGrupoAnamnese findByDescricaoIgnoreCase(String descricao) {
        return tipoGrupoAnamnseRepository.findByDescricaoIgnoreCase(descricao);
    }
}
