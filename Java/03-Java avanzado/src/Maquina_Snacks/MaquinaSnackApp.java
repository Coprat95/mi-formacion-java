package Maquina_Snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnackApp {
    Scanner scanner;
    Inventario inventario;
    List<Snack> carritoCompra;
    private final Saldo saldo;

    // Constructor. Inicia el inventario
    public MaquinaSnackApp() {
        scanner = new Scanner(System.in);
        inventario = new Inventario();
        carritoCompra = new ArrayList<>();
        saldo = new Saldo(); // instanciamos saldo para usar sus metodos.
    }
    // Clase que activa la máquina de snacks
    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            inventario.mostrarInventario();
            mostrarMenu();
            salir = ejecutarOpciones();  // al ser ejecutarOpciones return boolean , podemos hacer que acabe el bucle

        }
    }
    public void mostrarMenu () {
            System.out.printf("""
                    \n*** Máquina de snacks ***
                    
                    Saldo disponible : %.2f
                    1- Comprar snack
                    2- Ticket de compra
                    3- Añadir nuevo snack
                    4- Añadir saldo
                    5- Salir
                    
                    """,saldo.getSaldoDisponible());

        }
        public boolean ejecutarOpciones(){

            var opcion = leerEntero("Seleccione una opción: ");
            switch (opcion){
                case 1 -> comprarSnack();
                case 2 -> mostrarTicket();
                case 3 -> agregarSnack();
                case 4 -> saldo.agregarSaldo(leerDouble("¿Cuanto saldo desea " +
                        " añadir (máximo 50€) ? "));
                case 5 -> {
                    System.out.println("Gracias. Hasta pronto!");
                    return true;
                }
                default -> System.out.println("Opción no válida.");

            }
           return false;
        }
    public void comprarSnack() {
     int id = leerEntero("Introduzca el id del snack que quiera comprar. ");
     Snack snack  =inventario.buscarPorId(id);
     if (snack == null) {
         System.out.println("El id introducido no corresponde con ningún snack.");
         return;
     }
     if(snack.getPrecio() > saldo.getSaldoDisponible()) {
         System.out.println("No se ha podido realizar la compra. Saldo insuficiente.");
         return;
     }
     if (!snack.descontarStock()) {  // si no puedes descontar stock cancela la compra
         // si hay stock (true)      será falso por el !snack.     NO entra el if
         // si no hay stock (false)  será verdadero por el !snack. SI entra el if.
         System.out.println("No se ha podido realizar la compra. Stock insuficiente.");
         return;
     }

      saldo.descontarSaldo((snack.getPrecio()));
     carritoCompra.add(snack);
        System.out.println("Ha comprado " + snack.getNombre());
     }


    public void mostrarTicket(){
        double total = 0;
        System.out.println("""
                --- Ticket de compra ---
                """);
        for (Snack s : carritoCompra){
            System.out.printf("\n- %s\t\t=\t%.2f",s.getNombre(),s.getPrecio());
            total += s.getPrecio();
        }
        System.out.printf("""
                \n________________________
                Total de la compra:
                - %.2f
                """,total);
        System.out.printf("\nSaldo restante: %.2f\n",saldo.getSaldoDisponible());
        System.out.println("\nGracias por su compra.");
    }

    public void agregarSnack(){
        var nombre = leerCadena("Introduzca el nombre del snack: ");
        var precio = leerDouble("Introduzca el precio del snack: ");
        var stock = leerEntero("Introduzca la cantidad de stock: ");
        inventario.agregarSnack(nombre,precio,stock);
        System.out.println("Ha agregado el snack "+ nombre);
    }


        // metodos para leer Entero, Double y Cadena
        public int leerEntero (String mensaje) {
            while (true) {
                System.out.println(mensaje);
                try {
                    return Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error, introduce un número. ");
                }

            }
        }
        public double leerDouble (String mensaje) {
            while (true) {
                System.out.println(mensaje);
                try {
                    return Double.parseDouble(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Error , introduzca un valor decimal. ");
                }
            }
        }
        public String leerCadena (String mensaje) {
            while (true) {
                System.out.println(mensaje);
                try {
                    // Para asegurarnos que no envíen un texto vacío.
                   String entrada = scanner.nextLine().trim();
                   if (!entrada.isEmpty()){
                       return  entrada;
                   }
                } catch (Exception e) {
                    System.out.println("Error. El texto no puede estar vacío.  ");
                }
            }
        }
        public static void main (String[]args){
            new MaquinaSnackApp().iniciar();

        }
    }

