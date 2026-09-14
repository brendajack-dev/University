package src.cadenas;

public class IndicesCadena {
    public static void main(String[] args) {
        String cadena1 = "Hola Mundo";
        char primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);

        char ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        char letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);

        cadena1 = "Hola Munda";
        System.out.println("cadena1 = " + cadena1);
    }
}
