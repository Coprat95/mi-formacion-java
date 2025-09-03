import java.util.Scanner;
public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Administración de Cuentas ***");
        Scanner scanner = new Scanner (System.in);

        //Declaración variables

        var opcion1= "Crear cuenta";
        var opcion2= "Eliminar cuenta";
        var opcion3= "Salir";

        /* Creación del menú
        System.out.printf("""
                Menu:
                1.\t%s
                2.\t%s
                3.\t%s
                Escoje una opcion:
                """,opcion1,opcion2,opcion3);
        var opcionEscogida = Integer.parseInt(scanner.nextLine()); */
        int opcionEscogida;
        do {
            System.out.printf("""
                Menu:
                1.\t%s
                2.\t%s
                3.\t%s
                Escoje una opcion:
                """,opcion1,opcion2,opcion3);
            opcionEscogida = Integer.parseInt(scanner.nextLine());
            if(opcionEscogida == 1) {
                System.out.println("Creando tu cuenta...");
            }else if (opcionEscogida ==2) {
                System.out.println("Eliminando tu cuenta...");
            } else if (opcionEscogida == 3) {
                System.out.println("Saliendo del sistema.Hasta pronto!");
            }else {
                System.out.println("Opción escogida no válida. Inténtelo de nuevo.");
            }

        } while (opcionEscogida != 3);

        /* Hacemos un SWITCH
        do {
            switch (opcionEscogida) {
                case 1 -> System.out.println("Creando tu cuenta...");
                case 2 -> System.out.println("Eliminando tu cuenta...");
                default -> System.out.println("Saliendo del sistema. Hasta pronto!");
            }
        }   while (opcionEscogida != 3);
        */




    }
}
