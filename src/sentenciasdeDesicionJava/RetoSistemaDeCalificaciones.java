package sentenciasdeDesicionJava;

public class RetoSistemaDeCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Calificaciones ***");

        //Declaramos las variables
        int calificacionNumerica = 5;
        String  calificacion;

        //Ejecutamos la logica
        if(calificacionNumerica >= 9 && calificacionNumerica <=10)
            calificacion = "A";
        else if (calificacionNumerica >= 8 && calificacionNumerica < 9) 
            calificacion = "B";
        else if (calificacionNumerica >= 7 && calificacionNumerica < 8) 
            calificacion = "C";
        else if (calificacionNumerica >= 6 && calificacionNumerica < 7) 
            calificacion = "D";
        else if (calificacionNumerica >= 0 && calificacionNumerica < 6) 
            calificacion = "F";
        else
            calificacion = "Desconocido";

        //Imprimimos el resultado
        System.out.println("\nTu calificacion es: " + calificacion);
    }
}
