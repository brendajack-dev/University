package src.EntradaDatosPorConsola;

import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        //Introducir valores por consola
        Scanner consola = new Scanner(System.in); // in - input - entrada de datos
        System.out.print("Escribe tu nombre: ");
        String nombre = consola.nextLine();
        System.out.println("Nombre = " + nombre);

    }
}