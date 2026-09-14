package src.cadenas;

public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        String cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        String nuevaCadena = cadena1.replace("Mundo" , "a todos.");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
