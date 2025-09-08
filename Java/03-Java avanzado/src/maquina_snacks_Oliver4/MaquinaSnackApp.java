package maquina_snacks_Oliver4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaquinaSnackApp {
    Scanner scanner;
    Inventario inventario;
    List<Snack> carritoCompra;

    // Constructor. Inicia el inventario
    public MaquinaSnackApp() {
        scanner = new Scanner(System.in);
        inventario = new Inventario();
        carritoCompra = new ArrayList<>();
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
            System.out.println("""
                    \n*** Máquina de snacks ***
                    
                    1- Comprar snack
                    2- Ticket de compra
                    3- Añadir nuevo snack
                    4- Salir
                    
                    Escoja una opción: 
                    """);

        }
        public boolean ejecutarOpciones(){

            var opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion){
                case 1 -> comprarSnack();
                case 2 -> mostrarTicket();
                case 3 -> agregarSnack();
                case 4 -> {
                    System.out.println("Gracias. Hasta pronto!");
                    return true;
                }
                default -> System.out.println("Opción no válida.");

            }
           return false;
        }
    public void comprarSnack() {
        int id = leerEntero("Introduzca el id del snack que quiera comprar: ");
        boolean snackEncontrado = false;
        for (Snack s : inventario.getSnacks()) {
            if (s.getId() == id) {
                carritoCompra.add(s);
                System.out.println("Ha comprado " + s.getNombre());
                snackEncontrado = true;
            }
        }
        if (!snackEncontrado) {
            System.out.println("El id introducido no corresponde con ningún snack.");
        }
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
    }

    public void agregarSnack(){
        var nombre = leerCadena("Introduzca el nombre del snack: ");
        var precio = leerDouble("Introduzca el precio del snack: ");
        inventario.agregarSnack(nombre,precio);
        System.out.println("Ha agregado el snack "+ nombre);
    }

        // metodos para leer Entero, Double y Cadena
        public int leerEntero (String mensaje){
            System.out.println(mensaje);
            return Integer.parseInt(scanner.nextLine());
        }
        public double leerDouble (String mensaje){
            System.out.println(mensaje);
            return Double.parseDouble(scanner.nextLine());
        }
        public String leerCadena (String mensaje){
            System.out.println(mensaje);
            return scanner.nextLine();
        }
        public static void main (String[]args){

            new MaquinaSnackApp().iniciar();
        }
    }

