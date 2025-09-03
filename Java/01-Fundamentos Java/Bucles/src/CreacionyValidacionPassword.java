import java.util.Scanner;

public class CreacionyValidacionPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Creación y validación de Password ***");
        String password;
        final var LONGITUD_MIN = 6;
        System.out.println("Introduzca una contraseña de al menos 6 caracteres : ");
        password = scanner.nextLine();
        while (password.length()<6) {
            System.out.println("Contraseña no disponible. Debe de tener " +
                    "un mínimo de 6 caracteres. Introduzca una contraseña: ");
            password = scanner.nextLine();
        }
        System.out.println("Password válido.");
    }
}
