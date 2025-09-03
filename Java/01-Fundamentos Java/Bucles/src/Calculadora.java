import java.math.BigDecimal;
import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        System.out.println("*** Calculadora en Java ***");
        Scanner scanner = new Scanner(System.in);
        BigDecimal op1;
        BigDecimal op2;
        BigDecimal resultado = new BigDecimal("0.00");
        int opcion;
        do {
            System.out.printf("""
                    Operaciones que puedes realizar:
                    1.\tSuma
                    2.\tResta
                    3.\tMultiplicacion
                    4.\tDivision
                    5.\tSalir
                    Escoge una opción:
                    """);
            opcion= Integer.parseInt(scanner.nextLine());
            switch(opcion){
                case 1 -> {
                    System.out.println("Has escogido suma. Indique el operando 1: ");
                    op1 = new BigDecimal(scanner.nextLine());
                    System.out.println("Indique el operando 2: ");
                    op2 = new BigDecimal(scanner.nextLine());
                    resultado = op1.add(op2);
                    System.out.println("El resultado de la suma es de : "+resultado);
                }
                case 2 -> {
                    System.out.println("Has escogido resta. Indique el operando 1: ");
                    op1 = new BigDecimal(scanner.nextLine());
                    System.out.println("Indique el operando 2: ");
                    op2 = new BigDecimal(scanner.nextLine());
                    resultado = op1.subtract(op2);
                    System.out.println("El resultado de la resta es de : "+resultado);
                }
                case 3 -> {
                    System.out.println("Has escogido multiplicación. Indique el operando 1: ");
                    op1 = new BigDecimal(scanner.nextLine());
                    System.out.println("Indique el operando 2: ");
                    op2 = new BigDecimal(scanner.nextLine());
                    resultado = op1.multiply(op2);
                    System.out.println("El resultado de la multiplicación es de : "+resultado);
                }
                case 4 -> {
                    System.out.println("Has división. Indique el operando 1: ");
                    op1 = new BigDecimal(scanner.nextLine());
                    System.out.println("Indique el operando 2: ");

                    op2 = new BigDecimal(scanner.nextLine());
                    if (op2.compareTo(BigDecimal.ZERO) == 0) {
                        System.out.println("No se puede dividir  entre cero.");
                    }

                    else {
                        resultado = op1.divide(op2);
                        System.out.println("El resultado de la división es de : " + resultado);
                    }
                }
                case 5-> System.out.println("Saliendo del programa de Calculadora!");
                default -> System.out.println("Opción invalida. Pruebe de nuevo. ");
            }
        } while (opcion != 5);
    }
}
