package controller.webservice;

import javax.ws.rs.*;

@Path("/service")
public class SomarService {

    @GET
    @Produces("text/plain")
    public String Index(){
        return "Informe os dois valores!";
    }

    @GET
    @Produces("text/plain")
    @Consumes("text/plain")
    @Path("/parametros/{v1}/{v2}")
    public String somar(@PathParam("v1") int v1, @PathParam("v2") int v2){
        return (v1+v2) + "";
    }
}
