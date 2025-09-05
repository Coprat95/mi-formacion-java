package Funciones_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        // clase ArrayList es una de las clases que implementa la interface List
        // Añadimos elementos de tipo Object en este caso
        // List miLista = new ArrayList() ; Si no ponemos nada se crean de tipo Objeto ( genérico)

        List<String> miLista = new ArrayList<>() ;  // el segundo <> hace referencia al primero
                                                    // no se pone de nuevo String por redundancia
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        // miLista.add("Domingo"); Permite elementos duplicados una lista.
//        for (String dia : miLista) {
//            System.out.println(dia);
//        }

          //  System.out.println(miLista.get(5));  .get(indice) para obtener el elemento que quieras

        // Funciones Lambda (funcion anonima de un codigo muy compacto)
        // suelen tener un código de 1-2 lineas . Conocido como programación funcional
//        miLista.forEach( dia -> {
//            System.out.println("Dia semana: " + dia );
//        } );


        // se compone de  ( elemento  -> {  bloque código });
//        miLista.forEach( dia -> System.out.println("Día : "+dia));

        // forma más concisa y elegante
        // por cada elemento de la lista, pásalo  como argumento al metodo println
        // :: (referencia a   metodo).
        miLista.forEach(System.out::println); // = miLista.forEach(dia -> System.out.println(dia));


        // Creación nueva Lista

//        List<String> nombres = new ArrayList<>();
//        nombres.add("Pedro");
//        nombres.add("Ivonne");
//        nombres.forEach(System.out::println);

        // Forma más compacta pero menos modificable ( tamaño fijo)
        System.out.println("\nLista de nombres : ");
        List<String> nombres = Arrays.asList("Pedro","Ivonne","Nohemi");
        nombres.forEach(System.out::println);
    }
    }

