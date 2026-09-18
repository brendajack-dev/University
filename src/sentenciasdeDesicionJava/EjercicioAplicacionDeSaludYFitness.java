package src.sentenciasdeDesicionJava;

import java.util.Scanner;

public class EjercicioAplicacionDeSaludYFitness {
    public static void main(String[] args) {
        System.out.println("*** Aplicacion de Salud y Fitness ***");

        //Solicitamos al usuario, nombre y pasos caminados
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa tu nombre");
        String nombre = consola.nextLine();
        
        System.out.print("Ingresa el numero de pasos caminados");
        int pasosCaminados = Integer.parseInt(consola.nextLine());

        //Definimos constantes
        final var META_PASOS_DIARIOS = 10000;
        final var CALORIAS_POR_PASO = .04;

        //Calcular calorias quemadas
        var calorias_quemadas = pasosCaminados * CALORIAS_POR_PASO;

        //Verificamos si se cumplió la meta de pasos diarios
        var meta_alcanzada = (pasosCaminados >= META_PASOS_DIARIOS) ? "Felicidades! Meta alcanzada" : "Suerte para la proxima! Meta no alzanda";
         
        //Imprimimos el resultado
        System.out.println("\n" + nombre +" "+ meta_alcanzada );



    }
}
