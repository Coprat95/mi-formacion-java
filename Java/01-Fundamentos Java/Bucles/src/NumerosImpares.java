public class NumerosImpares {
    public static void main(String[] args) {
        System.out.println("*** Vamos a calcular los números impares del 1 al 20 ");
        int contador = 19;
        do {
            if (contador % 2 != 0) {
                System.out.println(contador);
            }
            contador--;
        }

        while (contador >0);

    }
}
