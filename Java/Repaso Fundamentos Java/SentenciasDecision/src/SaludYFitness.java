import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;
public class SaludYFitness {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Constantes
        // Versión + complicada y profesional (mía)
        final BigDecimal META_PASOS_DIARIOS = new BigDecimal("10000");
        final BigDecimal CALORIAS_POR_PASO = new BigDecimal("0.004");

        System.out.println("*** Aplicacion de salud y fitness***");
        System.out.print("Introduzca el nombre de usuario: ");
        var nombre = scanner.nextLine();
        System.out.println("Introduzca los pasos caminados en el día de hoy: ");
        BigDecimal pasos = new BigDecimal(scanner.nextLine());

        // Cálculo de calorías quemadas
        // setScale ( tiene que coincidir los decimales que hay o redondearlo a 2(este caso)
        var caloriasQuemadas= pasos.multiply(CALORIAS_POR_PASO).setScale(2, RoundingMode.HALF_UP);
        // >= -1  (pasos < que metapasos)   >= 0 (pasos = metapasos)  >= 1 ( pasos > metapasos)
        var metaAlcanzada = pasos.compareTo( META_PASOS_DIARIOS) >= 0;
        System.out.println("""
                Usuario: %s.
                Total pasos hoy: %s
                Meta fijada: %s
                Objetivo cumplido: %b
                Total de calorias quemadas : %s
                """.formatted(nombre,pasos.toPlainString(),META_PASOS_DIARIOS.toPlainString(),
                metaAlcanzada,caloriasQuemadas.toPlainString()
        ));

        /* Version con int y double (fácil, profesor);
        System.out.print("Introduzca el nombre de usuario: ");
        var nombre = scanner.nextLine();
        System.out.println("Introduzca el total de pasos en el día de hoy: ");
        var pasos = Integer.parseInt(scanner.nextLine());
        // Constantes
        final var META_PASOS_DIARIO = 10000;
        final var CALORIAS_POR_PASO = 0.04;
        // Cálculo de calorías quemadas
        var caloriasQuemadas = pasos * CALORIAS_POR_PASO;
        // Verificar si cumple la meta
        var metaCumplida = pasos >= META_PASOS_DIARIO;
        System.out.println("Ha cumplido con la meta diaria ? " + metaCumplida);
        System.out.println("caloriasQuemadas = " + caloriasQuemadas);*/


    }
}
