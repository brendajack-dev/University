package src.cadenas;

public class GenerarEmail {
    public static void main(String[] args) {
        String nombre = "Juan";
        String empresa = "Laboratorio Raam";
        String dominio = ".com";
        String email;

        email = nombre.toLowerCase() + "@" + empresa.toLowerCase().replace(" ","") + dominio;
        System.out.println(email);
    }
}
