 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorsintactico;


import java.util.ArrayList;
import java.util.List;
public class PrintTablaSimbolos {
    
   

    public static List lista = new ArrayList();
    public static List lista1 = new ArrayList();
    public static List lista2= new ArrayList();
    public static List lista3 = new ArrayList();

    public static List getLista() {
        return lista;
    }

    public static void setLista(List lista) {
        PrintTablaSimbolos.lista = lista;
    }

    public static List getLista1() {
        return lista1;
    }

    public static void setLista1(List lista1) {
        PrintTablaSimbolos.lista1 = lista1;
    }

    public static List getLista2() {
        return lista2;
    }

    public static void setLista2(List lista2) {
        PrintTablaSimbolos.lista2 = lista2;
    }

    public static List getLista3() {
        return lista3;
    }

    public static void setLista3(List lista3) {
        PrintTablaSimbolos.lista3 = lista3;
    }
    public static void addArrayList(String dato) {
        lista.add(dato);
    }

    public static void addArrayList1(String dato) {
        lista1.add(dato);
    }

    public static void addArrayList2(Integer dato) {
        lista2.add(dato);
    }

    public static void addArrayList3(Integer dato) {
        lista3.add(dato);
    }
    public static void imprimirLista(){
        System.out.println(" Lista de TOKEN                    Lista de LEXEMA");
        
        String format = "%1$-34s %2$-21s\n";

        for (int i = 0; i < PrintTablaSimbolos.lista.size(); i++) {

            System.out.format(format, "  " + PrintTablaSimbolos.lista.get(i), "      " + PrintTablaSimbolos.lista1.get(i));

        }
        System.out.println("______________________________________________");
    }
}
    

