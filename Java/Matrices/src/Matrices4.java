import java.util.Scanner;
// Version mejorada : Pide primero los valores y luego los muestra.

public class Matrices4 {
    public static void main(String[] args) {
        // Introducir valores a una matriz
        int renglones, columnas;
        var consola = new Scanner(System.in);
        // Definir la matriz
        System.out.print("Proporciona los renglones: ");
        renglones = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona las columnas: ");
        columnas = Integer.parseInt(consola.nextLine());
        var matriz = new int[renglones][columnas];

        // Solicitar los valores
        for(var ren=0; ren < renglones; ren++){
            for(var col=0; col < columnas; col++){
                System.out.print("Valor[" + ren + "][" + col + "] = ");
                matriz[ren][col] = Integer.parseInt(consola.nextLine());
            }
        }

        // Iterar los valores de la matriz
        System.out.println();
        for(var ren=0; ren < renglones; ren++){
            for(var col=0; col < columnas; col++){
                System.out.println("Matriz[" + ren + "][" + col + "] = "
                        + matriz[ren][col]);
            }
        }

    }
}















/* Version Oliver
public class Matrices4 {
    public static void main(String[] args) {
        System.out.println("*** Introducir datos por usuario *** ");
        Scanner scanner = new Scanner(System.in);

        // Pedimos el número de filas y columnas al usuario

        System.out.print("Introduzca el número de filas deseadas: ");
        var numeroFilas = Integer.parseInt(scanner.nextLine());

        System.out.print("Introduzca el número de columnas deseadas: ");
        var numeroColumnas = Integer.parseInt(scanner.nextLine());

        // Generamos la matriz

        var matriz = new int [numeroFilas][numeroColumnas];

        // Rellenamos la matriz

        var indiceMatriz = 0;


        for (var i = 0; i <matriz.length ; i++){


            for ( var j = 0; j<matriz[i].length; j++){
                System.out.println("Introduzca el valor de ["+i+"]["+j+"] : ");
                indiceMatriz = Integer.parseInt(scanner.nextLine());
                matriz[i][j] = indiceMatriz;
                System.out.println("El valor de ["+i+"]["+j+"] -> "+matriz[i][j]);

            }
        }
    }
}
*/