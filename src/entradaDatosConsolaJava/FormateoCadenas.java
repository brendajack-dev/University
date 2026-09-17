package src.entradaDatosConsolaJava;

public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        String nombre = "Brenda";
        int edad = 30;
        double salario = 1234.56789;

        String mensaje = String.format("Mi nombre es %s, tengo %d años y mi salario es $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        System.out.printf("Mi nombre es %s, tengo %d años y mi salario es $%.2f%n", nombre, edad, salario);
        
        int numeroEmpleado =12;
        mensaje = 
        "\tDetalle Persona:\n"
        + "----------------------\n"
        + String.format("\tNombre: %s%n", nombre)
        + String.format("\tEdad: %d años %n", edad)
        + String.format("\tSalario: $%.2f%n", salario)
        + String.format("\tNúmero de Empleado: %04d%n", numeroEmpleado);
        System.out.println(mensaje);

        System.out.printf("\tDetalle Persona:\n ----------------------\n\t Nombre: %s \n\tEdad: %d años \n\tSalario: $%.2f \n\tNúmero de Empleado: %04d%n", nombre, edad, salario, numeroEmpleado);

    }
}
