package ciclosEnJava;

import java.util.Scanner;

public class RetoCajeroAutomatico {
    public static void main(String[] args) {
        boolean salir =false;

        while (!salir) {
        System.out.println("\n*** Cajero Automatico ***");

        double saldo = 1000.00;
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Acciones que puedes realizar: \n" + 
            "1. Consultar Saldo\n" + 
            "2. Retirar\n" +
            "3. Depositar\n" +
            "4. Salir\n" + 
            "Ingresa el numero de opcion: ");
        int accion = Integer.parseInt(consola.nextLine());

        switch (accion) {
            case 1:
                System.out.print("Tu saldo es: $"+ saldo);
                break;
            case 2:
                System.out.print("Ingresa el monto a retirar: $");
                double montoRetiro = Double.parseDouble(consola.nextLine());
                System.out.println(montoRetiro <= saldo ? "Tu nuevo saldo es: $" + (saldo - montoRetiro): "No cuentas con el saldo suficiente. Tu saldo es: $" + saldo);
                break;
            case 3:
                System.out.print("Ingresa el monto a depositar: $");
                double montoDepositado = Double.parseDouble(consola.nextLine());
                montoDepositado += saldo;
                System.out.println("Tu nuevo saldo es: $" + montoDepositado );
                break;
            case 4:
                System.out.print("Saliendo...");
                break;
            default:
                System.out.print("Opcion no valida, intenta nuevamente...");
                break;
        }
        }
    }
}
