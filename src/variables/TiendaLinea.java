package src.variables;

public class TiendaLinea {
    public static void main(String[] args) {
        String nombreProducto = "Camiseta";
        double precioProducto = 50.5;
        int cantidadDisponible = 5;
        boolean esDisponible = true;

        System.out.println("Nombre del producto = " + nombreProducto);
        System.out.println("Precio del producto = " + precioProducto);
        System.out.println("Cantidad disponible = " + cantidadDisponible);
        System.out.println("Es disponible = " + esDisponible);
        nombreProducto = "Camiseta de manga larga";
        System.out.println("Nombre del producto = " + nombreProducto);
        precioProducto = 51.5;
        System.out.println("Precio del producto = " + precioProducto);
        cantidadDisponible = 50;
        System.out.println("Cantidad disponible = " + cantidadDisponible);
        esDisponible = false;
        System.out.println("Es disponible = " + esDisponible);
    }
}
