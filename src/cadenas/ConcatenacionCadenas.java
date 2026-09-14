package src.cadenas;

public class ConcatenacionCadenas {
    public static void main(String[] args) {
        System.out.println("Concatenacion de cadenas en Java");
        var nombre = "Alexa";
        var apellido = "Cruz";
        //concatecar con "+"
        System.out.println("Hola, mi nombre es " + nombre + " " + apellido);

        //.concat
        String concatenacion = nombre.concat(" ").concat(apellido);
        System.out.println("concatenacion = " + concatenacion);

        //StringBuilder es mutable y no crea varias cadenas en memoria
        StringBuilder constructorCadenas = new StringBuilder();
        constructorCadenas.append(nombre);
        constructorCadenas.append(" ");
        constructorCadenas.append(apellido);
        String resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        //StringBuffer es mas recomendable cuando trabajas con varios hilos
        StringBuffer bufferCadenas = new StringBuffer();
        bufferCadenas.append(nombre).append(" ").append(apellido);
        resultado = bufferCadenas.toString();
        System.out.println("resultado2 = " + resultado);

        //join
        resultado = String.join(" ", nombre, apellido);
        System.out.println("resultado3 = " + resultado);




    }
}
