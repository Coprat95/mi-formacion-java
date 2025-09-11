package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.List;

public interface IServicioInventario {
    // Definimos todos los métodos tal y como están en Inventario, que se deben implementar ->  Son public por defecto
    void inicializadorInventario();
    void agregarSnack(String nombre, double precio, int stock);
    void mostrarInventario();
    Snack buscarPorId(int id);
    List<Snack> getSnacks();

}