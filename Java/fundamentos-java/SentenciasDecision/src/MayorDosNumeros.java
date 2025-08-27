
import java.util.Scanner;
public class MayorDosNumeros {
    public static void main(String[] args) {
        // Declaración de variables e instancia del scanner
        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        System.out.println("Introduzca el primer número :");
        num1 = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca el segundo número :");
        num2 = Integer.parseInt(scanner.nextLine());
        // Con operador ternario
        String numeroMayor ;
        numeroMayor =  (num1 > num2) ? "num1 es mayor": (num2 > num1) ? "num2 es mayor" : " num1 y num2son iguales";
        System.out.println("El " + numeroMayor);


        /*
        // Con if else if else
        int numeroMayor
        if (num1 > num2) {
            numeroMayor = num1;
            System.out.println("El número mayor es  = " + numeroMayor);
        }
        else {
            numeroMayor = num2;
            System.out.println("El número mayor es " + numeroMayor);
        }
        */

    }
}
