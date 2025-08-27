import java.util.Scanner;
public class SistemaDeAutenticacion {
    public static void main(String[] args) {
        // Registro de usuario
        System.out.println("*** Proceso de registro de usuario ***");
        System.out.println("Introduzca el usuario: ");
        Scanner scanner = new Scanner(System.in); // instanciamos objeto scanner
        var registroUsuario = scanner.nextLine();
        System.out.println("Introduzca el password: ");
        var registroPassword = scanner.nextLine();
        System.out.println("Usuario registrado correctamente.");

        // Inicio de sesion
        System.out.println("*** Inicio de sesion de usuario ***");
        System.out.println("Introduzca el usuario: ");
        var inicioUsuario = scanner.nextLine();
        System.out.println("Introducza el password");
        var inicioPassword = scanner.nextLine();
        var inicioCorrecto = registroUsuario.equals(inicioUsuario)  &&
                registroPassword.equals(inicioPassword) ;
        System.out.println("Inicio de sesión realizado : "+inicioCorrecto);

    }
}
