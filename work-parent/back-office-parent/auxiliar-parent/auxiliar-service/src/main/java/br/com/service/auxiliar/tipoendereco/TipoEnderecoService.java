package br.com.service.auxiliar.tipoendereco;

import br.com.context.model.tipoendereco.enumerator.TipoEnderecoEnum;
import br.com.context.model.tipoendereco.model.TipoEndereco;
import br.com.context.repository.auxiliar.tipoendereco.TipoEnderecoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TipoEnderecoService {

    @Autowired
    private TipoEnderecoRepository tipoEnderecoRepository;

    public List<TipoEndereco> findAll() {
        return tipoEnderecoRepository.findAll();
    }

    public TipoEndereco findByTipoEnderecoEnum(TipoEnderecoEnum tipoEnderecoEnum) {
        return tipoEnderecoRepository.findByTipoEnderecoEnum(tipoEnderecoEnum);
    }
}
