import java.util.Scanner;
public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Sistema de reserva de Hotel ***");

        // Declaración de constantes e instancia scanner
        Scanner scanner = new Scanner(System.in);
        final var CUARTO_SIN_VISTAS_MAR = 150.50;
        final var CUARTO_VISTA_MAR =      190.50;

        // Pedimos información al cliente
        System.out.print("Introduzca el nombre: ");
        var nombre = scanner.nextLine();
        System.out.print("Introduzca el número de días que se alojará en el hotel: ");
        var numeroDias = Integer.parseInt(scanner.nextLine());
        System.out.print("Quiere una habitacíon con vistas al mar ? (true/false) ");
        double costeHabitacionDia = 0;
        var tieneVistas = Boolean.parseBoolean(scanner.nextLine());

        // Cálculos
        costeHabitacionDia  = (tieneVistas) ? CUARTO_VISTA_MAR : CUARTO_SIN_VISTAS_MAR;
        System.out.println("tieneVistas = " + tieneVistas);
        var costeTotalHabitacion = costeHabitacionDia * numeroDias;
        System.out.println("""
                Nombre : %s
                Número de días de estancia: %s
                Habitación con vistas: %b
                Coste diario de la habitacion: %s
                _________________________________
                Total: %s €.
                Gracias por su estancia!
                """.formatted(nombre,numeroDias,tieneVistas,costeHabitacionDia,costeTotalHabitacion));
        }







    }

