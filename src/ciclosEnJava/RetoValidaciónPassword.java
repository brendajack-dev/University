package ciclosEnJava;

import java.util.Scanner;

public class RetoValidaciónPassword {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Validación de password ***");
        //la contraseña debe tener al menos 6 caracteres

        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese su nueva contraseña: ");
        String contrasena = consola.nextLine();

        if (contrasena.length() >= 6) {
            System.out.println("Su nueva contraseña es: " + contrasena);
        } else
            System.out.println("ERROR! Su contraseña debe tener al menos 6 caracteres");

    }
}
