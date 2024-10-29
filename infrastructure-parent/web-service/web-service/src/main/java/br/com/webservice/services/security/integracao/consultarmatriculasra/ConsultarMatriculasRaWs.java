package br.com.webservice.services.security.integracao.consultarmatriculasra;

import br.com.domain.integracao.consultarmatriculasra.ConsultarMatriculasRa;
import br.com.service.integracao.consultarmatriculasra.ConsultarMatriculasRaService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/private/consultarmatriculasra")
public class ConsultarMatriculasRaWs {

    @Autowired
    private ConsultarMatriculasRaService consultarMatriculasRaService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultarMatriculasRaPost(ConsultarMatriculasRa consultarMatriculasRa) {
        consultarMatriculasRa = consultarMatriculasRaService.consultarMatriculasRa(consultarMatriculasRa);
        return Response.status(200).entity(consultarMatriculasRa).build();
    }

}
