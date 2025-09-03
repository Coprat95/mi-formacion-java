import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class AplicacionCajeroAutomaticoBigDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        BigDecimal saldo = new BigDecimal("0.00");
        BigDecimal retiro;
        BigDecimal deposito;

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
                case 1 -> System.out.println("El saldo actual es de " + saldo + " €.");
                case 2 -> {
                    System.out.println("Introduzca la cantidad a retirar: ");
                    retiro = new BigDecimal(scanner.nextLine());

                    if (saldo.compareTo(retiro) >= 0) {
                        saldo = saldo.subtract(retiro).setScale(2, RoundingMode.HALF_UP);
                        System.out.println("Se ha hecho un retiro " +
                                "por valor de " + retiro + ". El saldo actual es de " + saldo + " €.");
                    } else {
                        System.out.println("Saldo insuficiente. No se ha podido efectuar" +
                                "el retiro. Saldo actual es de " + saldo + " €.");
                    }
                }
                case 3 -> {
                    System.out.println("Introduzca el saldo a depositar: ");
                deposito = new BigDecimal(scanner.nextLine());
                saldo = saldo.add(deposito.setScale(2,RoundingMode.HALF_UP));
                System.out.println("Se ha depositado un valor de "+deposito+". El saldo" +
                        " actual es de "+saldo+" €.");
                }
                case 4 -> System.out.println("Saliendo del cajero automático.Hasta pronto!");
                default -> System.out.println("Opción no válida. Intente de nuevo.");


                };


        } while (opcion != 4);
    }
}
