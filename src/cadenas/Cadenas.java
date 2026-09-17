package src.cadenas;

public class Cadenas {
    public static void main(String[] args) {
        System.out.println("Cadenas de texto en Java:");
        String cadena = "Brenda";
        System.out.println("cadena = " + cadena);
        String cadena2 = new String("Brenda2");
        System.out.println("cadena2 = " + cadena2);
        String cadena3 = cadena + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        String cadena4 = "Este es un texto\n"
        + "multilinea\n"
        + "multilinea";
        System.out.println("cadena4 = " + cadena4);

    }
}
