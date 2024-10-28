package br.com.webservice.services.security.integracao.alterarcoletaclasse;

import br.com.domain.integracao.alterarcoletaclasse.model.AlterarColetaClasse;
import br.com.service.integracao.alterarcoletaclasse.AlterarColetaClasseService;
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
@Path("/private/alterarcoletaclasse")
public class AlterarColetaClasseWs {

    @Autowired
    private AlterarColetaClasseService alterarColetaClasseService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultarfichaAlunoPost(AlterarColetaClasse alterarColetaClasse) {
        alterarColetaClasse = alterarColetaClasseService.alterarColetaClasse(alterarColetaClasse);
        return Response.status(HttpStatus.OK.value()).entity(alterarColetaClasse).build();
    }

}
