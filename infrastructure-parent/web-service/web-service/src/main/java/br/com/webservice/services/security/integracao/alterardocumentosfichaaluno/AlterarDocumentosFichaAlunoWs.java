package br.com.webservice.services.security.integracao.alterardocumentosfichaaluno;

import br.com.domain.integracao.alterardocumentosfichaaluno.model.AlterarDocumentosFichaAluno;
import br.com.service.integracao.alterardocumentosfichaaluno.AlterarDocumentosFichaAlunoService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/private/alterardocumentosfichaaluno")
public class AlterarDocumentosFichaAlunoWs {

    @Autowired
    private AlterarDocumentosFichaAlunoService alterarDadosPessoaisFichaAlunoService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response consultarfichaAlunoPost(AlterarDocumentosFichaAluno alterarDocumentosFichaAluno) {
        alterarDocumentosFichaAluno = alterarDadosPessoaisFichaAlunoService.alterarEnderecoFichaAluno(alterarDocumentosFichaAluno);
        return Response.status(200).entity(alterarDocumentosFichaAluno).build();
    }

}
