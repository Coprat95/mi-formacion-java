public class Arrays3 {
    public static void main(String[] args) {
        var enteros = new int[]{100, 200, 300, 400, 500};
        // Acceder a los elementos
        System.out.println(enteros[0] + " " + enteros[1] + " " + enteros[2] + " " + enteros[3] + " " + enteros[4] + " ");
        for (var i = 0; i < enteros.length; i++) {
            System.out.println("Valor con índice "+i+" igual a : "+enteros[i]);
        }
    }
}




