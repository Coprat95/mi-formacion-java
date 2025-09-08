package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {  // no lo hacemos JavaBeans ya que no vamos a instanciar objetos de ella
    // Creamos lista snacks
    private static final List<Snack> snacks; //  = new ArrayList<>();
    // no usamos un constructor ya que solo tiene un atributo y es static

    //Bloque static inicializador
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Patatas", 1.70));
        snacks.add(new Snack("Refresco", 1.50));
        snacks.add(new Snack("Sandwitch", 3.50));
    }

    public static void agregarSnack(Snack snack) {
        snacks.add(snack);
    }

    public static void mostrarSnacks() {
        var inventarioSnacks = "";
        // recorremos todos los snacks y los vamos guardando en inventarioSnacks
        for (var snack : snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el Inventario ---");
        System.out.println(inventarioSnacks);

    }
    public static List<Snack> getSnacks(){
        return  snacks;
    }
}


