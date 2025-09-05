package Mapas;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        // MAPAS  : se componen de los elementos Llave - Valor
        // Son diccionarios: Un concepto: un valor asociado a ese concepto ( llave -> valor )

        // Interface Map <tipodato, valorasociado>  nombremapa = new  HashMap<>(); ( en este caso)
        Map <String, String> persona = new HashMap<>();
        persona.put("nombre","Diego");
        persona.put("apellido","Flores");
        persona.put("edad","31");
        System.out.println("Valores del mapa : ");

        // Peculiaridad en mapas a la hora de IMPRIMIR
        // primero se ha de generar un tipo SET ( los almacena de forma simple en forma llave-valor )
        // Luego por cada uno de los elementos tipo SET se recorre con el foreach
        persona.entrySet().forEach(System.out::println);
    }
}
