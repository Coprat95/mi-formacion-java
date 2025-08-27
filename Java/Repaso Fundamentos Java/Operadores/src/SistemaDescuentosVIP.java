import java.util.Scanner;
import java.util.Random;
public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        var cliente1 = "Oliver";


        // Preguntar cuántos artículos ha comprado en el día
        System.out.println(cliente1+", cuántos artículos ha comprado hoy?");
        Scanner sc = new Scanner (System.in);
        var cantidadArticulos = Integer.parseInt(sc.nextLine());
        // Preguntar si tiene membresía
        System.out.println("Cuenta con la membresía de la tienda?");
        Random random = new Random();
        boolean esMiembro = random.nextBoolean();

        System.out.println(esMiembro);
        boolean descuentoVIP = cantidadArticulos >= 10 && esMiembro ;
        System.out.println("Es aplicable un descuento extra a éste cliente ? ");
        System.out.println(descuentoVIP);

        }
    }



    // _________________________________________

/*import java.util.Scanner;

public class SistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Descuentos VIP*** ");
        final var NO_PRODUCTOS_DESCUENTO = 10;
        var consola = new Scanner(System.in);

        System.out.print("Cuántos productos compraste hoy? ");
        var cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes la membresía de la tienda (true/false)? ");
        var tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        var esElegibleDescuento =
                cantidadProductos >= NO_PRODUCTOS_DESCUENTO && tienesMembresia;

        System.out.println("Tienes acceso al descuento VIP ? " + esElegibleDescuento);
    }
}
*/

