public class Arrays2 {
    public static void main(String[] args) {
        // Arrays
        int [] enteros = new int[5];
        enteros [0] = 13;
        System.out.println(enteros[0]+" "+enteros[1]); // muestra 13 y 0 (por defecto)
        enteros [1] = 21;
        System.out.println(enteros[0]+" "+enteros[1]);
        enteros [4] = 34;   // no hace falta completar todos los índices.
        System.out.println(enteros[0]+" "+enteros[1]+ " "+ enteros[4]);
    }
}
