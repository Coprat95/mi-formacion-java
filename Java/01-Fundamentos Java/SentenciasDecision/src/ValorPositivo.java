import java.math.BigDecimal;
import java.util.Scanner;
public class ValorPositivo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        var numero = Integer.parseInt(scanner.nextLine());
        System.out.println("El número introducido es "+numero);
        if (numero > 0 ) {
            System.out.println("El número introducido es positivo.");
        }else if (numero <0 ) {
            System.out.println("El número introducido es negativo.");
        } else {
            System.out.println("El número introducido es 0.");

        }

    }
}
