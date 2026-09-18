package src.operadoresJava;

import java.util.Scanner;

public class EjercicioCalcularAreayPerimetro {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Area y Perimetro ***");

        //Variables de entrada
        System.out.println("Ingresa la base del rectangulo:");
        Scanner consola = new Scanner(System.in);
        double base = Double.parseDouble(consola.nextLine());

        System.out.println("Ingresa la altura del rectangulo:");
        double altura = Double.parseDouble(consola.nextLine());
        
        
        //Calculo del area y perimetro
        double area = base * altura;
        double perimetro = 2 * (base + altura);

        //Impresion de resultados
        System.out.println("Area: " + area);
        System.out.println("Perimetro: " + perimetro);
    }
}
