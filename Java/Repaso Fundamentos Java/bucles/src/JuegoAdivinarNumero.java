import java.util.Scanner;
import java.util.Random;
public class JuegoAdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("*** Adivina el número entre el 1 y el 50 ***");
        System.out.println("El número máximo de intentos de acierto es 5.");
        int aleatorio = random.nextInt(51); // muestra random del 1 al 50
        int numeroUsuario;
        boolean esCorrecto = false;
        int i = 1;

        // Bucle WHILE
        while (i <= 5) {
            System.out.println("Introduzca un número del 1 al 50: ");
            numeroUsuario = Integer.parseInt(scanner.nextLine());
            // Si el número del usuario = aleatorio ganamos el juego
            if (numeroUsuario == aleatorio) {
                esCorrecto = true;
                System.out.println("Has acertado! Has ganado el juego. ");
                break;
            // En caso contrario , continuamos jugando
            } else {
                // esCorrecto = false;  redundante, se puede omitir.
                // Introducimos pistas para facilitar el juego
                if (numeroUsuario > aleatorio) {
                    System.out.println("El número introducido es mayor que el número secreto. ");
                }
                else {
                    System.out.println("El número introducido es menor que el número secreto. ");
                }
            // Número de intentos por iteracion en caso de fallar
            System.out.printf("Número de intento " + i + "/5. El valor introducido %d no es correcto. ",numeroUsuario);
                i++;
            }
        }
        // Salimos del bucle, mostramos los 2 resultados posibles
        if (esCorrecto ) {
            System.out.printf("Has superado el desafío con un total de %d intentos.", i);
        }
        else {
            System.out.printf("""
                    Lo sentimos no has podido superar el desafío. El número secreto era %d.
                    """,aleatorio);
        }
    }
}
