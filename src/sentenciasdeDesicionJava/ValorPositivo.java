package src.sentenciasdeDesicionJava;

import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        System.out.println("*** Valor Positivo ***");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero > 0) {
            System.out.println("El número es positivo");
        } else if (numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es cero");
        }
    }
}
