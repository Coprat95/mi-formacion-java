package maquina_snacks2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Clase principal que simula el funcionamiento de una máquina de snacks.
public class MaquinaSnacksApp {
    private final Inventario inventario;
    private final List<Snack> carrito;
    private final Scanner scanner ;

    // Lo instanciamos en el constructor porque da mayor flexibilidad
    public  MaquinaSnacksApp(){
        inventario = new Inventario();
        carrito = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            System.out.println("\n*** Máquina de Snacks ***");
            inventario.mostrarInventario();
            mostrarMenu();

            int opcion = leerEntero ("Selecciona una opción : ");

            switch (opcion) {
                case 1 -> comprarSnack();
                case 2 -> mostrarTicket();
                case 3 -> agregarNuevoSnack();
                case 4 -> {
                    System.out.println("¡Hasta pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción inválida.");
            }
        }
    }
    private void mostrarMenu(){
        System.out.println("""
                Menú:
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar nuevo snack
                4. Salir
                """);
    }
    private void comprarSnack () {
        int id = leerEntero("Introduce el id del snack que quieres comprar: ");
        Snack snack = inventario.buscarPorId(id);
        if (snack != null) {
            carrito.add(snack);
            System.out.println("Snack añadido al carrito.");
        } else {
            System.out.println("Snack no encontrado. ");
        }
    }

    private void mostrarTicket () {
        System.out.println("*** Ticket de compra *** ");
        if (carrito.isEmpty()) {
            System.out.println("No hay productos en el carrito.");
            return; // sale del metodo . Break sería para salir del bucle
        }
        double total = 0;

        for ( Snack s:  carrito) {
            System.out.printf("\nProducto : "+s.getNombre()+ " | Precio : "+
                    s.getPrecio()+"€");

            total += s.getPrecio();
        }
        System.out.printf("\nTotal : %.2f €", total);
    }

    private void agregarNuevoSnack() {
        String nombre = leerCadena("Introduce un nombre. ");
        double precio = leerDecimal("Introduce el precio. ");
        agregarNuevoSnack(nombre,precio);
    }
    private void agregarNuevoSnack(String nombre , double precio ) {
        inventario.agregarSnack(new Snack(nombre,precio));
        System.out.println("Snack agregado correctamente.");
    }


    private int leerEntero(String mensaje) {  // ej: Selecciona una opción :
        while (true) {  // bucle infinito
            System.out.println(mensaje);          // Selecciona una opción :
            try {
                return Integer.parseInt(scanner.nextLine()); // forzamos a salir
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Introduce un número entero. ");
            }
        }
    }
     private double leerDecimal(String mensaje) {
        while(true) {
            System.out.println(mensaje);
            try {
                    return Double.parseDouble(scanner.nextLine());
            }catch (NumberFormatException e) {
                    System.out.println("Entrada inválida. Introduce un número decimal.");
            }
        }
    }

    private String leerCadena (String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    public static void main(String[] args) {
        new MaquinaSnacksApp().iniciar();
    }
}



