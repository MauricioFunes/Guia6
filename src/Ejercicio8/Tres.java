/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio8;

/**
 *
 * @author Win10
 */
public class Tres{

    private static int metodo() throws Exception{
        int valor = 0;
        try {
            if(true){throw new Exception("erroooooooooooooooooooooor");}
            valor = valor + 1;
            valor = valor + Integer.parseInt("W");
            valor = valor + 1;
            System.out.println("Valor final del try : " +valor);
        }catch (NumberFormatException e) {
//            try{
            valor = valor + Integer.parseInt("W");
            System.out.println("Valor final del catch  : " +valor);
//            }catch(Exception a){
//                System.out.println("Probando si se puede añadir otro try/catch");
//            }
        }finally{
            valor = valor + 1;
            System.out.println("Valor final del finally:" + valor);
        }
            valor = valor + 1;
            System.out.println("Valor antes del return: " + valor) ;
    return valor;
    }


    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.err.println("Excepcion en metodo() " );
            e.printStackTrace();
        }
    }
}
