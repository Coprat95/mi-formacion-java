import java.math.BigDecimal;
import java.util.Scanner;
public class AplicacionCajeroAutomatico {
    public static void main(String[] args) {
        // Declaración scanner y variables
        Scanner scanner = new Scanner (System.in);

        double saldo = 0.00 ;
        double retiro ;
        double deposito ;
        int opcion;



        // Ciclo do while
        do {
            System.out.println("""
                    Operaciones que puedes realizar:
                    1.\tConsultar saldo
                    2.\tRetirar
                    3.\tDepositar
                    4.\tSalir
                    Escoja una opcion:
                    """);
             opcion = Integer.parseInt(scanner.nextLine());
            switch (opcion) {
                case 1 -> System.out.println("Tu saldo actual es de " + saldo + " €.");
                case 2 -> {
                    System.out.println("Ingresa el importe a retirar: ");
                    retiro = Double.parseDouble(scanner.nextLine());
                    if (saldo >= retiro) {
                        saldo -= retiro;
                        System.out.println("Saldo retirado. Saldo actual : " + saldo);
                    } else {
                        System.out.println("Saldo insuficiente.No se ha podido completar" +
                                "la acción. Saldo actual :" + saldo);
                    }
                }
                case 3 -> {
                    System.out.println("Ingresa el importe a depositar: ");
                    deposito = Double.parseDouble(scanner.nextLine());
                    if (deposito >= 0) {
                        saldo += deposito;
                        System.out.println("Depósito realizado con éxito.Saldo actual : " + saldo);
                    } else {
                        System.out.println("No se ha podido realizar el depósito." +
                                "Saldo actual: " + saldo);
                    }
                }
                case 4 -> System.out.println("Saliendo del cajero automático.Hasta pronto!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");
            }

        } while (opcion != 4);

    }
}
