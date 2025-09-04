//Crea la clase ContrasenaInvalidaException con un constructor que reciba un mensaje.


package Excepciones.ValidarContrasena;

public class ContrasenaInvalidaException extends  RuntimeException{
    public ContrasenaInvalidaException (String mensaje) {
        super(mensaje);

    }

}