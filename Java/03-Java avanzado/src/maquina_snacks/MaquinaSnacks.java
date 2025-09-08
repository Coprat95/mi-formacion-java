package maquina_snacks;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public  class MaquinaSnacks {
    public static void main(String[] args) {
      maquinaSnacks();
    }

    public static void maquinaSnacks () {
        var salir = false;
        Scanner scanner = new Scanner(System.in);
        // Creamos la lista de productos de tipo snack que seleccionará el usuario
        List<Snack> productos = new ArrayList<>();

        System.out.println("*** Maquina de Snacks ***");
        Snacks.mostrarSnacks();  // Mostrar el inventario de snacks disponibles
        while (!salir) {
            try {
                var opcion = mostrarMenu(scanner);
                 salir = ejecutarOpciones(opcion,scanner,productos);

            } catch (OpcionNoValida_MS e) {
                System.err.println("Ocurrió un error: " + e.getMessage());
                System.out.println("Elije una opcion: ");

            } catch (NumberFormatException i) {
                System.err.println("El caracter introducido debe ser un número. ");
                System.out.println("Elije una opcion: ");
            }
            finally {
                System.out.println();  // Imprime un salto de línea con cada iteracion
            }
        }
    }

        private static int  mostrarMenu(Scanner scanner){
            System.out.print("""
                    1. Comprar snack
                    2. Mostrar ticket
                    3. Agregar nuevo snack
                    4. Salir
                    Elije una opcion:\s""");
            // Leemos y retornamos la opcion seleccionada
            return Integer.parseInt(scanner.nextLine());

        }

    private static boolean ejecutarOpciones(int opcion, Scanner scanner,
                                            List<Snack> productos) throws OpcionNoValida_MS {
        var salir = false;


        switch (opcion) {
            case 1 -> comprarSnack(scanner, productos);

            case 2 -> mostrarTicket(productos);

            case 3 -> agregarSnack(scanner);

            case 4 -> {
                salir = true;
            }
            default -> throw new OpcionNoValida_MS("Opcion no válida.");
        }
        return salir;
    }

        private static void comprarSnack(Scanner scanner, List<Snack> productos){
            System.out.print("Que snack quieres comprar (id) ? ");
            var idSnack = Integer.parseInt(scanner.nextLine());
            // Validar que el snack exista en la lista de snacks
            var snackEncontrado = false;
            for(var snack: Snacks.getSnacks()){
                if (idSnack == snack.getIdSnack()){
                    // Agregamos el snack a la lista de productos
                    productos.add(snack);
                    System.out.println("Ok, snack agregado: "+ snack);
                    snackEncontrado = true;
                    break;
                }
            }
            if (!snackEncontrado) { // si la variable es falsa
                System.out.println("Id de snack no encontrado: " + idSnack);
            }


        }

        private static void mostrarTicket(List<Snack> productos){
        var ticket = "*** Ticket de Venta ***";
        var total = 0.0;
        for (var producto: productos){
            ticket += "\n\t-"+ producto.getNombre() + " - " + producto.getPrecio()+" €";
            total += producto.getPrecio();
        }
            ticket += "\n\tTotal -> "+ total + " €";
            System.out.println(ticket);
        }

        private static void agregarSnack(Scanner scanner){
            System.out.print("Nombre del snack: ");
            var nombre = scanner.nextLine();
            System.out.print("Precio del snack: ");
            var precio = Double.parseDouble(scanner.nextLine());
            Snacks.agregarSnack(new Snack(nombre,precio));
            System.out.println("Tu snack se ha agregado correctamente. ");
            Snacks.mostrarSnacks();

        }
    }











