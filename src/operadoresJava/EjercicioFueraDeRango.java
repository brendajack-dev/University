package src.operadoresJava;

import java.util.Scanner;

public class EjercicioFueraDeRango {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Fuera de Rango ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa un numero entero: ");
        int numero = Integer.parseInt(consola.nextLine());

        // Verificar si el número está dentro del rango [1, 10]
        boolean fueraDeRango = numero >= 1 && numero <= 10;
        System.out.println("¿Está el número dentro de rango? " + fueraDeRango);

        //Verificar la logica inversa, si el número está dentro del rango [1, 10]
        boolean dentroDeRango = !(numero >= 1 && numero <= 10);
        System.out.println("¿Está el número fuera de rango? " + dentroDeRango);
    }
}
