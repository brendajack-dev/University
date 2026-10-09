import java.util.Scanner;

public class RetoPromedioCalificaciones {
    public static void main(String[] args) {
        // Introducir valores a un arreglo
        var consola = new Scanner(System.in);
        // Declarar el arreglo
        System.out.print("Cuantas calificaciones deseas agregar? ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        // Creamos de manera dinámica el arreglo
        var enteros = new int[largoArreglo];
        // Solicitar los valores del arreglo
        var sumaArreglo = 0;
        for(var i=0; i < largoArreglo; i++){
            System.out.print("Calificacion[" + i + "] = ");
            enteros[i] = Integer.parseInt(consola.nextLine());
            //Sumamos todos los datos del arreglo
            sumaArreglo += enteros[i];
        }
        // Obtenemos el promedio
        var promedioArreglo = sumaArreglo / largoArreglo;
        //Imprimimos el promedio
        System.out.println("\nPromedio : " + promedioArreglo);
    }
}
