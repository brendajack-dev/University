package src.EntradaDatosPorConsola;

import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args){
        System.out.println("*** Generador de ID Unico ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = consola.nextLine();

        System.out.print("Ingrese su apellido: ");
        String apellido = consola.nextLine();

        System.out.print("Ingrese su año de nacimiento (YYYY): ");
        String nacimiento = consola.nextLine();
        
        Random random = new Random();
        int ramdom = random.nextInt(10000) + 1; // Genera un número aleatorio entre 1 y 9999
        String randomFormateado = String.format("%04d", ramdom); // Formatea el número con ceros a la izquierda
        
        String nombreFormateado = nombre.substring(0, 2).toUpperCase(); // Primeras dos letras del nombre en mayúsculas
        String apellidoFormateado = apellido.substring(0, 2).toUpperCase(); // Primeras dos letras del apellido en mayúsculas
        String nacimientoFormateado = nacimiento.substring(2, 4); // Últimos dos dígitos del año de nacimiento         
        
        System.out.printf("Hola " + nombre + "," + "\n\tTu ID único generado es:\n\t%s%s%s%s", nombreFormateado, apellidoFormateado, nacimientoFormateado, randomFormateado + "\n\tFelicidades!\n");

    }
}
