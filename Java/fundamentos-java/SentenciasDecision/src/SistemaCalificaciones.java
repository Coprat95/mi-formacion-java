import java.util.Scanner;
public class SistemaCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Sistema de calificaciones de números a letras ****");
        System.out.print("Introduzca la calificación obtenida. ");
        /*  VERSION SWITCH MEJORADA
        var calificacionNumerica = Integer.parseInt(scanner.nextLine());
        char calificacionLetra = 'F';

        switch (calificacionNumerica) {
            case 0,1,2,3,4,5 -> calificacionLetra = 'F';
            case 6           -> calificacionLetra = 'D';
            case 7           -> calificacionLetra = 'C';
            case 8           -> calificacionLetra = 'B';
            case 9,10        -> calificacionLetra = 'A';
            default          -> System.out.println("Calificació no válida");
        }
        System.out.println("La calificación obtenida es de "+ calificacionLetra); */

        // VERSIÓN IF ELSE
        var calificacionNumerica = Double.parseDouble(scanner.nextLine());
        var calificacionLetra = 'J' ;
            if (calificacionNumerica >= 0 && calificacionNumerica <6 ) {
                    calificacionLetra = 'F';
                } else if (calificacionNumerica >=6 && calificacionNumerica <7 ) {
                    calificacionLetra = 'D';
                }else if (calificacionNumerica >=7 && calificacionNumerica <8) {
                    calificacionLetra = 'C';
                }else if (calificacionNumerica >= 8 && calificacionNumerica <9) {
                    calificacionLetra = 'B';
                }else if (calificacionNumerica >= 9 && calificacionNumerica <=10) {
                    calificacionLetra = 'A';
                }  else {
                    System.out.println("Calificación introducida no válida.");

                }
        System.out.printf("La puntuación obtenida es de %.2f , %c ",calificacionNumerica,calificacionLetra);

    }
}
