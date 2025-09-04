//- Crea una clase PruebaContrasena con un metodo main que:
//        - Llame al metodo validar
//- Capture la excepción con try-catch
//        - Muestre un mensaje adecuado al usuario
//- Use finally para imprimir un mensaje como “Proceso de validación finalizado

package Excepciones.ValidarContrasena;
import java.util.Scanner;
public class PruebaContrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        ValidadorContrasena validador = new ValidadorContrasena();
        System.out.println("Introduzca una contraseña: Debe tener un mínimo de 8 caracteres " +
                "e incluir una letra mayúscula y un número. ");
        try {
            validador.validar(scanner.nextLine());
        } catch (ContrasenaInvalidaException e) {
            System.err.println("Excepción lanzada. " + e.getMessage() );
        }
        finally {
            System.out.println("Proceso de validación de contraseña finalizado. ");
        }
    }
}