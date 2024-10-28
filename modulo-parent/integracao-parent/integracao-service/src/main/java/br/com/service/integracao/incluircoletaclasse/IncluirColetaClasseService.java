package br.com.service.integracao.incluircoletaclasse;

import br.com.domain.Operador;
import br.com.domain.integracao.incluircoletaclasse.model.IncluirColetaClasse;
import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
import br.com.soap.modulo.integration.incluircoletaclasse.service.IncluirColetaClasseSoap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import br.com.projeto.security.OperadorLogado;
import br.com.repository.integracao.incluircoletaclasse.IncluirColetaClasseRepository;
import java.util.List;

@Configuration
public class IncluirColetaClasseService {

    @Autowired(required = false)
    private OperadorLogado operadorLogado;
    @Autowired
    private IncluirColetaClasseSoap incluirColetaClasseSoap;
    @Autowired
    private IncluirColetaClasseRepository incluirColetaClasseRepository;

    public List<IncluirColetaClasse> findAll() {
         return incluirColetaClasseRepository.findAll();
    }

    public IncluirColetaClasse incluirColetaClasse(IncluirColetaClasse consultarFichaAluno) {
        Operador operador = (Operador) operadorLogado.getUser();
        AuthorizationServicoExterno authorizationServicoExterno = operador.getAcessoAtivo().getVinculoProfissional().getAuthorizationServicoExterno();
        consultarFichaAluno = incluirColetaClasseSoap.incluirColetaClasse(consultarFichaAluno, authorizationServicoExterno);
        return incluirColetaClasseRepository.save(consultarFichaAluno);
    }
}
