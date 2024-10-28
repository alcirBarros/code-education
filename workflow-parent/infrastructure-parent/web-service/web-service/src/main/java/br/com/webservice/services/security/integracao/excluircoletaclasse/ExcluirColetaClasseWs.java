package br.com.webservice.services.security.integracao.excluircoletaclasse;

import br.com.domain.integracao.excluircoletaclasse.model.ExcluirColetaClasse;
import br.com.service.integracao.excluircoletaclasse.ExcluirColetaClasseService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/private/excluircoletaclasse")
public class ExcluirColetaClasseWs {

    @Autowired
    private ExcluirColetaClasseService excluirColetaClasseService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultarQuadroResumoPost(ExcluirColetaClasse excluirColetaClasse) {
        excluirColetaClasse = excluirColetaClasseService.excluirColetaClasse(excluirColetaClasse);
        return Response.status(200).entity(excluirColetaClasse).build();
    }

}
