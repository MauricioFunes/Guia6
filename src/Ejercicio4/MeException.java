/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Exception.java to edit this template
 */
package Ejercicio4;

/**
 *
 * @author Win10
 */
public class MeException extends Exception {

    /**
     * Creates a new instance of <code>MeException</code> without detail
     * message.
     */
    public MeException() {
    }

    /**
     * Constructs an instance of <code>MeException</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public MeException(String msg) {
        super(msg);
    }
}
