import java.sql.SQLOutput;
import java.util.Scanner;
public class LeerTipoDatos {
    public static void main(String[] args) {
        // Leer distintos tipos de datos
        // Leer un tipo int
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = scanner.nextInt();
        System.out.println("edad = " + edad);
        // Leer un tipo double
        System.out.print("Ingresa tu altura: ");
        var altura = scanner.nextDouble();
        System.out.println("altura = " + altura);
        // Leer un tipo String
        // Consumimos el caracter de salto de linea ( los nexttipo numericos no consumen)
        scanner.nextLine();
        System.out.println("Ingrese su nombre :");
        var nombre = scanner.nextLine();
        System.out.println("nombre = " + nombre);

        // Conversion de datos
        System.out.println("Proporciona un valor entero: ");
        var enteroString = scanner.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);
        /*       o también
            System.out.println("Proporciona un valor entero: ");
        String enteroString = scanner.nextLine();
        int entero = Integer.parseInt(enteroString);
         */
        // Tipo flotante
        System.out.println("Introduzca un valor flotante :");
        // Nos saltamos el paso de declarar flotanteString
        var flotante = Float.parseFloat(scanner.nextLine());
        System.out.println("flotante = " + flotante);


    }
}
