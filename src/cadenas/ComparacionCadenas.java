package src.cadenas;

public class ComparacionCadenas {
    public static void main(String[] args) {
        String  cadena1 = "Java";
        String  cadena2 = "Java";
        System.out.print("cadena1 es igual en referencia a la cadena2: ");
        System.out.println(cadena1 == cadena2);

        String  cadena3 = new String("Java");
        System.out.print("cadena1 es igual en referencia a la cadena3: ");
        System.out.println(cadena1 == cadena3);

        System.out.print("cadena1 es igual en referencia a la cadena3: ");
        System.out.println(cadena1.equals(cadena3));
    }
}
