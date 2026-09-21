package src.sentenciasdeDesicionJava;

import java.util.Scanner;

public class RetoIdentificaLaEstacionDelAño {
    public static void main(String[] args) {
        System.out.println("*** Identifica la Estacion del Año ***");

        // Solicita el valor de un mes
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa el valor de un mes (Utiliza un valor numero entre 1 y 12): ");
        int mesUtilizado = Integer.parseInt(consola.nextLine());

        // if (mesUtilizado == 1 || mesUtilizado == 2 || mesUtilizado == 12)
        //     System.out.println("Invierno");
        // else if (mesUtilizado == 3 || mesUtilizado == 4 || mesUtilizado == 5)
        //     System.out.println("Primavera");
        // else if (mesUtilizado == 6 || mesUtilizado == 7 || mesUtilizado == 8)
        //     System.out.println("Verano");
        // else if (mesUtilizado == 9 || mesUtilizado == 10 || mesUtilizado == 11)
        //     System.out.println("Otoño");
        // else
        //     System.out.println("Estacion Desconocida");

        switch (mesUtilizado){
            case 1: System.out.println("Invierno");
            break;
            case 2: System.out.println("Invierno");
            break; 
            case 12: System.out.println("Invierno");
            break;
            case 3: System.out.println("Primavera");
            break;
            case 4: System.out.println("Primavera");
            break;
            case 5: System.out.println("Primavera");
            break;
            case 6: System.out.println("Verano");
            break;
            case 7: System.out.println("Verano");
            break;
            case 8: System.out.println("Verano");
            break;
            case 9: System.out.println("Otoño");
            break;
            case 10: System.out.println("Otoño");
            break;
            case 11: System.out.println("Otoño");
            break;
            default: System.out.println("Estacion Desconocida");
        }
    }
}
