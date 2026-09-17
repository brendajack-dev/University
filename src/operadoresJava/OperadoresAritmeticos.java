package src.operadoresJava;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        System.out.println("*** Operadores Aritmeticos ***");

        double a = 5, b=3, resultado;
        //Suma +
        resultado = a + b;
        System.out.println("resultado Suma = " + resultado);
        //Resta -
        resultado = a - b;
        System.out.println("resultado Resta = " + resultado);
        //Multiplicacion *
        resultado = a * b;
        System.out.println("resultado Multiplicacion = " + resultado);
        //Division /
        resultado = a / b;
        System.out.println("resultado Division = " + resultado);
        //Modulo (Residuo de la division) %
        resultado = a % b;
        System.out.println("resultado Modulo = " + resultado);
    }
}
