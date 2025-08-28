public class Matrices {
    public static void main(String[] args) {

        // Definimos una matriz
        // int [][] miMatriz = new int[2][3];


        var matriz = new int[2][3];

        // Modificar los valores de la matriz
        matriz[0][0] = 100;    // índice 1
        matriz[0][1] = 200;    // 2
        matriz[0][2] = 300;    // 3
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;
        // ... etc

        // Accedemos a los valores
        System.out.println(matriz[0][2]);
        System.out.println(matriz[1][2]);


    }
}
