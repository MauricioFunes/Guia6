/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class DivisionNumero {

    /**
        Demuestre como provocar intencionalmente una excepción del tipo
        NumberFormatException, luego agregue las sentencias try/catch para mostrar los
        mensajes de error.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        String numero1Str = scanner.nextLine();

        System.out.print("Ingrese el segundo número: ");
        String numero2Str = scanner.nextLine();

        try{
        int numero1 = Integer.parseInt(numero1Str);
        int numero2 = Integer.parseInt(numero2Str);

        double resultado = (double) numero1 / numero2;
        System.out.println("El resultado de la división es: " + resultado);
        }catch(NumberFormatException e){
            System.out.println("Error: " + e.fillInStackTrace());
        }
        

        
    }
    
}
