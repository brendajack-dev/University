package src.variables;

public class ReglasNombresVariables {
    public static void main(String[] args) {
        //camelCase
        String nombreCompleto = "Juan Pérez";
        System.out.println(nombreCompleto);

        String $nombreCompleto = "Juan";
        System.out.println($nombreCompleto);
        String _nombreCompleto = "Juan";
        System.out.println(_nombreCompleto);
        boolean casado = true; // Es correcto pero puede mejorar
        System.out.println("casado = " + casado);
        boolean esCasado = true;
        System.out.println("esCasado = " + esCasado);
        boolean tieneSaldo = true;
        System.out.println("tieneSaldo = " + tieneSaldo);
    }
}
