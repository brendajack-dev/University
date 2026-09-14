package src.variables;

public class DetalleLibro {
    public static void main(String[] args) {
        String Libro = "El Sr de los AnilloS";
        int añoPublicacion = 1994;
        boolean disponible = true;
        double precio = 500.5;

        System.out.println(Libro);
        System.out.println(añoPublicacion);
        System.out.println(disponible);
        System.out.println(precio);
        Libro = "El Sr de los anillos";
        System.out.println(Libro);
    }
}