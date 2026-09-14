package src.cadenas;

public class ManejoSubcadenas {
    public static void main(String[] args) {
        String cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        String subcadena1 = cadena1.substring(0,4);
        System.out.println("subcadena1 = " + subcadena1);
        String subcadena2 = cadena1.substring(5,10);
        System.out.println("subcadena2 = " + subcadena2);
    }
}
