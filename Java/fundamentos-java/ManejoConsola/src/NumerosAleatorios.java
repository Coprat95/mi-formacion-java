import java.util.Scanner;
import java.util.Random;
public class NumerosAleatorios {
    public static void main(String[] args) {

        System.out.println(" *** Números Aleatorios ***");
        Random random = new Random();
        // Generamos un numero aleatorio entre 0 y 9
        int aleatorio09 = random.nextInt(0,10);
        System.out.println("aleatorio09 = " + aleatorio09);
        // Generamos un numero aleatorio entre 0 y 10
        int aleatorio010 = random.nextInt(0,11);
        System.out.println("aleatorio010 = " + aleatorio010);
        // Generar un numero flotante entre 0.0 y 1.0  . Está diseñado directamente así
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);
        // Simular el lanzamiento de un dado (1-6)
        var lanzamientoDado = random.nextInt(1,7);
        System.out.println("lanzamientoDado = " + lanzamientoDado);

    }
}
