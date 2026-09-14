package src.cadenas;

public class MetodosDeCadenas {
    public static void main(String[] args) {
        String cadena1 = "Hola mundo";

        int longitud = cadena1.length();
        System.out.println("La longitud de la cadena es: " + longitud);

        String nuevaCadena = cadena1.replace("o", "a");
        System.out.println("nuevaCadena = " + nuevaCadena);

        String mayuscula = cadena1.toUpperCase();
        System.out.println("mayuscula = " + mayuscula);

        System.out.println("minisculas = " + cadena1.toLowerCase());
        
        String cadena2 = " Leo Reyes ";
        System.out.println("cadena2.trim() = " + cadena2.trim());
    }
}
