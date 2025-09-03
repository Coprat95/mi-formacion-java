public class Matrices3 {
    public static void main(String[] args) {
        // Definir matriz de forma dinámica
        //var matriz = new int [][]{{100,200,300},{400,500,600}};

        var matriz = new int [][] {
                {100,200,300},  // fila 1  tres columnas
                {400,500,600}   // fila 2  tres columnas
        };
        // recorrer la matriz
        var i = 0;
        for (  i = 0; i< matriz.length; i++) {

            for (var j = 0; j < matriz[i].length; j++) {
                System.out.println("El valor del índice [" + i + "][" + j + "]  -> " + matriz[i][j]);
            }
        }
    }
}
