package Sets;

import java.util.TreeSet;
import java.util.Set;
// SETS     no tienen índice, no se pueden repetir elementos.
public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Carlos");
        conjunto.add("Carlos"); // Set no permite elementos duplicados.
        conjunto.add("Manolo");
        conjunto.add("Victoria");
        conjunto.forEach(System.out::println);
        System.out.println("\nEliminamos Victoria. ");

        conjunto.remove("Victoria");
        conjunto.forEach(System.out::println);

    }

}
