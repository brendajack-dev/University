package src.operadoresJava;

import java.util.Scanner;

public class EjercicioSistemaDeAutenticacion {
    public static void main(String[] args) {
        System.out.println("*** Ejercicio Sistema de Autenticacion ***");

        //Variables de usuario y contraseña
        String usuario = "admin";
        String contrasena = "1234";

        //Variables de entrada del usuario
        Scanner consola = new Scanner(System.in);
        System.out.print("Ingresa tu usuario: ");
        String usuarioEntrada = consola.nextLine();

        System.out.print("Ingresa tu contraseña: ");
        String contrasenaEntrada = consola.nextLine();

        //Verificar si el usuario y la contraseña son correctos
        boolean UsuarioCorrecto = usuario == usuarioEntrada;
        boolean ContrasenaCorrecta = contrasena == contrasenaEntrada;

        //Verificar si el usuario y la contraseña son correctos
        boolean autenticacionExitosa = UsuarioCorrecto && ContrasenaCorrecta;
        System.out.println("¿Autenticacion exitosa? " + autenticacionExitosa);

    
    }
}
