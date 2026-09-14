package src.cadenas;

public class BusquedaSubcadenas {
    public static void main(String[] args) {
        String cadena1 = "Hola Mundo";

        //indexOf devuelve el index de la primera aparicion de la subcadena
        int indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        //lastIndexOf devuelve el index de la ultima aparicion de la subcadena
        int indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
    }
}
