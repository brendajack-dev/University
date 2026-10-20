package RetoEncapsulamiento.prueba;

import RetoEncapsulamiento.persona.Persona;

public class ClasePersona {
    String nombre;
    String apellido;

    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y Objetos Persona ***");
        var persona1 = new Persona("Brenda ", "Padilla");
        persona1.concatenarNombre();
        
    }
}