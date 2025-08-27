import java.util.Scanner;
public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Desea salir del sistema? (true/false): ");
        var respuesta = Boolean.parseBoolean(scanner.nextLine());
        if (!respuesta) {
            System.out.println("Continuamos dentro del sistema.");
        } else {
            System.out.println("Saliendo del sistema...");

        }

    }
}
