package src.operadoresJava;

public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Comparacion ***");
        int a = 3, b = 2;
        //Operador de igualdad ==
        //presedencia de operadores es que primero se ejecutan los operadores aritmeticos y despues los de comparacion
        boolean resultado = a == b;
        System.out.println("resultado a == b = " + resultado);
        //Distinto de !=
        resultado = a != b;
        System.out.println("resultado a != b = " + resultado);
        //Mayor que >
        resultado = a > b;
        System.out.println("resultado a > b = " + resultado);
        //Menor que <
        resultado = a < b;
        System.out.println("resultado a < b = " + resultado);
        //Mayor o igual que >=
        resultado = a >= b;
        System.out.println("resultado a >= b = " + resultado);
        //Menor o igual que <=
        resultado = a <= b;
        System.out.println("resultado a <= b = " + resultado);
    }
}
