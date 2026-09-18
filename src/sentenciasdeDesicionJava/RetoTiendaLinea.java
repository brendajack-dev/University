package src.sentenciasdeDesicionJava;

import java.util.Scanner;

public class RetoTiendaLinea {
    public static void main(String[] args) {
        System.out.println("*** Reto Tienda en Línea ***");

        //Definimos variables
        double montoMinCompra = 1000.0;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa el monto de la compra: ");
        double montoCompra = Double.parseDouble(scanner.nextLine());

        System.out.print("Eres miembro de la tienda? (true/false): ");
        boolean esMiembro = Boolean.parseBoolean(scanner.nextLine());

        //Revisamos las condiciones para aplicar el descuento
        if(montoCompra >= montoMinCompra && esMiembro){
            //Calculamos el descuento del 10%
            double montoDescuento = (montoCompra * 10) / 100;
            //Imprimimos el ticket
            System.out.printf(
                "¡Felicidades! Tienes un descuento del 10%% en tu compra.%n" +
                "Monto de la compra: $%.2f%n" +
                "Monto del descuento: $%.2f%n" +
                "Monto final de la compra con descuento: $%.2f%n",
                montoCompra,
                montoDescuento,
                montoCompra - montoDescuento
            );
        }else if (esMiembro) {
            //Calculamos el descuento del 5%
            double montoDescuento = (montoCompra * 5) / 100;
            //Imprimimos el ticket
            System.out.printf("Felidades! Tienes un descuento del 5%% en tu compra.%n" + 
                "Monto de la compra: $%.2f%n" + 
                "Monto del descuento: $%.2f%n" +
                "Monto final de la compra con descuento: $%.2f%n"
                ,montoCompra, montoDescuento, montoCompra - montoDescuento
            );
        }else{
            System.out.printf("No tienes un descuento en tu compra.%n" + 
                "Te invitamos a hacerte miembre de la tienda.%n" + 
                "Monto final de la compra: $%.2f", montoCompra
            );
        }
    }
}
