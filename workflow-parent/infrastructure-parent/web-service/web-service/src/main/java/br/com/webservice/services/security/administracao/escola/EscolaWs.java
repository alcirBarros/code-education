package br.com.webservice.services.security.administracao.escola;

import br.com.domain.AcessoAtivo;
import br.com.domain.Escola;
import br.com.domain.Municipio;
import br.com.domain.Operador;
import br.com.projeto.security.OperadorLogado;

import br.com.service.modulo.administracao.escola.EscolaService;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("private/escola")
public class EscolaWs {

    @Autowired
    private EscolaService escolaService;
    @Autowired
    private OperadorLogado operadorLogado;

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response get() {
        Operador operador = (Operador) operadorLogado.getUser();
        AcessoAtivo acessoAtivo = operador.getAcessoAtivo();
        Municipio municipio = acessoAtivo.getVinculoProfissional().getMunicipio();
        List<Escola> escolaList = escolaService.findByMunicipio(municipio);
        return Response.status(200).entity(escolaList).build();
    }
}
