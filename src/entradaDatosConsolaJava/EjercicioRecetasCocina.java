package src.entradaDatosConsolaJava;

import java.util.Scanner;

public class EjercicioRecetasCocina {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Recetas de Cocina ***");
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la receta: ");
        String nombreReceta = consola.nextLine();

        System.out.print("Ingrese los ingredientes: ");
        String ingredientes = consola.nextLine();

        System.out.print("Ingrese el tiempo de preparación (en minutos): ");
        int tiempoPreparacion = consola.nextInt();

        consola.nextLine();
        System.out.print("Ingrese la dificultad de la receta : ");
        String dificultad = consola.nextLine();

        System.out.println("\n*** Información de la Receta ***");
        System.out.println("Nombre: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientes);
        System.out.println("Tiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("Dificultad: " + dificultad);    

        
    }
}
