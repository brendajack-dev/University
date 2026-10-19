package sentenciasdeDesicionJava;

import java.util.Scanner;

public class RetoSistemaReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de un Hotel");

        //Solicitamos la informacion al usuario
        double precioTotal;
        String vistaAlMar;
        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = consola.nextLine();
        
        System.out.print("Ingrese ¿Cuantos dias le gustaria reservar estadia en nuestro Hotel? ");
        int diasReservados = Integer.parseInt(consola.nextLine());
        
        System.out.print("¿Le gustaria que su cuarto tenga vista al mar? (responda true or false) ");
        boolean siRequireCuartoConVistaAlMar = Boolean.parseBoolean(consola.nextLine());

        //Tarifas del hotel por dia
        final double CUARTO_SIN_VISTAL_MAR = 150.50;
        final double CUARTO_CON_VISTAL_MAR= 190.50;

        //Calculamos el precio
        if (siRequireCuartoConVistaAlMar){

            precioTotal = CUARTO_CON_VISTAL_MAR * diasReservados;
            vistaAlMar = "Si";
        } else
            precioTotal = CUARTO_SIN_VISTAL_MAR * diasReservados;
            vistaAlMar = "No";
        
        //Imprimimos el resultado
        System.out.printf("%n------ Detalles de la Reservacion -----" + 
            "%nCliente: %s" + 
            "%nDías de estandía: %d" + 
            "%nCosto total: %.2f" + 
            "%nHabitación con vista al mar: %s"
            ,  nombre, diasReservados, precioTotal, vistaAlMar
            //siRequireCuartoConVistaAlMar ? "Si" : "No" ; 
        );
    }
}
