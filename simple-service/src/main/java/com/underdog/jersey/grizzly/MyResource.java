package com.underdog.jersey.grizzly;

import java.util.Base64;
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

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("api/{cadena}")
@Consumes(value= MediaType.APPLICATION_JSON)
@Produces(value = MediaType.APPLICATION_JSON)
public class MyResource {

    @GET
    public String getIt(@PathParam ("cadena") String cadenaId) {
        System.err.println("LA CADENA RECIVIDA ES GET ES "+cadenaId);
        Base64.Decoder decoder = Base64.getDecoder();
        String cadenaReal = new String(decoder.decode(cadenaId));
        System.out.println("LA CADDENA DECODIFICA ES "+cadenaReal);
        String  strCadenResponse="";
        PotenciacionMyClass.Generar();
        strCadenResponse=PotenciacionMyClass.leerCadena(cadenaReal);
        return "OK "+strCadenResponse;
    }
    @POST
    @Consumes("application/x-www-form-urlencoded")
    public String postCadena( @FormParam("cadena") String cadena) {
        System.out.println("La cadena recivida es POST ES  "+cadena);

        String  strCadenResponse="";
        PotenciacionMyClass.Generar();
        strCadenResponse=PotenciacionMyClass.leerCadena("3^0;");
        return "OK "+strCadenResponse;
    }
}
