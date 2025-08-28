import java.util.Scanner;
import java.util.Random;
public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Calcular el promedio de calificaciones autogeneradas ***");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Declaracion del array
        System.out.println("Cuantas calificaciones quieres generar: ");
        var longitudCalificaciones = Integer.parseInt(scanner.nextLine());
        var calificaciones = new double[longitudCalificaciones];

        // Autogeneración de las calificaciones
        for (var i=0; i <longitudCalificaciones; i++){
            calificaciones[i] = random.nextDouble(11);
            System.out.printf("Asignatura %d -> %.2f\n",i,calificaciones[i]);
        }

        // Cálculo de la nota media
        double notaMedia ;
        double notaAcumulativa = 0;
        for (var i = 0; i < longitudCalificaciones; i++) {
            notaAcumulativa += calificaciones[i];
        }
        notaMedia = notaAcumulativa / longitudCalificaciones;

        // Imprimimos los resultados obtenidos
        System.out.printf("Nota acumulada = -> %.2f",notaAcumulativa);
        System.out.printf("%nLa nota media es de %.2f",notaMedia);

        // cierre scanner (buenas prácticas)
        scanner.close();
    }
}
