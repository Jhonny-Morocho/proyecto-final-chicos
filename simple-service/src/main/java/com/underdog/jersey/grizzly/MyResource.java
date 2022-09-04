package com.underdog.jersey.grizzly;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("api")
@Consumes(value= MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)
public class MyResource {

    @GET
    public String getIt() {
        return "Got it! hola mundo";
    }
    @POST
    public String postCadena(String cadena) {
           System.out.println("LLEGO LA CADENA ......");
           return cadena+"Llego la cadena";
    }
}
