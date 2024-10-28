package br.com.webservice.services.security.integracao.consultarcoletaclasse;

import br.com.domain.integracao.consultarcoletaclasse.model.ConsultarColetaClasse;
import br.com.service.integracao.consultarcoletaclasse.ConsultarColetaClasseService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/private/consultarcoletaclasse")
public class ConsultarColetaClasseWs {

    @Autowired
    private ConsultarColetaClasseService consultarColetaClasseService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultarfichaAlunoPost(ConsultarColetaClasse consultarColetaClasse) {
        consultarColetaClasse = consultarColetaClasseService.consultarColetaClasse(consultarColetaClasse);
        return Response.status(200).entity(consultarColetaClasse).build();
    }

}
