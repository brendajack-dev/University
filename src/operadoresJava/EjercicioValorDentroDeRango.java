package src.operadoresJava;

import java.util.Scanner;

public class EjercicioValorDentroDeRango {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Valor Dentro De Rango ***");
        //Definimos los limites del rango
        final int Minimo = 0, Maximo = 5;
        //Solicitar un vqalor al usuario
        System.out.println("Ingresa un valor entre " + Minimo + " y " + Maximo);
        int consola = Integer.parseInt(new Scanner(System.in).nextLine());
        //Verificar si el valor esta dentro del rango
        boolean valorDentroDelRango = consola >= Minimo && consola <= Maximo;
        System.out.println("valorDentroDelRango = " + valorDentroDelRango);
    }
}
