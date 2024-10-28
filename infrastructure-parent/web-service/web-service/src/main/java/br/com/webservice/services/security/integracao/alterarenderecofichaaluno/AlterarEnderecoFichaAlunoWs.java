package br.com.webservice.services.security.integracao.alterarenderecofichaaluno;

import br.com.service.integracao.alterarenderecofichaaluno.AlterarEnderecoFichaAlunoService;
import br.gov.sp.educacao.ensemble.AlterarEnderecoFichaAluno;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/private/alterarenderecofichaaluno")
public class AlterarEnderecoFichaAlunoWs {

    @Autowired
    private AlterarEnderecoFichaAlunoService alterarEnderecoFichaAlunoService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response alterarEnderecoFichaAluno(AlterarEnderecoFichaAluno alterarEnderecoFichaAluno) {
        alterarEnderecoFichaAluno = alterarEnderecoFichaAlunoService.alterarEnderecoFichaAluno(alterarEnderecoFichaAluno);
        return Response.status(200).entity(alterarEnderecoFichaAluno).build();
    }

}
