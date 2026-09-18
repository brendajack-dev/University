package src.operadoresJava;

public class OperadorLogicoNot {
    public static void main(String[] args) {
        System.out.println("*** Operador Logico NOT ***");
        //NOT ! (invierte el valor de un booleano, si es true regresa false y si es false regresa true)
        boolean a = true, resultado;
        resultado = !a;
        System.out.println("resultado !a = " + resultado);
    }
}
