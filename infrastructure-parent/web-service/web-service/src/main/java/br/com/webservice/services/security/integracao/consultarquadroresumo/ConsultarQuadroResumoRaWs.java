package br.com.webservice.services.security.integracao.consultarquadroresumo;

import br.com.domain.integracao.consultarquadroresumo.ConsultarQuadroResumo;
import br.com.service.integracao.consultarquadroresumo.ConsultarQuadroResumoService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/private/consultarquadroresumo")
public class ConsultarQuadroResumoRaWs {

    @Autowired
    private ConsultarQuadroResumoService consultarQuadroResumoService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultarQuadroResumoPost(ConsultarQuadroResumo consultarQuadroResumo) {
        consultarQuadroResumo = consultarQuadroResumoService.consultarQuadroResumo(consultarQuadroResumo);
        return Response.status(200).entity(consultarQuadroResumo).build();
    }

}
