import java.util.Scanner;
public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("***Sistema autenticación de usuario y contraseña***");
        Scanner scanner = new Scanner(System.in);

        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";

        System.out.println("Ingresa tu usuario: ");
        var usuario = scanner.nextLine().strip(); // strip quita espacios principio y final
        System.out.println("Ingresa tu password: ");
        var password = scanner.nextLine().strip();

        // Cada caso de validacion de usuario y password

        var mensajeAutenticacion = switch (usuario) {
            case USUARIO_VALIDO -> {
                if (PASSWORD_VALIDO.equals(password)) {
                    yield "Bienvenido al Sistema!";
                } else {
                    yield "Password incorrecto, por favor corregirlo!";
                }
            }
            default -> {
                if (PASSWORD_VALIDO.equals(password)) {
                    yield "Usuario incorrecto, por favor corregirlo!";
                } else {
                    yield "Usuario y contraseña incorrectos, por favor corregirlo!";
                }
            }





        };
        System.out.println(mensajeAutenticacion);
    }
}
