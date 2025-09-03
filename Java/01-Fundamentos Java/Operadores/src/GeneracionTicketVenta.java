import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Random;
import java.util.Scanner;
public class GeneracionTicketVenta {
    public static void main(String[] args) {
        System.out.println("*** Generación de un ticket de Venta ***");
        // instanciamos el objeto Scanner
        Scanner scanner = new Scanner(System.in);
        // Declaramos la constante IVA (21%)
        final BigDecimal IVA = new BigDecimal("0.21");   // BigDecimal se usa entre comillas " ";
        // Solicitamos el precio por producto
        System.out.print("Introduzca el valor del producto1: ");
        BigDecimal producto1 = new BigDecimal(scanner.nextLine());  // se ha de instanciar como Scanner
        System.out.print("Introduzca el valor del producto2: ");
        BigDecimal producto2 = new BigDecimal(scanner.nextLine());
        System.out.print("Introduzca el valor del producto3: ");
        BigDecimal producto3 = new BigDecimal(scanner.nextLine());

        // Realizamos el cálculo total
        BigDecimal sumaFinal = producto1.add(producto2).add(producto3);
        BigDecimal importeIVA = sumaFinal.multiply(IVA).setScale(2,RoundingMode.HALF_UP);
        BigDecimal importeTotal = sumaFinal.add(importeIVA).setScale(2,RoundingMode.HALF_UP);
        // Imprimimos resultado
        //System.out.println("El coste final será de "+importeTotal+" €.Gracias por su visita.");
        System.out.printf("""
                TICKET DE VENTA
                ________________
                Producto 1: %s €
                Producto 2: %s €
                Producto 3: %s €
                ________________
                Subtotal :  %s €
                IVA (21%%):  %s €
                TOTAL    :  %s €
                ________________
                
                Gracias por su visita!
                """,producto1.toPlainString(),producto2.toPlainString(),producto3.toPlainString(),
                sumaFinal.setScale(2,RoundingMode.HALF_UP).toPlainString(),
                importeIVA.setScale(2,RoundingMode.HALF_UP).toPlainString(),
                importeTotal.setScale(2,RoundingMode.HALF_UP).toPlainString());
         /* apuntes:
         setScale(2, RoundingMode.HALF_UP) --    dos decimales, y redondeamos hacia arriba  1.145 = 1.15
         toPlainString()  -- devuelve el número como texto plano
         %%   si hay que poner '%' dentro de un bloque de texto hay que escaparlo con otro %%
          */

    }
}
