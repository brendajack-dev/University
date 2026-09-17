package src.operadoresJava;

public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asignacion ***");
        //Asignacion simple =
        int miNumero;
        miNumero = 10;
        int miNumero2 = 15;

        //Asignacion compuesta
        //  +=
        miNumero += 5; //miNumero = miNumero + 5
        System.out.println("miNumero += 5 = " + miNumero);
        //  -=, *=, /=, y %=
        miNumero *= 2; //miNumero = miNumero * 2
        System.out.println("miNumero *= 2 = " + miNumero);
        //Asignacion de variables multiples
        int a, b, c;
        a = b = c = 10; //Asignacion de variables multiples; podria ser tambien a = 10; b = 10; c = 10;
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
    }
}
