package Funciones_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListaContador {
    public static void main(String[] args) {
        List<Integer> contador10 = new ArrayList<>();  // segundo <> hace referencia a Integer
        contador10.add(1);
        contador10.add(2);
        contador10.add(3);
        contador10.add(4);
        contador10.add(5);
        contador10.add(6);
        contador10.add(7);
        contador10.add(8);
        contador10.add(9);
        contador10.add(10);

//        for (int numero : contador10) {
//            System.out.println(numero);
//        }
        // System.out.println(contador10.get(3)); Nos devuelve 4 ( índice posicion 3).

//        // funcion Lambda ( programacion funcional)
//        contador10.forEach(numero -> {
//            System.out.println("Numero : "+numero);
//        });
        contador10.forEach(System.out::println);

        // Nuevo contador hasta 5
        System.out.println("\nContador hasta 5. ");
        List<Integer> contador5 = Arrays.asList(1,2,3,4,5);
        contador5.forEach(System.out::println);
    }
}
