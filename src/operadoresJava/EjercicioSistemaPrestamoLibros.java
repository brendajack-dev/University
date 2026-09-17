package src.operadoresJava;

import java.util.Scanner;

public class EjercicioSistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Sistema Prestamo Libros ***");
        
        //Preguntamos al usuario si tiene credencial y si vive cerca
        Scanner consola = new Scanner(System.in);

        System.out.print("¿Tienes crendecial? (true or false)");
        boolean tieneCredencia = Boolean.parseBoolean(consola.nextLine());

        System.out.print("¿Vives a no mas de 3km de la biblioteca? (true or false)");
        boolean viveCerca = Boolean.parseBoolean(consola.nextLine());

        //Evaluamos si el usuario puede tomar prestado un libro
        //Si vive a no mas de 3km de la biblioteca o tiene credencial puede tomar prestado un libro
        boolean puedeTomarPrestado = tieneCredencia || viveCerca;

        System.out.print("¿Puede tomar prestado un libro? " + puedeTomarPrestado);
    }
}
