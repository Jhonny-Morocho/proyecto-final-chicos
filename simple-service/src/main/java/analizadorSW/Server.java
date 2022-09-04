/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorSW;

import com.sun.net.httpserver.HttpsServer;
import java.io.IOException;
import java.net.InetSocketAddress;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author paul
 */
@ApplicationPath("api")
public class Server extends Application {

    public static final String URL = "http://localhost:8080/api";

    public static HttpsServer start() throws IOException {
        final ResourceConfig rc = new ResourceConfig().packages("analizadorSintactico");
        InetSocketAddress aux = InetSocketAddress.createUnresolved("localhost", 8090);

        return HttpsServer.create(aux, 0);
    }

    public static void main(String[] args) {

        try {
            HttpsServer server = start();
            System.out.println("");

        } catch (Exception e) {
            System.out.println("");
        }
    }

}
