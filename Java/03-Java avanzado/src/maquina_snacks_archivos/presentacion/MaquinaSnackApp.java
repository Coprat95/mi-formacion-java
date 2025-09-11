package maquina_snacks_archivos.presentacion;

import maquina_snacks_archivos.dominio.Snack;
import maquina_snacks_archivos.servicio.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MaquinaSnackApp {
    Scanner scanner;
    List<Snack> carritoCompra;
    // Usaremos tanto servicioSaldo como servicioInventario para sustituir las clases
    // Saldo e Inventario y así poder separar bien lo lógico de lo funcional (arquitectura por capas).
    private final IServicioSaldo servicioSaldo;
    private final IServicioInventario servicioInventario;
    private final IEntradaUsuario entradaUsuario;
    // Constructor. Inicia el inventario
    public MaquinaSnackApp() {
        scanner = new Scanner(System.in);
        carritoCompra = new ArrayList<>();
        servicioSaldo = new ServicioSaldoListas();
        servicioInventario = new ServicioInventarioListas();
        entradaUsuario = new EntradaUsuario();

    }
    // Clase que activa la máquina de snacks
    public void iniciar() {
        boolean salir = false;
        while (!salir) {
            servicioInventario.mostrarInventario();
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
                    
                    """,servicioSaldo.getSaldoDisponible());

        }
        public boolean ejecutarOpciones(){

            var opcion = entradaUsuario.leerEntero("Seleccione una opción: ");
            switch (opcion){
                case 1 -> comprarSnack();
                case 2 -> mostrarTicket();
                case 3 -> agregarSnack();
                case 4 -> servicioSaldo.agregarSaldo(entradaUsuario.leerDouble("¿Cuanto saldo desea " +
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
     int id = entradaUsuario.leerEntero("Introduzca el id del snack que quiera comprar. ");
     Snack snack  = servicioInventario.buscarPorId(id);
     if (snack == null) {
         System.out.println("El id introducido no corresponde con ningún snack.");
         return;
     }
     if(snack.getPrecio() > servicioSaldo.getSaldoDisponible()) {
         System.out.println("No se ha podido realizar la compra. Saldo insuficiente.");
         return;
     }
     if (!snack.descontarStock()) {  // Si no puedes descontar stock cancela la compra
         // si hay stock (true)      será falso por el !snack.     NO entra el if
         // si no hay stock (false)  será verdadero por el !snack. SI entra el if.
         System.out.println("No se ha podido realizar la compra. Stock insuficiente.");
         return;
     }

      servicioSaldo.descontarSaldo((snack.getPrecio()));
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
        System.out.printf("\nSaldo restante: %.2f\n",servicioSaldo.getSaldoDisponible());
        System.out.println("\nGracias por su compra.");
    }

    public void agregarSnack(){
        var nombre = entradaUsuario.leerCadena("Introduzca el nombre del snack: ");
        var precio = entradaUsuario.leerDouble("Introduzca el precio del snack: ");
        var stock = entradaUsuario.leerEntero("Introduzca la cantidad de stock: ");
        servicioInventario.agregarSnack(nombre,precio,stock);
        System.out.println("Ha agregado el snack "+ nombre);
    }

        public static void main (String[]args){
            new MaquinaSnackApp().iniciar();

        }
    }

