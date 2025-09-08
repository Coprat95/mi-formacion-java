package  maquina_snacks_Oliver;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private final List<Snack> snacks; // final para apuntar siempre a snacks

    public Inventario(){
        snacks = new ArrayList<>();
        inicializadorInventario();  // iniciamos Inventario
    }
    private void inicializadorInventario(){  // Valores de ejemplo
        agregarSnack("Chocolate",1.20);
        agregarSnack("Patatas",1.30);
        agregarSnack("Refresco",1.50);
        agregarSnack("Sandwich",3.10);
    }
    // Metodo agregarSnack
    public void agregarSnack(String nombre, double precio){
        snacks.add(new Snack(nombre,precio));

    }
    //Metodo getSnacks para recuperar la lista snacks en todo momento
    public List<Snack> getSnacks(){
        return snacks;
    }
    // Metodo buscar por id
   public Snack  buscarPorId(int id){
      for (Snack s : snacks){
          if (s.getId() == id){
              return s; // en caso de que coincida el id introducido con
                        // el id de un producto nos devuelve el producto
          }
      }
      return null;      // si no coincide nos devuelve nulo
    }
 }
