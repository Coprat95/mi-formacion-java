import java.util.Scanner;
public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("***Sistema de envíos***");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el destino (Nacional/Internacional) ");
        var destino =scanner.nextLine();
        System.out.print("Introduzca el peso del envío en Kg:  ");
        var pesoKg = Double.parseDouble(scanner.nextLine());
        final double COSTE_NAC = 10;
        final double COSTE_INTERNAC= 20;
        double costeTotal ;
        if (destino.equals("Nacional")) {
            costeTotal = COSTE_NAC * pesoKg;
        } else if (destino.equals("Internacional")) {
            costeTotal = COSTE_INTERNAC * pesoKg;
        } else {
            System.out.println("Valor introducido no es correcto.");
            costeTotal = 0;
        }
        System.out.printf("El coste total del envío es de \n\t%.2f€",costeTotal);

    }
}
