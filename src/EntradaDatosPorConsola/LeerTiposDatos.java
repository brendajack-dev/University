package src.EntradaDatosPorConsola;

import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // leer entradas:
        // int
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        int edad = consola.nextInt();
        System.out.println("edad = " + edad);
        // double
        System.out.print("Ingresa tu edad: ");
        double edad1 = consola.nextDouble();
        System.out.println("edad = " + edad1);
        // Consumimos el caracter salto de linea
        consola.nextLine();
        // String
        System.out.print("Ingresa tu nombre: ");
        String nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        // conversion de datos
        System.out.println("Proporciona un valor entero: ");
        String enteroString = consola.nextLine();
        int entero = Integer.parseInt(enteroString);
        System.out.println("Entero: " + entero);
        // Flotante
        System.out.println("Proporciona un valor entero: ");
        float flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante: " + flotante);
        //Double.parseDouble()
        //Boolean.parseBoolean()

    }
}
