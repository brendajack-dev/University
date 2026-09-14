package src.variables;

public class ReservaHoteles {
    public static void main(String[] args) {
        String nombreCliente = "Brenda";
        int dias = 5;
        double tarifaDiaria = 150.0;
        boolean tieneVistaMar = true;

        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("dias = " + dias);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistaMar = " + tieneVistaMar);

        double total = dias * tarifaDiaria;
        System.out.println("total = " + total);


    }
}
