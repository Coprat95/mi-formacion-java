package maquina_snacks;

public class OpcionNoValida_MS extends RuntimeException {
String mensaje;
public OpcionNoValida_MS (String mensaje) {
    super  (mensaje);
}
}
