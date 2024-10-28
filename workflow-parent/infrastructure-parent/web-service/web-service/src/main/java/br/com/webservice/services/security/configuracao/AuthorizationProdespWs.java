package br.com.webservice.services.security.configuracao;

import br.com.domain.servicoexterno.model.AuthorizationServicoExterno;
import br.com.service.modulo.configuracao.serviceexterno.ServicoExternoService;
import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import javax.annotation.PostConstruct;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Path("/private/authorizationprodesp")
public class AuthorizationProdespWs {

    @Autowired
    private ServicoExternoService servicoExternoService;

    private Exclusion exclusion = new Exclusion();
    private Gson gson;

    @PostConstruct
    private void init() {
        gson = new GsonBuilder().addSerializationExclusionStrategy(exclusion).create();
    }

//    @GET
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Produces({MediaType.APPLICATION_JSON})
//    public Response get() {
//        AuthorizationServicoExterno authorizationServicoExterno = servicoExternoService.findByServicoExterno();
//        String jsonString = gson.toJson(authorizationServicoExterno);
//        return Response.status(200).entity(jsonString).build();
//    }
//
//    @POST
//    @Consumes({MediaType.APPLICATION_JSON})
//    @Produces({MediaType.APPLICATION_JSON})
//    public Response post(AuthorizationServicoExterno authorizationServicoExterno) {
//        authorizationServicoExterno = servicoExternoService.save(authorizationServicoExterno);
//        String jsonString = gson.toJson(authorizationServicoExterno);
//        return Response.status(200).entity(jsonString).build();
//    }
}

class Exclusion implements ExclusionStrategy {

    @Override
    public boolean shouldSkipField(FieldAttributes field) {
        if (field.getDeclaringClass() == AuthorizationServicoExterno.class && field.getName().equals("servicoExterno")) {
            return true;
        }
        return false;
    }

    @Override
    public boolean shouldSkipClass(Class<?> clazz) {
        return false;
    }
}
