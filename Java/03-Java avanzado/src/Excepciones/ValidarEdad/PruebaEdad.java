//- Clase PruebaEdad
//- Pide al usuario su edad por consola
//- Llama al metodo validar
//- Usa try-catch-finally para manejar la excepción y mostrar mensajes adecuados


package Excepciones.ValidarEdad;
import java.util.Scanner;

public class PruebaEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);
        ValidadorEdad validador1 = new ValidadorEdad();
        System.out.println("Introduzca su edad: ");
        try {
            validador1.validar(scanner.nextInt());
        } catch  (EdadInvalidaException e ) {
            System.err.println("Error encontrado: "+e.getMessage());
        } finally {
            System.out.println("Proceso de validación de edad finalizado. ");
        }
    }
}
