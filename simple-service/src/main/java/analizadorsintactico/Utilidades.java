/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package analizadorsintactico;

import static java.lang.Math.pow;

/**
 *
 * @author Usuario
 */
public class Utilidades {
    public  static String strCadenaResul="";
    public static int typeBase(Object base) {
        System.out.println(base.getClass().getSimpleName());
        if (base.getClass().equals(String.class)) {
            System.out.println("String");
            return 1;
        } else if (base.getClass().equals(Integer.class)) {
            System.out.println("Integer");
            return 2;
        } else if (base.getClass().equals(Double.class)) {
            System.out.println("Double");
            return 3;
        } else {
            return -1;
        }
    }

    public static boolean isEquals(Object base1, Object base2) {
        return base2.toString().equals(base1.toString());

    }

    public static void ResolverR1(Object base1, Object base2, Object expo1, Object expo2, Object t) {
        Double Resultado = 0.0;
        if (isEquals(base1, base2)) {
            if (t.toString().charAt(0) == '*') {
                Integer exponente = (Integer) expo1 + (Integer) expo2;
                Resultado = pow((Integer) base1, exponente);
                System.out.println("Multiplicación de Potencias con la misma Base \n ");
                System.out.println("El Resultado es: " + base1 + "^" + exponente + " = " + Resultado);
                strCadenaResul="El Resultado es: " + base1 + "^" + exponente + " = " + Resultado;

            } else if (t.toString().charAt(0) == '/') {
                Integer exponente = (Integer) expo1 - (Integer) expo2;
                Resultado = pow((Integer) base1, exponente);
                System.out.println("Multiplicación de Potencias con la misma Base \n ");
                System.out.println("El Resultado es: " + base1 + "^" + exponente + " = " + Resultado);
                strCadenaResul="El Resultado es: " + base1 + "^" + exponente + " = " + Resultado;
            }
        } else {
            System.out.println("Las bases no son iguales");
        }
        if (isEquals(base1, base2)) {

            switch (typeBase(base1)) {
                case 1: {
                    if (t.toString().charAt(0) == '*') {
                        Double exponente = (Double) expo1 + (Double) expo2;
                        System.out.println("Multiplicación de Potencias con la misma Base \n ");
                        System.out.println("El Resultado es: " + base1 + "^" + exponente);
                        strCadenaResul="El Resultado es: " + base1 + "^" + exponente + " = " + Resultado;
                    } else if (t.toString().charAt(0) == '/') {
                        Double exponente = (Double) expo1 - (Double) expo2;
                        System.out.println("DIVISION de Potencias con la misma Base \n ");
                        System.out.println("El Resultado es: " + base1 + "^" + exponente);
                        strCadenaResul="El Resultado es: " + base1 + "^" + exponente + " = " + Resultado;
                    }
                }
                case 2: {
                    if (t.toString().charAt(0) == '*') {
                        Integer exponente = (Integer) expo1 + (Integer) expo2;
                        Resultado = pow((Integer) base1, exponente);
                        System.out.println("Multiplicacion de Potencias con la misma Base \n ");
                        System.out.println("El Resultado es: " + base1 + "^" + exponente + " = " + Resultado);
                        strCadenaResul="El Resultado es: " + base1 + "^" + exponente + " = " + Resultado;
                    } else if (t.toString().charAt(0) == '/') {
                        Integer exponente = (Integer) expo1 - (Integer) expo2;
                        Resultado = pow((Integer) base1, exponente);
                        System.out.println("DIVISION de Potencias con la misma Base \n ");
                        System.out.println("El Resultado es: " + base1 + "^" + exponente + " = " + Resultado);
                        strCadenaResul="El Resultado es: " + base1 + "^" + exponente + " = " + Resultado;
                    }
                }
                case 3: {
                    if (t.toString().charAt(0) == '*') {
                        Double exponente = (Double) expo1 + (Double) expo2;
                        Resultado = pow((Double) base1, exponente);
                        System.out.println("Multiplicacion de Potencias con la misma Base \n ");
                        System.out.println("El Resultado es: " + base1 + "^" + exponente + " = " + Resultado);
                        strCadenaResul="El Resultado es: " + base1 + "^" + exponente + " = " + Resultado;
                    } else if (t.toString().charAt(0) == '/') {
                        Double exponente = (Double) expo1 - (Double) expo2;
                        Resultado = pow((Double) base1, exponente);
                        System.out.println("DIVISION de Potencias con la misma Base \n ");
                        System.out.println("El Resultado es: " + base1 + "^" + exponente + " = " + Resultado);
                        strCadenaResul="El Resultado es: " + base1 + "^" + exponente + " = " + Resultado;
                    }
                }
                default:
                    throw new AssertionError();

            }
        } else {
            System.out.println("Las bases no son iguales");
        }
    }

    public static void regla239(Object exponente, Object base) {
        Double Resultado = 0.0;
        Integer exponente1 = (Integer) exponente;
        Integer base1 = (Integer) base;
        if (exponente1 == '1') {
            Resultado = 1.1;
            System.out.println("El Resultado es: " + base1 + "^" + exponente + " = " + Resultado);
            strCadenaResul="El Resultado es: " + base1 + "^" + exponente + " = " + Resultado;

        }
        if (exponente1 == '0') {
            Resultado = 1.1;
            System.out.println("El Resultado es: " + base1 + "^" + exponente + " = " + Resultado);
            strCadenaResul="El Resultado es: " + base1 + "^" + exponente + " = " + Resultado;

        } else {

            System.out.println("*****************ERROR**********");

        }
    }

    public static void regla4(Object a, Object e, Object x) {
        Double Resultado = 0.0;
        Integer exponente = (Integer) e * (Integer) x;
        Resultado = pow((Integer) a, exponente);
        System.out.println("Potencia de Otra Potencia \n ");
        System.out.println("El Resultado es: " + a + "^" + e + "*" + x + "="
                + a + exponente + " = "
                + Resultado);
        strCadenaResul="El Resultado es: " + a + "^" + e + "*" + x + "="
                + a + exponente + " = "
                + Resultado;
    }

    public static void regla6_7(Object num1, Object num2, Object expo) {

        Double Resultado1 = pow((Integer) num1, (Integer) expo);
        Double Resultado2 = pow((Integer) num2, (Integer) expo);
        Double Resultado3 = Resultado2 * Resultado1;
        System.out.println("Potencia de Otra Potencia " + Resultado3);
    }

    public static void regla8(Object base, Object numerador, Object denominador) {

    }
}
