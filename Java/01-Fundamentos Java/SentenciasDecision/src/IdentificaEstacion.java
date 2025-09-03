import java.util.Scanner;
public class IdentificaEstacion {
    public static void main(String[] args) {
        System.out.println("Indique un mes en escala numérica (1-12). ");
        Scanner scanner = new Scanner(System.in);
        var numeroMes = Integer.parseInt(scanner.nextLine());

        // Añadimos el nombre de los meses
        String nombreMes;
        String estacionMes;

        if (numeroMes == 1) {
            nombreMes = "Enero";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Invierno";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");
        } else if (numeroMes == 2) {
            nombreMes = "Febrero";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Invierno";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");
        } else if (numeroMes == 3) {
            nombreMes = "Marzo";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Primavera";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");
        } else if (numeroMes == 4) {
            nombreMes = "Abril";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Primavera";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");
        } else if (numeroMes == 5) {
            nombreMes = "Mayo";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Primavera";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");

        } else if (numeroMes == 6) {
            nombreMes = "Junio";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Verano";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");
        } else if (numeroMes == 7) {
            nombreMes = "Julio";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Verano";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");
        } else if (numeroMes == 8) {
            nombreMes = "Agosto";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Verano";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");
        } else if (numeroMes == 9) {
            nombreMes = "Septiembre";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Otoño";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");
        } else if (numeroMes == 10) {
            nombreMes = "Octubre";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Otoño";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");
        } else if (numeroMes == 11) {
            nombreMes = "Noviembre";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Otoño";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");
        } else if (numeroMes == 12) {
            nombreMes = "Diciembre";
            System.out.println("El mes elegido es " + nombreMes);
            estacionMes = "Invierno";
            System.out.println("Se encuentra dentro de la estacion de "+estacionMes+".");
        } else {
            System.out.println("Número de mes no válido.");
        }
    }
}