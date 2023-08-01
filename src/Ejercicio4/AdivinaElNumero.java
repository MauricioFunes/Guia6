/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Ejercicio4;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Win10
 */
public class AdivinaElNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAdivinar = random.nextInt(500) + 1;
        int intentos = 0;
        boolean verf = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinar el número!");
        System.out.println("El numero es: " + numeroAdivinar);

        while (verf) {
            try {
                System.out.print("Introduce un número entre 1 y 500: ");
                int numeroUsuario = scanner.nextInt();
                intentos++;

                if (numeroUsuario < numeroAdivinar) {
                    System.out.println("El número a adivinar es mayor.");
                } else if (numeroUsuario > numeroAdivinar) {
                    System.out.println("El número a adivinar es menor.");
                } else {
                    System.out.println("¡Felicidades! Adivinaste el número.");
                    System.out.println("Número de intentos: " + intentos);
                    verf = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Debes introducir un número válido.");
                scanner.next(); // Limpiar el búfer del scanner
                intentos++;
            }
//          catch(Exception e){
//                throw e;
//            }
//            catch(MeException e){
//                System.err.println("");
//            }
        }

        scanner.close();
    }

}
