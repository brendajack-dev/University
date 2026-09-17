package src.EntradaDatosPorConsola;

import java.util.Random;

public class NumeroAleatorios {
    public static void main(String[] args) {
        System.out.println("*** Numeros Aleatorios ***");
        Random random = new Random();

        int numeroAleatorio = random.nextInt(10); // Genera un número aleatorio entre 0 y 9
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        numeroAleatorio = random.nextInt(10) + 1; // Genera un número aleatorio entre 1 y 10
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        float numeroAleatorioFloat = random.nextFloat(); // Genera un número aleatorio entre 0.0 y 1.0
        System.out.println("numeroAleatorioFloat = " + numeroAleatorioFloat);

        int dado = random.nextInt(6) + 1; // Genera un número aleatorio entre 1 y 6 (simulando un dado)
        System.out.println("Resultado de lanzar el dado = " + dado);
    }
}
