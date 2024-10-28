package br.com.service.modulo.administracao.estabelecimeto;



import br.com.context.model.Estabelecimento;
import br.com.repository.estabelecimento.EstabelecimentoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstabelecimentoService {

    @Autowired
    private EstabelecimentoRepository instituicaoRepository;

    public List<Estabelecimento> findAll() {
        return instituicaoRepository.findAll();
    }
}
