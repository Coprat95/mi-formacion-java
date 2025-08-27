import java.util.Scanner;
public class CalculoAreaPerimetro {
    public static void main(String[] args) {
        System.out.println("*** Cálculo de área y perímetro de un rectángulo *** ");

        System.out.println("Tenemos un rectángulo con las siguientes medidas : ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduzca la base: ");
        var base = scanner.nextInt();
        System.out.print("Introduzca la altura: ");
        var altura = scanner.nextInt();

        var area = base * altura;     // Cálculo del area
        var perimetro = 2 * (base + altura); // Cálculo del perímetro
        // Salida por pantalla
        System.out.println("El rectángulo tendrá un área de : "+area+"\ny un perimetro de "+perimetro);




    }
}
