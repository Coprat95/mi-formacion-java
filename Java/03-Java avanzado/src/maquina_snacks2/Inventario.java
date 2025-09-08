package maquina_snacks2;

import java.util.ArrayList;
import java.util.List;

public  class Inventario {
   private final  List<Snack> snacks ;

    public Inventario (){
        snacks = new ArrayList<>();
        inicializarInventario();
    }

    private void inicializarInventario(){
        agregarSnack(new Snack("Patatas", 1.70));
        agregarSnack(new Snack("Refresco",2.20));
        agregarSnack(new Snack("Sandwich", 3.30));

    }
    public void agregarSnack(Snack snack){
        if (snack != null) {
            snacks.add(snack);
        }
    }
    public void mostrarInventario() {
        var inventario = """
                *** Inventario actual de snacks ***
                """;
        if (snacks.isEmpty()) {
            System.out.println("No hay snacks disponibles. ");
        } else {
            for (Snack snack : snacks){
                System.out.println(snack.mostrarSnack());
            }
        }
    }
    public Snack buscarPorId(int id) {
       for (Snack s: snacks) {
           if (s.getId()== id) {
               return s;
           }
       }
        return null;
    }
    public List<Snack> getSnacks (){
        return  snacks;
    }
}


