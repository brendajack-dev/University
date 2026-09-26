package src.sentenciasdeDesicionJava;

import java.util.Scanner;

public class ReotSistemaDeAutenticacion {
    public static void main(String[] args) {
        
        System.out.println("*** Sistema de autenticación ***");

        final String USUARIO  = "Brenda";
        final String CONTRASEÑA  = "Brenda";
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa tu usuario: ");
        String usuario = consola.nextLine().trim();

        System.out.print("Ingresa tu contraseña: ");
        String contraseña = consola.nextLine().trim();

        if (USUARIO == usuario && CONTRASEÑA == contraseña) {
            System.out.println("*** Bienvenido al Sistema ***");
        } else if(USUARIO == usuario){
            System.out.println("Contraseña Incorrecta");
        } else if (CONTRASEÑA == contraseña){
            System.out.println("Usuario Incorrecto");
        } else {
            System.out.println("Usuario y contraseña invalidos: " + usuario + " " + contraseña);
        }


    }
}
