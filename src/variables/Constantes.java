package src.variables;

public class Constantes {
    public static void main(String[] args) {
        System.out.println("Uso de constantes en Java");
        final var DIAS_SEMANA = 7;
        System.out.println(DIAS_SEMANA);
        // DIAS_SEMANA = 8; // Esto generará un error, ya que DIAS_SEMANA es una constante

    }
}
