import java.util.Scanner;

public class RetoSumaDiagonalMatriz {
    public static void main(String[] args) {
        int renglones=0,columnas=0,suma=0;

        Scanner consola = new Scanner(System.in);

        System.out.print("¿Cuandtas renglones necesita tu matriz? ");
        renglones = Integer.parseInt(consola.nextLine());

        System.out.print("¿Cuandtas columnas necesita tu matriz? ");
        columnas = Integer.parseInt(consola.nextLine());
        
        int[][] matriz = new int [renglones][columnas];

        for(int ren=0; renglones>ren; ren++){
            for(int col=0; columnas>col; col++){
                System.out.println("Colunma [" + ren + "][" + col + "]: ");
                matriz[ren][col]= Integer.parseInt(consola.nextLine());
                if ( col==ren) {
                    suma += matriz[ren][col]; 
                }
            }
        }
        System.out.println("La suma de la diagonal es: " + suma);
    }
}
