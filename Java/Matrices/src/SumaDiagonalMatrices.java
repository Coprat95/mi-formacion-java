import java.util.Scanner;

public class SumaDiagonalMatrices {
    public static void main(String[] args) {
        //  *** Suma Diagona en una Matriz ***
        Scanner scanner = new Scanner(System.in);

        // Pedimos nº de filas y columnas al usuario
        System.out.println("Introduzca el número de filas para la matriz: ");
        var filas = Integer.parseInt(scanner.nextLine());
        System.out.println("Introduzca el número de columnas para la matriz: ");
        var columnas = Integer.parseInt(scanner.nextLine());
        var matriz = new int[filas][columnas];

        // Rellenamos la matriz

        for (var i = 0; i < filas; i++) {
            for (var j = 0; j < columnas; j++) {
                System.out.println("Introduzca el valor para el índice : [" + i + "][" + j + "]");
                matriz[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        // Mostramos los datos
        System.out.println("Valores de la matriz: ");
        for (var x = 0; x < filas; x++) {
            for (var y = 0; y < columnas; y++) {
                System.out.println("[" + x + "][" + y + "]  -> " + matriz[x][y]);
            }
        }

        // Suma diagonal

        var sumaAcumulativa = 0;
        System.out.println("Realizamos la suma diagonal");
        for (var i = 0; i < filas; i++) {
            for (var j = 0; j < columnas; j++) {
                if (i == j) {
                    sumaAcumulativa += matriz[i][j];
                }
            }
        }
        System.out.println("La suma total de la diagonal de la matriz es "+sumaAcumulativa);
    }
}
