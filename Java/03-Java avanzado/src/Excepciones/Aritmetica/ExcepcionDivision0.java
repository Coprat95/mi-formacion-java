package Excepciones.Aritmetica;

/**
 * Excepción personalizada para indicar que se ha intentado dividir entre cero.
 */
public class ExcepcionDivision0 extends Exception {

    /**
     * Constructor que recibe un mensaje personalizado.
     *
     * @param mensaje el mensaje que describe el error
     */
    public ExcepcionDivision0(String mensaje) {
        super(mensaje);
    }
}