public class BreakYContinue {
    public static void main(String[] args) {
        System.out.println("*** Break y continue ***");

        // Ejemplo break, imprimir solo el primer número par
        System.out.println("Break:");
        for (var numero =1; numero <10; numero++) {
            if (numero % 2 == 0 ) {
                System.out.println(numero+" ");
                break;                          // imprimiremos solamente el primer número par (2).
            }
        }
        // Ejemplo con continue. Imprimir solo números pares, ignorar impares.
        System.out.println("Continue:");
        for (var numero = 1; numero <10; numero++) {

            if (numero %2 != 0) {
                continue;                       // entra en el bucle, cuando es impar entra en continue y salta al
                                                // siguiente número sin imprimir el system.println
            }
            System.out.print(numero+" ");         // imprime los numeros pares solo.
        }
    }
}
