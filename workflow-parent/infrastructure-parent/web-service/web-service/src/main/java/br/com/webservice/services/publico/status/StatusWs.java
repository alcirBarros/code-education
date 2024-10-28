package br.com.webservice.services.publico.status;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import org.springframework.stereotype.Component;

@Component
@Path("status")
public class StatusWs {

    //http://localhost:8080/webservice/status
    
    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public Response status() {
        return Response.status(200).entity("Status ---- OK").build();
    }

//    @GET
//    @Path("/{parameter}")
//    public Response responseMsg(@PathParam("parameter") String parameter, @DefaultValue("Nothing to say") @QueryParam("value") String value) {
//        String output = "Hello from: " + parameter + " : " + value;
//        return Response.status(200).entity(output).build();
//    }
    
}
