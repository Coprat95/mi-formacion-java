//- Clase ValidadorEdad
//- Metodo validar(int edad)
//- Lanza EdadInvalidaException si:
//        - Edad < 18 → “Debes ser mayor de edad para registrarte.”
//        - Edad > 120 → “Edad no válida. ¿Seguro que no eres un vampiro?”

package Excepciones.ValidarEdad;


public class ValidadorEdad {
    public void validar (int edad) throws EdadInvalidaException {

        if (edad <18 ) {
            throw new EdadInvalidaException("Debes ser mayor de edad para registrarte. ");
        }
        if (edad > 120 ) {
            throw  new EdadInvalidaException("Edad no válida. Seguro que no eres un vampiro? ");
        }
        System.out.println("Edad válida. Registro existoso. ");

    }
}
