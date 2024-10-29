package br.com.webservice.services.security.integracao.alterardadospessoaisfichaaluno;

import br.com.domain.integracao.alterardadospessoaisfichaaluno.model.AlterarDadosPessoaisFichaAluno;
import br.com.service.integracao.alterardadospessoaisfichaaluno.AlterarDadosPessoaisFichaAlunoService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/private/alterardadospessoaisfichaaluno")
public class AlterarDadosPessoaisFichaAlunoWs {

    @Autowired
    private AlterarDadosPessoaisFichaAlunoService alterarDadosPessoaisFichaAlunoService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultarfichaAlunoPost(AlterarDadosPessoaisFichaAluno alterarDadosPessoaisFichaAluno) {
        alterarDadosPessoaisFichaAluno = alterarDadosPessoaisFichaAlunoService.alterarDadosPessoaisFichaAluno(alterarDadosPessoaisFichaAluno);
        return Response.status(200).entity(alterarDadosPessoaisFichaAluno).build();
    }

}
