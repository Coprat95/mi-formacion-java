package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Inventario;
import maquina_snacks_archivos.dominio.Snack;

import java.util.List;

public class ServicioInventarioListas implements  IServicioInventario {
    // Implementamos los métodos que heredamos de la interface
    // Creamos un objeto inventario para ello
    private final Inventario inventario = new Inventario();

    @Override
    public void inicializadorInventario(){
        inventario.inicializadorInventario();
    }
    @Override
    public void agregarSnack(String nombre, double precio, int stock){
        inventario.agregarSnack(nombre, precio, stock);
    }
    @Override
    public void mostrarInventario(){
        inventario.mostrarInventario();
    }
    @Override
    public Snack buscarPorId(int id){
       return inventario.buscarPorId(id);
    }
    @Override
    public List<Snack> getSnacks(){
       return  inventario.getSnacks();
    }

}


