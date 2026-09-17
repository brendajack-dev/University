package src.operadoresJava;

import java.util.Scanner;

public class EjercicioGeneracionTicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Generacion Ticket Venta ***");
        
        //Solicita el precio de cada producto
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa el precio del producto 1: ");
        double precioProducto1 = Double.parseDouble(consola.nextLine());

        System.out.print("Ingresa el precio del producto 2: ");
        double precioProducto2 = Double.parseDouble(consola.nextLine());

        System.out.print("Ingresa el precio del producto 3: ");
        double precioProducto3 = Double.parseDouble(consola.nextLine());
        
        System.out.print("Ingresa el precio del producto 4: ");
        double precioProducto4 = Double.parseDouble(consola.nextLine());

        //Calcula el total de la venta sin impuestos
        double subTotal = precioProducto1 + precioProducto2 + precioProducto3 + precioProducto4;
        System.out.printf("Subtotal: $%.2f%n", subTotal);

        //Calcula el impuesto (IVA) del 16%
        double impuesto = subTotal * 0.16;
        System.out.printf("Impuesto (IVA 16%%): $%.2f%n", impuesto);

        //Calcula el total de la venta con impuestos
        double total = subTotal + impuesto;
        System.out.printf("Total a pagar: $%.2f%n", total);

        
    }
}
