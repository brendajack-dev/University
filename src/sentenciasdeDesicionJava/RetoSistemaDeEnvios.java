package sentenciasdeDesicionJava;

import java.util.Scanner;

public class RetoSistemaDeEnvios {
    public static void main(String[] args) {
        System.out.println("\t*** Sistema de Envios ***");

        //Declaramos las variables
        //COSTOS DE TARIFAS POR KILO
        double tarifa = 10.0;

        //Solicitamos al usuario Destino y Peso
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa tu tipo de destino (1 Para Nacional o 2 para Internacional): ");
        int destino_usuario = Integer.parseInt(consola.next());

        System.out.print("Ingresa el peso de tu paquete (En Kiligramos): ");
        int peso_usuario = Integer.parseInt(consola.next());

        //Calculamos tarifa
        double tarifaFinal = tarifa * peso_usuario;

        //imprimimos el resultado
        switch (destino_usuario) {
            case 1:
                System.out.println(" Su envio Nacional tiene costo de $" + tarifaFinal);
                break;
            case 2:
                tarifaFinal = tarifaFinal * 2;
                System.out.println(" Su envio Internacional tiene costo de $" + tarifaFinal);
                break;
            default:
                System.out.println("ERROR DE DESTINO: " + destino_usuario + " Opcion no valida");
                break;
        }

    }
}
