package archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LeerArchivo {
    public static void main(String[] args) {
        // archivo hacia el cual queremos apuntar
        var nombreArchivo = "miarchivo.txt";
        File archivo = new File (nombreArchivo);
        // Canal de entrada de lectura
        try(BufferedReader entrada = new BufferedReader(new FileReader(archivo))){
            // linea será cada linea que leamos
         var linea = entrada.readLine();
         // mientras que la siguiente linea no sea null
         while (linea != null) {
             System.out.println(linea);  // imprime linea
             linea = entrada.readLine(); // linea = linea siguiente
         }
        }catch (IOException e){
            System.out.println("Error: "+ e);
        }
    }
}
