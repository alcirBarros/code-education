package br.com.webservice.services.security.integracao.realizarmatriculacomra;

import br.com.domain.integracao.realizarmatriculacomra.model.RealizarMatriculaInfoComRA;
import br.com.service.integracao.realizarmatriculacomra.RealizarMatriculaInfoComRaService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("private/realizarmatriculaInfocomra")
public class RealizarMatriculaInfoComRaWs {

    @Autowired
    private RealizarMatriculaInfoComRaService realizarMatriculaInfoComRaService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response realizarMatriculaInfoSemRaPost(RealizarMatriculaInfoComRA realizarMatriculaInfoComRA) {
        realizarMatriculaInfoComRA = realizarMatriculaInfoComRaService.realizarMatriculaInfoSemRA(realizarMatriculaInfoComRA);
        return Response.status(200).entity(realizarMatriculaInfoComRA).build();
    }

}
