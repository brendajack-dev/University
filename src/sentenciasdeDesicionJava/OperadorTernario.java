package src.sentenciasdeDesicionJava;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        //Sintaxis
        //Condicion ? Exp1 : Exp2

        //Determinar si un numero es par o no
        int numero =4;
        String resultado = (numero % 2 == 0) ? "Par": "Impar"; //el operador ternario devuelve textos (String):
        System.out.println("El numero " + numero + "es " + resultado);

        //Calcular si es mayo de edad
        int edad = 17;
        String mensaje = (edad >= 18) ? "mayor de edad": "menor de edad";
        System.out.println("La edad es consideradada " + mensaje);

        //Valor positivo, negativo, cero (Operador ternario anidado)
        numero = 10 ;
        resultado = (numero >0 ) ? "Positivo": (numero < 0) ? "Negativo" : "Cero";
        System.out.println("El numero " + numero + " es " + resultado);
    }
}
