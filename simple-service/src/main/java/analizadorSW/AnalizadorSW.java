/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorSW;

import Respuesta.Respuesta;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author paul
 */
@Path("/sintactico")
public class AnalizadorSW {

    /**
     * URL: http://localhost:8080/API_REST_WS-RS/api/users/Rosa
     *
     * @param servicio String
     * @return Response
     */
    @GET
    @Path("/{servicio}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response getResult(@PathParam("servicio") String servicio) {
        System.out.println("LO QUE ME ENVIASTE"+servicio);
        Respuesta r = new  Respuesta();
        r.setResultado("{\"message\": \"NI IDEA QUE HAGO AQUI\"}");
        return Response.ok(r).build();
    }

}
