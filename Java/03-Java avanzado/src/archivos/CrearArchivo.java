package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Clase que permite crear un archivo de texto a partir del nombre ingresado por el usuario.
 * Utiliza la clase {@code Scanner} para leer la entrada desde consola.
 */
public class CrearArchivo {

    /**
     * Método principal que inicia la ejecución del programa.
     *
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        crearArchivo(scanner);
    }

    /**
     * Método que se utiliza para crear un archivo.
     * Llama al método {@code leerString} para obtener el nombre del archivo.
     * Si el nombre está vacío o el archivo ya existe, se sale del método.
     * En caso contrario, se crea el archivo.
     *
     * @param scanner Objeto Scanner para leer la entrada del usuario
     * @return El archivo creado, o {@code null} si no se pudo crear
     */
    public static File crearArchivo(Scanner scanner) {
        String nombreArchivo2 = leerString("Introduzca el nombre del archivo.", scanner);
        File archivo = new File(nombreArchivo2);

        if (archivo.exists()) {
            System.out.println("El archivo ya existe.");
            return null;
        } else if (nombreArchivo2.trim().isEmpty()) {
            System.out.println("No se puede crear un nombre vacío.");
            return null;
        } else {
            try (PrintWriter salida = new PrintWriter(new FileWriter(archivo))) {
                System.out.println("Archivo creado.");
            } catch (IOException e) {
                System.out.print("Error: ");
                e.printStackTrace();
            }
        }

        return archivo;
    }

    /**
     * Muestra un mensaje en consola y devuelve la línea ingresada por el usuario.
     *
     * @param mensaje Mensaje que se mostrará al usuario
     * @param scanner Objeto Scanner para leer la entrada
     * @return Cadena ingresada por el usuario
     */
    public static String leerString(String mensaje, Scanner scanner) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }
}