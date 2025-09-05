package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapa2 {
    public static void main(String[] args) {
        Map <String,Integer> edades = new HashMap<>();
        edades.put("Oliver",29);
        edades.put("Alicia",30);
        edades.put("Eric",32);

        edades.entrySet().forEach(System.out::println);

        edades.forEach((nombre,edad) ->{
            System.out.println(nombre);
            System.out.println(edad);  // lo imprime por separado
        });

        }
    }

