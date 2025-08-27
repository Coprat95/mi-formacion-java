import java.util.Scanner;
public class InformacionEmpleado {
    public static void main(String[] args) {
        System.out.println("Vamos a solicitar la información del empleado");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca el nombre de empleado :");
        var nombre  = scanner.nextLine();
        System.out.println("Introduzca la edad :");
        var edad = scanner.nextInt();
        System.out.println("Introduzca el salario :");
        var salario = scanner.nextDouble();
        System.out.println("Es jefe de departamento? :");
        var jefeDepartamento = scanner.nextBoolean();

        scanner.nextLine();
        System.out.println("nombre = " + nombre);
        System.out.println("edad = " + edad);
        System.out.println("salario = " + salario);
        System.out.println("jefeDepartamento = " + jefeDepartamento);

        // -------------- usando parses

        System.out.println("Vamos a solicitar la información del empleado");

        System.out.println("Introduzca el nombre de empleado :");
        var nombre2  = scanner.nextLine();
        System.out.println("Introduzca la edad :");
        var edad2 = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca el salario :");
        var salario2 = Double.parseDouble(scanner.nextLine());
        System.out.println("Es jefe de departamento? :");
        var jefeDepartamento2 =Boolean.parseBoolean(scanner.nextLine());

        // Valores
        System.out.println("\tnombre2 = " + nombre2);
        System.out.println("\tedad2 = " + edad2);
        System.out.printf("\tsalario2: €%.2f%n", salario2); // printf(formateo)
        // %.2f  a formato 2 decimales float   %n salto de linea ya que quitamos el println
        System.out.println("\tjefeDepartamento2 = " + jefeDepartamento2);
    }
}
