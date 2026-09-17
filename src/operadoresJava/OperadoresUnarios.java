package src.operadoresJava;

public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ***");
        int a= 3, b=-2, resultado;
        boolean c = true;
        //Incremento Unario +
        resultado = +a;
        System.out.println("resultado Incremento Unario +a = " + resultado);
        System.out.println("");
        //Decremento Unario -
        resultado = -a;
        System.out.println("resultado Decremento Unario -a = " + resultado);
        System.out.println("");
        //Operadores unarios incremento y decremento
        //preincremento
        a=3;
        resultado = ++a; //incrementa y despues la usa
        System.out.println("resultado Preincremento ++a = " + resultado);
        System.out.println("valor de a = " + a);
        System.out.println("");
        //postincremento
        a=3;
        resultado = a++; //La usa y despues la incrementa
        System.out.println("resultado Postincremento a++ = " + resultado);
        System.out.println("valor de a++ = " + a);
        System.out.println("");
        //predecremento
        b=-2;
        resultado = --b; //decrementa y despues la usa
        System.out.println("resultado Predecremento --b = " + resultado);
        System.out.println("valor de b = " + b);
        System.out.println("");
        //postdecremento
        b=-2;
        resultado = b--; //La usa y despues la decrementa
        System.out.println("resultado Postdecremento b-- = " + resultado);
        System.out.println("valor de b-- = " + b);
        System.out.println("");
    }
}
