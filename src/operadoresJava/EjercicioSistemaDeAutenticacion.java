package src.operadoresJava;

import java.util.Scanner;

public class EjercicioSistemaDeAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Sistema de Autenticacion ***");

        //Variables de usuario y contraseña
        final String usuario = "admin";
        final String contrasena = "123";

        //Variables de entrada del usuario
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingresa tu usuario:");
        String usuarioEntrada = String.valueOf(consola.nextLine().trim());

        System.out.print("Ingresa tu contraseña:");
        String contrasenaEntrada = String.valueOf(consola.nextLine().trim());

        //Verificar si el usuario y la contraseña son correctos
        boolean UsuarioCorrecto = usuario.equals(usuarioEntrada);
        boolean ContrasenaCorrecta = contrasena.equals(contrasenaEntrada);

        //Verificar si el usuario y la contraseña son correctos
        boolean autenticacionExitosa = UsuarioCorrecto && ContrasenaCorrecta;

        System.out.println("¿Autenticacion exitosa? " + autenticacionExitosa);

    }
}
