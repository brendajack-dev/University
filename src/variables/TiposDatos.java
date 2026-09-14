package src.variables;

public class TiposDatos {
    public static void main(String[] args) {
        //Enteros 0
        byte tipoByte =127;
        System.out.println("tipoByte = " + tipoByte);
        short tipoShort =30000;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt =2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 987654321L;
        System.out.println("tipoLong = " + tipoLong);

        //Flotante 0.0
        float tipoFloat = 3.14F;
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1315D;
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracter (\u0000)
        char tipoChar = 'A';
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);
        //Boolean (false)
        boolean tipoBool = true;
        System.out.println("tipoBool = " + tipoBool);

        //Tipos Objet (Referencia)
        String nombre = null;
        System.out.println("nombre = " + nombre);

        //prefijos y
    }
}
