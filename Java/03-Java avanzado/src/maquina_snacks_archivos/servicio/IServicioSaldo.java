package maquina_snacks_archivos.servicio;

public interface IServicioSaldo {
    void agregarSaldo(double cantidad);
    boolean descontarSaldo(double cantidad);
    double getSaldoDisponible();
}
