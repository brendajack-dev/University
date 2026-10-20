package RetoEncapsulamiento.persona;
public class Persona {
    private String nombre;
    private String apellido;

    
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void concatenarNombre(){
        var resultado = this.nombre + this.apellido;
        System.out.println("Resultado del nombre: " + resultado);
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}