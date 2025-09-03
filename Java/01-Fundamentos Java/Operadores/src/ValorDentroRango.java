import java.util.Scanner;
import java.util.Random;
public class ValorDentroRango {
    public static void main(String[] args) {
        int a = 3, b = 5, c = 6;


        var dentroRango =  a >= 0 &&  a <=5;
        System.out.println("dentroRango de a = " + dentroRango);
        dentroRango =  b >= 0 &&  b <=5;
        System.out.println("dentroRango de b = " + dentroRango);
        dentroRango =  c >= 0 &&  c <=5;
        System.out.println("dentroRango de c = " + dentroRango);

        // lo hacemos pidiendo un número por consola
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número ");
        var numeroConsola = Integer.parseInt(sc.nextLine());
        dentroRango = numeroConsola >= 0 && numeroConsola <=5;
        System.out.println("dentroRango de numeroConsola = " + dentroRango);

        // lo hacemos generando un número random de 1 dígito
        Random random = new Random();
        var numeroAleatorio = random.nextInt(0,10);
        dentroRango = numeroAleatorio >= 0 && numeroAleatorio <=5;
        System.out.println("Se ha generado el número: " + numeroAleatorio);
        System.out.println("dentroRango de numeroAleatorio = " + dentroRango);


    }
}
