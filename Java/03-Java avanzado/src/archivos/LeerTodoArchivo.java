package archivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class LeerTodoArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "miarchivo.txt";
        try {
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            lineas.forEach(System.out::println);   // imprimir con lambda
//            for (String linea : lineas){         // imprimir con forEach normal
//                System.out.println(linea);
//            }
        }catch (IOException e){
            System.out.println("Error: "+ e);
        }
    }
}
