package src.EntradaDatosPorConsola;

import java.util.Scanner;

public class EjercicioSistemaEmpleados {
    public static void main(String[] args) {
        System.out.println("*** Sistema Empleados ***");
        System.out.println("Ingrese su nombre: ");
        String nombre = new Scanner(System.in).nextLine();

        System.out.println("Ingrese su edad: ");
        Scanner consola = new Scanner(System.in);
        int edad = consola.nextInt();

        System.out.println("Ingrese su salario: ");
        String salario = String.format("%.2f", consola.nextDouble());

        System.out.println("Eres jefe? ");
        Boolean eresJefe = consola.nextBoolean();

        System.out.println("\n*** Esta es la informacion guardada ***");
        System.out.println("\tTu nombre es: " + nombre);
        System.out.println("\tTu edad es: " + edad);
        System.out.println("\tTu salario es: " + salario);
        System.out.println("\tEres jefe? (True/False): " + eresJefe);
    }
}
