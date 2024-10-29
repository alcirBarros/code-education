package br.com.webservice.services.security.integracao.consultarescolacie;

import br.com.domain.integracao.consultarescolacie.ConsultarEscolaCIE;
import br.com.service.integracao.consultarescolacie.ConsultarEscolaCieService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/private/consultarescolacie")
public class ConsultarEscolaCieWs {

    @Autowired
    private ConsultarEscolaCieService consultarEscolaCieService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultarfichaAlunoPost(ConsultarEscolaCIE consultarEscolaCIE) {
        consultarEscolaCIE = consultarEscolaCieService.consultarColetaClasse(consultarEscolaCIE);        
        return Response.status(200).entity(consultarEscolaCIE).build();
    }

}
