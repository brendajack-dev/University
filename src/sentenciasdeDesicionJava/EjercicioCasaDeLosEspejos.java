package src.sentenciasdeDesicionJava;

import java.util.Scanner;

public class EjercicioCasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("*** Bienvenido a la casa de los espejos ***");

        // Declaramos variables
        Scanner consola = new Scanner(System.in);
        boolean edadPermitida = true;

        // Preguntamos al usuarios los requisitos
        System.out.println("Ingresa tus años de edad: ");
        int edad = Integer.parseInt(consola.nextLine());

        System.out.println("¿Le tenemes a la oscuridad? (true or false): ");
        boolean temorOscuridad = Boolean.parseBoolean(consola.nextLine());

        // Verificamos la logica
        if(!temorOscuridad && edad >= 10){
            System.out.println("Puedes Ingresar");
        }else if (!(temorOscuridad == false) || (edad < 10)){
            System.out.println("No Puedes ingresar");
        }
    }
}
