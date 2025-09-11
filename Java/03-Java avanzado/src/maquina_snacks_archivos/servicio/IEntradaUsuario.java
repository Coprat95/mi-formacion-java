package maquina_snacks_archivos.servicio;

public interface IEntradaUsuario {
    int leerEntero(String mensaje);
    double leerDouble(String mensaje);
    String leerCadena(String mensaje);
}
