package src.operadoresJava;

public class OperadorLogicoOr {
    public static void main(String[] args) {
        System.out.println("*** Operador Logico OR ***");
        //OR || Pay (regresa true si al menos uno de los operandos es true, de lo contrario regresa false)
        boolean a = false, b = false, resultado; 
        resultado = a || b;
        System.out.println("resultado a || b = " + resultado);
    }
}
