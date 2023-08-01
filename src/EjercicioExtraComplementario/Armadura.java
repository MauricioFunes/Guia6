/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EjercicioExtraComplementario;

import java.util.Random;

/**
 *
 * @author Win10
 */
public class Armadura {
    private String colorPrimario;
    private String colorSecundario;
    private Propulsor botaIzquierda;
    private Propulsor botaDerecha;
    private Repulsor guanteIzquierdo;
    private Repulsor guanteDerecho;
    private Consola consola;
    private Sintetizador sintetizador;
    private Generador generador;

    public Armadura(String colorPrimario, String colorSecundario) {
        this.colorPrimario = colorPrimario;
        this.colorSecundario = colorSecundario;
        this.botaIzquierda = new Propulsor();
        this.botaDerecha = new Propulsor();
        this.guanteIzquierdo = new Repulsor();
        this.guanteDerecho = new Repulsor();
        this.consola = new Consola();
        this.sintetizador = new Sintetizador();
        this.generador = new Generador();
    }

    public void caminar(int tiempo) {
        int energiaConsumida = botaIzquierda.usar(tiempo);
        generador.consumirEnergia(energiaConsumida);
    }

    public void correr(int tiempo) {
        int energiaConsumida = botaIzquierda.usar(tiempo) * 2;
        generador.consumirEnergia(energiaConsumida);
    }

    public void propulsar(int tiempo) {
        int energiaConsumida = botaIzquierda.usar(tiempo) * 3;
        generador.consumirEnergia(energiaConsumida);
    }

    public void volar(int tiempo) {
        int energiaConsumidaBota = botaIzquierda.usar(tiempo) * 3;
        int energiaConsumidaGuante = guanteIzquierdo.usar(tiempo) * 2;
        generador.consumirEnergia(energiaConsumidaBota + energiaConsumidaGuante);
    }

    public void usarGuantesComoArmas(int tiempo) {
        int energiaConsumida = guanteIzquierdo.usar(tiempo) * 3;
        generador.consumirEnergia(energiaConsumida);
    }

    public void escribir(String mensaje) {
        int energiaConsumida = consola.usar();
        generador.consumirEnergia(energiaConsumida);
        consola.mostrarMensaje(mensaje);
    }

    public void hablar(String mensaje) {
        int energiaConsumida = sintetizador.usar();
        generador.consumirEnergia(energiaConsumida);
        sintetizador.susurrar(mensaje);
    }

    public void mostrarEstado() {
        // Mostrar estado de todos los dispositivos y la información de la armadura
        System.out.println("Estado de la Armadura:");
        System.out.println("Color primario: " + colorPrimario);
        System.out.println("Color secundario: " + colorSecundario);
        System.out.println("Nivel de resistencia: " + generador.getNivelResistencia());
        System.out.println("Nivel de salud: " + generador.getNivelSalud());
        botaIzquierda.mostrarEstado();
        botaDerecha.mostrarEstado();
        guanteIzquierdo.mostrarEstado();
        guanteDerecho.mostrarEstado();
        consola.mostrarEstado();
        sintetizador.mostrarEstado();
    }

    public void informarEstadoBateria() {
        float porcentajeBateria = generador.getPorcentajeBateria();
        System.out.println("Estado de la batería: " + porcentajeBateria + "%");
    }

    public void informarEstadoReactor() {
        float nivelReactor = generador.getNivelReactor();
        System.out.println("Estado del reactor:");
        System.out.println("Nivel de energía: " + nivelReactor);
        // Realizar las conversiones a otras unidades de medida según la tabla de transformaciones
        // de la dureza Rockwell en Wikipedia
    }

    public void revisarDispositivos() {
        revisarDispositivo(botaIzquierda);
        revisarDispositivo(botaDerecha);
        revisarDispositivo(guanteIzquierdo);
        revisarDispositivo(guanteDerecho);
        revisarDispositivo(consola);
        revisarDispositivo(sintetizador);
    }

    private void revisarDispositivo(Dispositivo dispositivo) {
        if (dispositivo.isDanado()) {
            Random random = new Random();
            int intentos = 0;
            do {
                if (intentos > 0) {
                    System.out.println("Intentando reparar el dispositivo " + dispositivo.getNombre() + "...");
                }
                if (random.nextDouble() <= 0.4) {
                    dispositivo.reparar();
                    System.out.println("El dispositivo " + dispositivo.getNombre() + " ha sido reparado.");
                } else {
                    dispositivo.destruir();
                    System.out.println("El dispositivo " + dispositivo.getNombre() + " ha sido destruido.");
                }
                intentos++;
            } while (dispositivo.isDanado() && intentos < 3);
        }
    }

    public void agregarObjetoRadar() {
        Random random = new Random();
        boolean hostil = random.nextBoolean();
        double resistencia = random.nextDouble() * 100;
        double x = random.nextDouble() * 100;
        double y = random.nextDouble() * 100;
        double z = random.nextDouble() * 100;
        // Agregar objeto al radar
    }

//    public void destruirEnemigos() {
//        for (Radar objeto : radar.getObjetos()) {
//            if (objeto.isHostil() && generador.getNivelBateria() >= 0.1) {
//                double distancia = Math.sqrt(Math.pow(objeto.getX(), 2) + Math.pow(objeto.getY(), 2) + Math.pow(objeto.getZ(), 2));
//                if (distancia <= 5000) {
//                    while (objeto.getResistencia() > 0) {
//                        if (guanteIzquierdo.isSano() && guanteDerecho.isSano()) {
//                            objeto.recibirDanio(50 / distancia); // Potencia de disparo inversamente proporcional a la distancia
//                            generador.consumirEnergia(0.1);
//                        } else if (guanteIzquierdo.isSano()) {
//                            objeto.recibirDanio(25 / distancia); // Potencia de disparo inversamente proporcional a la distancia
//                            generador.consumirEnergia(0.1);
//                        } else if (guanteDerecho.isSano()) {
//                            objeto.recibirDanio(25 / distancia); // Potencia de disparo inversamente proporcional a la distancia
//                            generador.consumirEnergia(0.1);
//                        }
//                    }
//                    // Verificar si el objeto fue destruido
//                    if (objeto.getResistencia() <= 0) {
//                        radar.eliminarObjeto(objeto);
//                    }
//                }
//            }
//        }
//    }

    public void accionesEvasivas() {
        if (generador.getPorcentajeBateria() < 10) {
            double distancia = 10 / 300; // Calcular la distancia en horas de vuelo a 10 km
            // Alejarse a una distancia mínima de 10 km
        }
    }

    private void revisarDispositivo(Propulsor botaIzquierda) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void revisarDispositivo(Repulsor guanteIzquierdo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void revisarDispositivo(Consola consola) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void revisarDispositivo(Sintetizador sintetizador) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
