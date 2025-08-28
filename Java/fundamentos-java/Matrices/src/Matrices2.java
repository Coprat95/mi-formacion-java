public class Matrices2 {
    public static void main(String[] args) {

        // Definimos una matriz

        final var FILAS = 2;
        final var COLUMNAS = 2;

        //               filas  columnas
        var matriz = new int[2][2];

        // Modificar los valores de la matriz
        matriz[0][0] = 100;    // índice 1
        matriz[0][1] = 200;    // 2
        matriz[1][0] = 300;
        matriz[1][1] = 400;

        // ... etc

        // Accedemos a los valores
        System.out.println(matriz[0][1]);
        System.out.println(matriz[1][1]);

        // recorremos la matriz

        // Bucle para las filas
        for (var i = 0; i < FILAS; i++) {
            // Bucle anidado para las columnas
            for (var j = 0; j < COLUMNAS; j++){
                System.out.println("Índice ["+i+"]["+j+"]  ->  "+ matriz[i][j]);
            }

        }
    }
}
