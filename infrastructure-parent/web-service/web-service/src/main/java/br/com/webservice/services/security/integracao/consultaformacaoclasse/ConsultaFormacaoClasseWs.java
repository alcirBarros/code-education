package br.com.webservice.services.security.integracao.consultaformacaoclasse;

import br.com.domain.integracao.consultaformacaoclasse.ConsultaFormacaoClasse;
import br.com.service.integracao.consultaformacaoclasse.ConsultaFormacaoClasseService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/private/consultaformacaoclasse")
public class ConsultaFormacaoClasseWs {

    @Autowired
    private ConsultaFormacaoClasseService consultaFormacaoClasseService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultaFormacaoClasse(ConsultaFormacaoClasse consultaFormacaoClasse) {
        consultaFormacaoClasse = consultaFormacaoClasseService.consultaFormacaoClasse(consultaFormacaoClasse);
        return Response.status(200).entity(consultaFormacaoClasse).build();
    }

}
