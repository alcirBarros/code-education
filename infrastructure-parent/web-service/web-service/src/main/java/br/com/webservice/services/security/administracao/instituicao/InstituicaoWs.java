package br.com.webservice.services.security.administracao.instituicao;

import br.com.domain.Instituicao;
import br.com.service.modulo.administracao.instituicao.InstituicaoService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("private/instituicao")
public class InstituicaoWs {

    @Autowired
    private InstituicaoService instituicaoService;

    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response tipoConsultaFichaAluno() {
        List<Instituicao> instituicaoList = instituicaoService.findAll();
        return Response.status(200).entity(instituicaoList).build();
    }

}
