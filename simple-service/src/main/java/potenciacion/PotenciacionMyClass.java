/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package potenciacion;

import analizadorsintactico.LexerCup;
import analizadorsintactico.PrintTablaSimbolos;
import analizadorsintactico.Sintax;
import java.io.File;
import java.io.StringReader;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java_cup.runtime.Symbol;


/**
 *
 * @author Jhonny Morocho
 */
public class PotenciacionMyClass {
        //global var
       private static String URL = "datosf" + File.separatorChar;
       
    public static void Generar() {

        String[] rutas = {URL + "Lexer.flex"};
        String[] rutasS = {"-parser", "Sintax", URL + "sintax.cup"};
        try {
            java_cup.Main.main(rutasS);
            jflex.Main.generate(rutas);
            Path sym = Paths.get(System.getProperty("user.dir")
                    + File.separatorChar + "src" + File.separatorChar + "analizadorsintactico"
                    + File.separatorChar + "sym.java");

            Path lexer = Paths.get(System.getProperty("user.dir")
                    + File.separatorChar + "src" + File.separatorChar + "analizadorsintactico"
                    + File.separatorChar + "LexerCup.java");

            Path Syntax = Paths.get(System.getProperty("user.dir")
                    + File.separatorChar + "src" + File.separatorChar + "analizadorsintactico"
                    + File.separatorChar + "Sintax.java");

            eliminar(sym);
            eliminar(lexer);
            eliminar(Syntax);
            Files.move(Paths.get(System.getProperty("user.dir")
                    + File.separatorChar + "sym.java"), sym);
            Files.move(Paths.get(System.getProperty("user.dir")
                    + File.separatorChar + "Sintax.java"), Syntax);
            Files.move(Paths.get(URL + "LexerCup.java"), lexer);
            // TODO OK ENTONCES LEER CADENA
            

        } catch (Exception e) {
            System.out.println( "ERROR" + e);
        }
    }
    
    public static ArrayList <List> leerCadena(String cadena){

        LexerCup lexerCup = new LexerCup(new StringReader(cadena));
        Sintax s = new Sintax(lexerCup);
        ArrayList<List> listaRes = new ArrayList();
        
        try {
            s.parse();
            listaRes= PrintTablaSimbolos.imprimirLista();
            System.out.println("LEER LISTA TODO OK "+listaRes);
            return listaRes;
            // s.scan();
        } catch (Exception e) {
            listaRes=PrintTablaSimbolos.imprimirLista();
            Symbol sym = s.getS();
            if (sym != null) {
                
                return listaRes;
            }
            System.out.println("LEER LISTA ERROR "+listaRes);
            return listaRes;

        }
    }
    public static void eliminar(Path ruta) {
        try {
            if (Files.exists(ruta)) {
                Files.delete(ruta);
            }

        } catch (Exception e) {
            System.out.println("ERROR "+e);
        }

    }
}
