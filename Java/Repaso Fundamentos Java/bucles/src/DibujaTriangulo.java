import java.util.Scanner;
public class DibujaTriangulo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("*** Dibuja un triángulo  *** ");
        System.out.print("Proporciona el número de filas : ");
        final var FILAS_MAXIMO = Integer.parseInt(scanner.nextLine());
        String espaciado ;
        String pintado;
    /*
        1234*       -1
        123***		-3
        12*****		-5
        1*******	-7
        *********	-9
     */
        for (int numeroFilas = 1; numeroFilas <= FILAS_MAXIMO; numeroFilas++) {
        espaciado = " ".repeat(FILAS_MAXIMO-numeroFilas);
        pintado ="*".repeat(numeroFilas*2-1);
            System.out.println(espaciado+pintado);
        }
    }
}
