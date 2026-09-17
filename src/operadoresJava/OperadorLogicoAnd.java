package src.operadoresJava;

public class OperadorLogicoAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador Logico AND ***");
        boolean a = true, b = true, resultado;

        //Operador Logico AND && (regresa true si ambos son true, de lo contrario regresa false) 
        resultado = a && b;
        System.out.println("resultado a && b = " + resultado);
    }
}
