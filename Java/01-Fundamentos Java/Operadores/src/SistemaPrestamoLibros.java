
import java.util.Scanner;
public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        System.out.println("*** Sistema de préstamo de libros con OR ***");

        // Instanciamos objeto Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre: ");
        var nombre = scanner.nextLine();
        // Tiene credencial de estudiante?
        System.out.println("Tiene credencial de estudiante ? Responda true/false");
        var tieneCredencial= Boolean.parseBoolean(scanner.nextLine());
        // Vive a mas de 3km?
        final int DISTANCIAMAXIMAKM = 3;  // mayus porque es constante ( convención)
        System.out.println("A cuanto vive de la biblioteca? Póngalo en km. ");
        var distanciaUsuarioKm = Integer.parseInt(scanner.nextLine());
        // Cumple con los requisitos ?
        var cumpleRequisitos = tieneCredencial || distanciaUsuarioKm <= DISTANCIAMAXIMAKM;
        System.out.printf(" El usuario %s es apto para el préstamo de libros ? %b"
                ,nombre,cumpleRequisitos);
    }
}
