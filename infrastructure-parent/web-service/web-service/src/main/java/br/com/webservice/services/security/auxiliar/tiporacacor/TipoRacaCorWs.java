package br.com.webservice.services.security.auxiliar.tiporacacor;

import br.com.domain.auxiliar.tiporacacor.model.TipoRacaCor;
import br.com.service.modulo.auxiliar.tiporacacor.TipoRacaCorService;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("private/tiporacacor")
public class TipoRacaCorWs {

    @Autowired
    private TipoRacaCorService tipoRacaCorService;


    @GET
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public Response tipoRacaCor() {
        List<TipoRacaCor> tipoRacaCor = tipoRacaCorService.findAll();
        return Response.status(200).entity(tipoRacaCor).build();
    }
}
