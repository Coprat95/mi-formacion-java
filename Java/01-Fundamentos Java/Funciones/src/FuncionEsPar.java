import java.util.Scanner;

public class FuncionEsPar {
    static boolean comprobarPar (int num1) {
        // sustituye todo lo de abajo
        return (num1 % 2 == 0);
        /*   var esPar = false;
        if (num1 % 2 == 0 ) {
            esPar= true;
        }
        else {
            esPar = false;
        }
        return esPar;
      */
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca un número para comprar si es par ");
        var numero = Integer.parseInt(scanner.nextLine());
        System.out.println(comprobarPar(numero));
    }
}
