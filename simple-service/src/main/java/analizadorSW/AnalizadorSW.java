/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorSW;

import Respuesta.Respuesta;
import analizadorsintactico.LexerCup;
import analizadorsintactico.PrintTablaSimbolos;
import analizadorsintactico.Sintax;
import java.io.StringReader;
import java.util.Base64;
import java_cup.runtime.Symbol;
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
        String service = new String(Base64.getDecoder().decode(servicio));

        System.out.println("LO QUE ME ENVIASTE" + service);
        

        //String cadena = "3^0;";
        
        
        LexerCup lexerCup = new LexerCup(new StringReader(service));
        Sintax s = new Sintax(lexerCup);
        try {
            s.parse();
            //PrintTablaSimbolos.imprimirLista();
            Respuesta r = new Respuesta();
            r.setResultado("YA ESTA");
            return Response.ok("{\"message\": \"NI IDEA QUE HAGO AQUI\"}").build();
            /*Symbol aux = s.scan();
            while (aux != null){
                System.out.println(aux);
                aux = s.scan();
                if (aux.sym == 0){
                    //System.out.println("Error en dato " + aux.value);
                    break;
                }else if(aux.sym == 11){
                    System.out.println("Error en dato " + aux.value);
                    break;
                }
            }*/
            // s.scan();
        } catch (Exception e) {
            //PrintTablaSimbolos.imprimirLista();
            System.out.println("Hay un ERROR " + e);

            Symbol sym = s.getS();
            if (sym != null) {
                System.out.println("Error Syntactico en la linea " + (sym.right + 1) + " Columna " + (sym.left + 1) + " Texto " + (sym.value));
            } else {
                System.out.println("Error" + e);
            }

            return Response.status(Response.Status.BAD_REQUEST).entity("{\"message\": \"Error en ni idea\"}").build();

        }
    }
}
