package ciclosEnJava;

import java.util.Random;
import java.util.Scanner;

public class RetoJuegoAdivinanzas {
    public static void main(String[] args) {
        System.out.println(
                "*** Bienvenido al juego de adivinanzas ***\n"
                        + "Intenta adivinar el numero en el que estoy pensando");

        Random random = new Random();
        Scanner consola = new Scanner(System.in);

        int numeroRamdom = random.nextInt(50);
        int intentos = 0;

        while (intentos < 50) {
            System.out.println("Ingresa un numero: ");
            int numero = Integer.parseInt(consola.nextLine());
            intentos++;
            if (numero == numeroRamdom) {
                System.out.println("Felicidades has ganado, y solo te tomo " + intentos + " intentos");
                break;
            } else if (numero != numeroRamdom) {
                System.out.println("ERROR. Intenta de nuevo ");
                System.out.println("El numero que estoy pensando es " + (numeroRamdom > numero ? "mayor" : "menor"));
            }
        }
    }
}
