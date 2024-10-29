package br.com.webservice.services.security.integracao.trocaralunoclassera;

import br.com.domain.integracao.trocaralunoclassera.TrocarAlunoClasseRA;
import br.com.service.integracao.trocaralunoclassera.TrocarAlunoClasseRaService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("private/trocaralunoclassera")
public class TrocarAlunoClasseRaWs {

    @Autowired
    private TrocarAlunoClasseRaService trocarAlunoClasseRaService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response trocarAlunoClasseRaPost(TrocarAlunoClasseRA trocarAlunoClasseRA) {
        trocarAlunoClasseRA = trocarAlunoClasseRaService.realizarMatriculaInfoSemRA(trocarAlunoClasseRA);
        return Response.status(200).entity(trocarAlunoClasseRA).build();
    }

}
