package br.com.webservice.services.security.integracao.excluirmatricula;

import br.com.domain.integracao.excluirmatricula.model.ExcluirMatricula;
import br.com.service.integracao.excluirmatricula.ExcluirMatriculaService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/private/excluirmatricula")
public class ExcluirMatriculaWs {

    @Autowired
    private ExcluirMatriculaService excluirMatriculaService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultarQuadroResumoPost(ExcluirMatricula excluirMatricula) {
        excluirMatricula = excluirMatriculaService.excluirMatricula(excluirMatricula);
        return Response.status(200).entity(excluirMatricula).build();
    }

}
