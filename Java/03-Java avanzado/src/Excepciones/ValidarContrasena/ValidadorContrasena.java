//Crea una clase ValidadorContrasena con un
// metodo validar(String contrasena) que lance la excepción si la contraseña no es válida.


package Excepciones.ValidarContrasena;

public class ValidadorContrasena {
    // Introducimos metodo validar
    public  void validar (String contrasena) throws ContrasenaInvalidaException {
        if (contrasena.length() < 8) {
            throw new ContrasenaInvalidaException("La contraseña debe tener un mínimo de 8 caracteres.");
        }
        // .*  .*  indiferentemente los caracteres que hayan por delante detras
        //  [A-Z] hay una mayuscula. Al poner !contrasena.matches  significa que no hay .
         if (!contrasena.matches(".*[A-Z].*")) {
            throw new ContrasenaInvalidaException("La contraseña debe contener almenos una mayúscula. ");
        }
        // \\d  hay un número entero.  Al poner !contrasena.matches significa que no hay .
        if (!contrasena.matches(".*\\d.*")) {
            throw new ContrasenaInvalidaException("La contraseña debe incluir almenos un número. ");
        }
        System.out.println("Contraseña válida. Nueva contraseña creada. ");
    }

}