package src.sentenciasdeDesicionJava;

import java.util.Scanner;

public class RetoMayorde2Numeros {
    public static void main(String[] args) {
        System.out.println("*** El Mayor de 2 Numeros ***");

        //Solicita al usuario dos numeros enteros
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Ingresa un numero enteros");
        int primerNumeroIngresado = Integer.parseInt(consola.nextLine());

        System.out.println("Ingresa un numero enteros");
        int segundoNumeroIngresado = Integer.parseInt(consola.nextLine());

        if(primerNumeroIngresado > segundoNumeroIngresado){
            System.out.println("El numero mayor es: " + primerNumeroIngresado);
        } else if (primerNumeroIngresado < segundoNumeroIngresado){
            System.out.println("El numero mayor es: " + segundoNumeroIngresado);
        }else{System.out.println("Los numeros: " + primerNumeroIngresado +" y "+ segundoNumeroIngresado + " Son iguales ");}   
    }
}
