package br.com.webservice.services.security.integracao.consultarfichaaluno;

import br.com.domain.integracao.consultafichaaluno.model.ConsultarFichaAluno;
import br.com.service.integracao.consultarfichaaluno.ConsultarFichaAlunoService;
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
@Path("/private/fichaaluno")
public class ConsultarFichaAlunoWs {

    @Autowired
    private ConsultarFichaAlunoService consultarFichaAlunoService;

    @GET
    @Path("/status")
    @Produces({MediaType.APPLICATION_JSON})
    public Response status() {
        return Response.status(200).entity("Status ---- OK").build();
    }

    //http://localhost:8080/application/webservice/private/fichaaluno/consultarfichaaluno
    @POST
//    @Path("/consultarfichaaluno/post")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultarfichaAlunoPost(ConsultarFichaAluno consultarFichaAluno) {
        consultarFichaAluno = consultarFichaAlunoService.consultarFichaAluno(consultarFichaAluno);
        return Response.status(200).entity(consultarFichaAluno).build();
    }

}
