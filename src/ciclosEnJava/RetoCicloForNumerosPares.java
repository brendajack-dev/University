package src.ciclosEnJava;

public class RetoCicloForNumerosPares {
    public static void main(String[] args) {
        System.out.println("*** Numero Pares del 0 al 20");

        for(var i = 1; i <= 20; i++){
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            
        }
    }
}
