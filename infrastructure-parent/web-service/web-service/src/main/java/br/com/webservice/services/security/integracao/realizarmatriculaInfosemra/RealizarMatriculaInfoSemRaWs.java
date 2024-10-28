package br.com.webservice.services.security.integracao.realizarmatriculaInfosemra;

import br.com.domain.integracao.realizarmatricula.model.RealizarMatriculaInfoSemRA;
import br.com.service.integracao.realizarmatriculainfosemra.RealizarMatriculaInfoSemRaService;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("private/realizarmatriculasemra")
public class RealizarMatriculaInfoSemRaWs {

    @Autowired
    private RealizarMatriculaInfoSemRaService realizarMatriculaInfoSemRaService;

    @GET
    @Path("/status")
    @Produces({MediaType.APPLICATION_JSON})
    public Response status() {
        return Response.status(200).entity("Status ---- OK").build();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response realizarMatriculaInfoSemRaPost(RealizarMatriculaInfoSemRA realizarMatriculaInfoSemRA) {
        realizarMatriculaInfoSemRA = realizarMatriculaInfoSemRaService.realizarMatriculaInfoSemRA(realizarMatriculaInfoSemRA);       
        return Response.status(200).entity(realizarMatriculaInfoSemRA).build();
    }
}
