package src.sentenciasdeDesicionJava;

import java.util.Scanner;

public class EjercicioSistemaBancario {
    public static void main(String[] args) {
        System.out.println("*** Sistema Bancario ***");

        //Declaramos las variables
        Scanner consola = new Scanner(System.in);

        System.out.println("¿Desea salir de dentro del sistema? (true or false)");
        boolean deseaContinuarEnElSistema = Boolean.parseBoolean(consola.nextLine());

        //Verificamos la logica
        if(!deseaContinuarEnElSistema){
            System.out.println("Continuamos dentro del sistema");
        } else {
            System.out.println("Saliendo del sistema...");
        }
        
    }
}
