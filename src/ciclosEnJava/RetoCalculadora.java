package src.ciclosEnJava;

import java.util.Scanner;

public class RetoCalculadora {
    public static void main(String[] args) {

        boolean salir=false;
        Scanner consola = new Scanner(System.in);
        int valor1,valor2;
        while (!salir) {
            System.out.println("*** CALCULADORA ***");
            
            System.out.println("Acciones que puedes realizar: \n" + 
                "1. Suma\n" + 
                "2. Resta\n" +
                "3. Multiplicacion\n" +
                "4. Division\n" + 
                "5. Salir \n"+
                "Ingresa el numero de opcion: ");

            int accion = Integer.parseInt(consola.nextLine());
            
            if (accion >= 1 &&  accion < 5) {
                System.out.print("Ingresa el primer numero: ");
                valor1 = Integer.parseInt(consola.nextLine());

                System.out.print("Ingresa el segundo numero: ");
                valor2 = Integer.parseInt(consola.nextLine());

                System.out.println(
                (accion == 1) ? "\nEl resultado de la suma es: " + (valor1 + valor2) + "\n":
                (accion == 2) ? "\nEl resultado de la resta es: " + (valor1 - valor2)+ "\n":
                (accion == 3) ? "\nEl resultado de la multiplicacion es: " + (valor1 * valor2)+ "\n":
                "\nEl resultado de la Division es: " + (valor1 / valor2)+ "\n");
                
            }else if (accion == 5) {
                System.out.println("Saliendo...");
                salir = true;
            }else
                System.out.println("Opcion no valida, intentelo nuevamente.");
        }
    }
}
