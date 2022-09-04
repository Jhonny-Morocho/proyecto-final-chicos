/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package potenciacion;

import analizadorsintactico.LexerCup;
import analizadorsintactico.PrintTablaSimbolos;
import analizadorsintactico.Sintax;
import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import java_cup.runtime.Symbol;
import jflex.SilentExit;

import java.io.File;
import java.io.IOException;
import java.io.StringReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Potenciacion {

    public static String URL = "datosf" + File.separatorChar;

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

        } catch (Exception e) {
            System.out.println("ERROR" + e);

        }
    }

    public static void eliminar(Path ruta) {
        try {
            if (Files.exists(ruta)) {
                Files.delete(ruta);
            }

        } catch (Exception e) {

        }

    }

    public static void main(String[] args) {
        /**
         * Generador de Sym, Sintex, LexerCup
         */
        /*String [] rutas = {URL+"Lexer.flex"};
        String [] rutasS = {"-parser","Sintax",URL+"sintax.cup"};
        try {
            java_cup.Main.main(rutasS);
            jflex.Main.generate(rutas);
        } catch (SilentExit e) {
            System.out.println("ERROR" + e);
            //throw new RuntimeException(e);
        } catch (internal_error e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }*/

        //ENTERO a; \n ENTERO b =45; \n ENTERO imprimir (){ENTERO c = 56; PRINT ()};
        /**
         * Analizador Sintactico
         */
        /**
         * |
         *
         * BASE SIGNO BASE IGUAL RESULTADO IGUAL DELIMITADOR |
         *
         * INICIO_GRUPO BASE FIN_GRUPO POTENCIA NUMERO
         */
////        Generar();
//------------------------------REGLA 1 --------------------------//
        String cadena = "3.1^2.1*3.1^2.1;";
        //Generar();
//------------------------------REGLA 2 --------------------------//
//        String cadena = "3^0;";
        //Generar();
//------------------------------REGLA 3 --------------------------//       
        //String cadena = " (a)^(0);";
//        Generar();
//------------------------------REGLA 4 --------------------------//
//         String cadena = "[-5.3^2 ]^2; ";
        //Generar();
//------------------------------REGLA 5 --------------------------//        
        //String cadena = "(a)^(5) / (a)^(m);";
        //Generar();
//------------------------------REGLA 6 --------------------------//        
//        String cadena = "[1*5]^2 ;"; 
//        Generar();
//------------------------------REGLA 7 --------------------------//        
//        String cadena = "[5/-2]^6 ;"; 
        //Generar();
//------------------------------REGLA 8 --------------------------//  
//        String cadena = "10^(1/2); ";

//        Generar();
//------------------------------REGLA 9 --------------------------//        
//        String cadena = " (0.5)^(-1);";
        LexerCup lexerCup = new LexerCup(new StringReader(cadena));
        Sintax s = new Sintax(lexerCup);
        try {
            s.parse();
            PrintTablaSimbolos.imprimirLista();
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
            PrintTablaSimbolos.imprimirLista();
            System.out.println("Hay un ERROR " + e);
            Symbol sym = s.getS();
            if (sym != null) {
                System.out.println("Error Syntactico en la linea " + (sym.right + 1) + " Columna " + (sym.left + 1) + " Texto " + (sym.value));
            }

        }
    }

}
