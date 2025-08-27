import java.util.Scanner;
public class DiaSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un día de la semana (1-7) : ");
        var diaSemana = Integer.parseInt(scanner.nextLine());

        /*
        // hacemos un switch para mostrar un resultado dependiendo del día
        switch (diaSemana) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2: diaSemana = 2;
                System.out.println("Martes");
                break;
            case 3: diaSemana = 3;
                System.out.println("Miércoles");
                break;
            case 4: diaSemana = 4;
                System.out.println("Jueves");
                break;
            case 5: diaSemana = 5;
                System.out.println("Viernes");
                break;
            case 6: diaSemana = 6;
                System.out.println("Sábado");
                break;
            case 7: diaSemana = 7;
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día no válido.");
                break;
                */
        // switch mejorado

        switch (diaSemana) {
        case 1 -> System.out.println("Lunes");
        case 2 -> System.out.println("Martes");
        case 3 ->  {            // en caso de ser más de una línea hay que abrir llaves
                System.out.println("Miercoles");
            System.out.println("Que bonito día!");
        }
        case 4 -> System.out.println("Jueves");
        case 5 -> System.out.println("Viernes");
        case 6 -> System.out.println("Sábado");
        case 7 -> System.out.println("Domingo");
        default -> System.out.println("Número no válido");

        }

    }
}
