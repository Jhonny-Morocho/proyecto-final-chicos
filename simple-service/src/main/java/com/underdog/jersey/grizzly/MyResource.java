package com.underdog.jersey.grizzly;

import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.POST;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.PathParam;
import org.glassfish.jersey.server.model.ParamQualifier;
import potenciacion.PotenciacionMyClass;
import javax.ws.rs.core.Response;
/**
 * Root resource (exposed at "myresource" path)
 */

@Path("api/{cadena}")
//@Consumes(value= MediaType.APPLICATION_JSON)
public class MyResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getIt(@PathParam ("cadena") String cadena64Bits) {
        List listaRes = new ArrayList<List>();
        Base64.Decoder decoder = Base64.getDecoder();
        
        String cadenaReal = new String(decoder.decode(cadena64Bits));
        PotenciacionMyClass.Generar();
        
        listaRes=PotenciacionMyClass.leerCadena(cadenaReal);
        return Response.ok("{\"message\":\""+listaRes+"\"}").header("Access-Control-Allow-Origin", "*").build();
    }
}
