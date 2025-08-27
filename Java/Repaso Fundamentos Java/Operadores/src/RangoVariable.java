import java.util.Scanner;
public class RangoVariable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Proporciona un dato entero: ");
        var dato =Integer.parseInt(scanner.nextLine());

        // Revisamos si está dentro del rango (1-10)
        var estaDentroRango = dato >=1 && dato <=10;
        System.out.println("Variable dentro de rango (1 y 10) ? " + estaDentroRango);

        // Revisar la lógica inversa, preguntamos si el dato está fuera de rango
        var estaFueraRango = !estaDentroRango;
        System.out.println("Variable fuera de rango (1 y 10) ? " + estaFueraRango);
    }
}
