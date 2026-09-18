package src.sentenciasdeDesicionJava;

public class SentenciaIf {
    public static void main(String[] args) {
        System.out.println("*** Sentencia If ***");

        //Uso de la sentencia IF
        int edad = 15;

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else if (edad < 18 && edad >= 13) {
            System.out.println("Eres un adolescente");
        }
        else {
            System.out.println("Eres un niño");
        }
    }
}
