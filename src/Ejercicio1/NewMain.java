/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author Win10
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            int []array = {1,2,3};
            System.out.println("la posicion 3 del arreglo es: " + array[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Se produjo un: " + e);
        } catch(Exception e){
            System.out.println("Se produjo un super error");
        }finally{
            System.out.println("Se termino el programa.");
        }
    }

}
