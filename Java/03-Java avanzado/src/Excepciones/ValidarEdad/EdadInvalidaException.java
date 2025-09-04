// - Clase EdadInvalidaException
//- Hereda de RuntimeException
//- Tiene un constructor que recibe un mensaje personalizado

package Excepciones.ValidarEdad;

public class EdadInvalidaException extends RuntimeException{
    public EdadInvalidaException (String mensaje) {
        super (mensaje);
    }
}
