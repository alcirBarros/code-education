package br.com.webservice.services.security.integracao.consultaclassealunoporescola;

import br.com.domain.integracao.consultaclassealunoporescola.model.ConsultaClasseAlunoPorEscola;
import br.com.service.integracao.consultaclassealunoporescola.ConsultaClasseAlunoPorEscolaService;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/private/consultaclassealunoporescola")
public class ConsultaClasseAlunoPorEscolaWs {

    @Autowired
    private ConsultaClasseAlunoPorEscolaService alterarEnderecoFichaAlunoService;

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Response alterarEnderecoFichaAluno(ConsultaClasseAlunoPorEscola consultaClasseAlunoPorEscola) {
        consultaClasseAlunoPorEscola = alterarEnderecoFichaAlunoService.consultaClasseAlunoPorEscola(consultaClasseAlunoPorEscola);
        return Response.status(200).entity(consultaClasseAlunoPorEscola).build();
    }

}
