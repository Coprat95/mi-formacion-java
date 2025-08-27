public class TiposDatos {
    public static void main(String[] args) {
        // Tipos de datos en java
        // Enteros
        byte tipoByte = 127;  // nº 127 máximo
        System.out.println("tipoByte = " + tipoByte); // soutv te hacer sout + variable
        
        short tipoShort = 32000;
        System.out.println("tipoShort = " + tipoShort); // limita 32000
        
        int tipoInt = 2147483647 ; // limita con ese rango (32bits)
        
        long tipoLong = 987654321098765432L; // se ha de poner una "L" para indicar que es long.
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotante  (0.0) valor por defecto
        float tipoFloat = 3.14F; //se ha de indicar que es tipo float "F".
        double tipoDouble = 3.131516; // hasta 64 bits , se puede poner "D"

        // POR DEFAULT  : INT (entero) DOUBLE (punto flotante)

        // Caracter (`\u0000') valor por defecto
        char tipoChar = 'A'; // Carácteres del juego unicode 
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65; // equivalente a letra A  en el juego de caracteres unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);
        
        // Booleano (false valor por defecto)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Tipos object (referencia, null por defecto)
        String nombre = null;
        System.out.println("nombre = " + nombre);
        nombre = "Juan Perez";
        System.out.println("nombre = " + nombre);
        
    }
}
