package br.com.webservice.services.security.integracao.incluircoletaclasse;

import br.com.domain.integracao.incluircoletaclasse.model.IncluirColetaClasse;
import br.com.service.integracao.incluircoletaclasse.IncluirColetaClasseService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@Path("/private/incluircoletaclasse")
public class IncluirColetaClasseWs {

    @Autowired
    private IncluirColetaClasseService incluirColetaClasseService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultarfichaAlunoPost(IncluirColetaClasse incluirColetaClasse) {
        incluirColetaClasse = incluirColetaClasseService.incluirColetaClasse(incluirColetaClasse);
        return Response.status(HttpStatus.OK.value()).entity(incluirColetaClasse).build();
    }

}
