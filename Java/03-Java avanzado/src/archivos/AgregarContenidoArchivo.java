package archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class AgregarContenidoArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "miarchivo.txt";
        var archivo = new File(nombreArchivo);
        // si el archivo aparece append será true, sino será falso
        boolean append = archivo.exists();
        // si append = true. Añadimos texto al archivo.
        // si append = false. Sobreescribimos el archivo
        // salida (output) sale del programa (escribir)
        try (var salida = new PrintWriter(new FileWriter(archivo,append));
             Scanner scanner = new Scanner(System.in)){
            var entradaTexto = scanner.nextLine();
            salida.println(entradaTexto);
            System.out.println("Contenido agregado.");
        } catch (Exception e) {
            System.out.println("Excepción encontrada: "+ e.getMessage());
            e.printStackTrace();
        }
    }
}
