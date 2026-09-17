package src.operadoresJava;

import java.util.Scanner;

public class EjercicioSistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Sistema Descuentos VIP ***");
        final int NO_PRODUCTOS_DESCUENTO = 10;
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingrese el total de productos comprados: ");
        int totalProductos = Integer.parseInt(consola.nextLine());

        System.out.println("Tienes membresia VIP? (true/false): ");
        boolean esMembresiaVIP = Boolean.parseBoolean(consola.nextLine());

        boolean aplicaDescuento = totalProductos >= NO_PRODUCTOS_DESCUENTO && esMembresiaVIP;
        System.out.println("¿Aplica descuento? " + aplicaDescuento);
    }
}
