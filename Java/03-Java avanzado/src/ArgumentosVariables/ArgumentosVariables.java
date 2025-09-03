import java.util.Arrays;

public class ArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(3, 4, 5);
        imprimirValores("Oliver", 6,7,8,9);
    }
    static void imprimirValores (String nombre, int ... array){
        for ( int numArray : array)
            System.out.println(nombre + " " + numArray);
    }

    static void imprimirNumeros(int... numeros) {
        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}

