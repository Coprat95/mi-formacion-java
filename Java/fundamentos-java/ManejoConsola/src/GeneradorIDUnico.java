import java.util.Scanner;
import java.util.Random;
public class GeneradorIDUnico {
    public static void main(String[] args) {
        /* *** Sistema generador de ID único ***
        Cual es tu nombre ? Juan
        Cual es tu apellido ? Perez
        Cual es tu año de nacimiento (YYYY)? 1995
        Hola Juan,
            Tu nuevo número de identificación (ID) generado por el sistema es:
            JUPE95*5232*
            Felicidades!
         */
        Scanner sc = new Scanner (System.in);
        var random = new Random();
        System.out.println("*** Sistema generador de ID único ***" );
        // Declaración de variables
        System.out.println("Cual es tu nombre?");
        var nombre = sc.nextLine();
        System.out.println("Cual es tu apellido?");
        var apellido = sc.nextLine();
        System.out.println("Cual es tu año de nacimiento (YYYY)?");
        var anyo = Integer.parseInt(sc.nextLine());
        var aleatorio = random.nextInt(0,10000);

        // Normalizamos nombre y apellido a dos caracteres y mayus y limpiamos espacios con trim
        var nombreNormalizado = nombre.substring(0,2).toUpperCase().trim();
        var apellidoNormalizado = apellido.substring(0,2).toUpperCase().trim();
        var formateo =String.format("%s%s%d%04d",nombreNormalizado,apellidoNormalizado,anyo,aleatorio);
                // Salida  por pantalla
        System.out.println("Hola "+nombre+ "\n\tTu nuevo número de identificación (ID) generado por el sistema es :" +
                "\n" + formateo + "\n\tFelicidades!");





    }
}
