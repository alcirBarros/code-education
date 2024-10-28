package br.com.webservice.services.security.auxiliar.tipoconsultafichaaluno;

import br.com.domain.auxiliar.tipoconsultafichaaluno.TipoConsultaFichaAluno;
import br.com.service.modulo.auxiliar.tipoconsultafichaaluno.TipoConsultaFichaAlunoService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("private/tipoconsultafichaaluno")
public class TipoConsultaFichaAlunoWs {

    @Autowired
    private TipoConsultaFichaAlunoService tipoConsultaFichaAlunoService;

    //http://localhost:8080/application/webservice/private/tipoconsultafichaaluno
    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response tipoConsultaFichaAluno() {
        List<TipoConsultaFichaAluno> tipoConsultaFichaAluno = tipoConsultaFichaAlunoService.tipoConsultaFichaAluno();
        return Response.status(200).entity(tipoConsultaFichaAluno).build();
    }
}
