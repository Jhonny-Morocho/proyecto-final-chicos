/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Exeptions;

/**
 * @author santi
 */
public class ErrorException extends Exception {

    /**
     * Creates a new instance of <code>ErrorLexicoException</code> without
     * detail message.
     */
    public ErrorException() {
    }

    /**
     * Constructs an instance of <code>ErrorLexicoException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ErrorException(String msg) {
        super(msg);
    }
}
