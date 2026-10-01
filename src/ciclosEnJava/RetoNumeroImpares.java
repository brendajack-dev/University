package src.ciclosEnJava;

public class RetoNumeroImpares {
    public static void main(String[] args) {
        System.out.println("*** Imprimir numeros impares en java ***");

        var contador = 1;

        do{
            if (!(contador % 2 == 0)) {
                System.out.print(contador + " ");
            } contador ++;
        }while(contador <= 20);
        
    }   
}
