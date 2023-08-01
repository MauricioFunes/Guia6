/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio2;

/**
 *
 * @author Win10
 */
public class NewMain {

    /**
     *  Demuestre como provocar intencionalmente una excepción del tipo
        ArrayIndexOutOfBoundsException (índice de arreglo fuera de rango);
 
        Luego agregue las sentencias try/catch para mostrar lo que devuelve el método fillInStackTrace.
     */
    public static void main(String[] args) {
        try {
            int[] array = { 1, 2, 3 };
            int element = array[5]; // Provoca ArrayIndexOutOfBoundsException
            System.out.println("Elemento obtenido: " + element);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se produjo una ArrayIndexOutOfBoundsException");
            System.out.println("Mensaje de error: " + e.getMessage());
            System.out.println("Traza de la pila: " + e.fillInStackTrace());
            e.printStackTrace();
            
        }
    }
    
}
