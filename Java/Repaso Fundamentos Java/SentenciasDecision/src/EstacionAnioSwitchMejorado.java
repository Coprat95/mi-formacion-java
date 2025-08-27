import java.util.Scanner;

public class EstacionAnioSwitchMejorado {


        public static void main(String[] args) {
            System.out.println("Indique un mes en escala numérica (1-12). ");
            Scanner scanner = new Scanner(System.in);
            var numeroMes = Integer.parseInt(scanner.nextLine());

            // Añadimos el nombre de los meses
            String nombreMes;
            String estacionMes;

            // Hacemos este switch para que sea escalable. De otra forma habría que poner
            // la estación una por una (en  otros ejemplos puede ser cientos de veces ) .
            estacionMes = switch (numeroMes) {
                case 12 , 1 ,2  -> estacionMes = "Invierno";
                case 3 , 4, 5   -> estacionMes = "Primavera";
                case 6, 7, 8    -> estacionMes = "Verano";
                case 9 , 10, 11 -> estacionMes = "Otoño";
                default -> "Valor no válido.";
            };

            switch (numeroMes)  {
                case 1 -> {
                    nombreMes = "Enero";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }
                case 2 ->  {
                    nombreMes = "Febrero";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }
                case 3 ->  {
                    nombreMes = "Marzo";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }
                case 4 ->  {
                    nombreMes = "Abril";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }
                case 5 ->  {
                    nombreMes = "Mayo";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }

                case 6 ->  {
                    nombreMes = "Junio";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }
                case 7 ->  {
                    nombreMes = "Julio";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }
                case 8 ->  {
                    nombreMes = "Agosto";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }
                case 9 ->  {
                    nombreMes = "Septiembre";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }
                case 10 ->  {
                    nombreMes = "Octubre";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }
                case 11 ->  {
                    nombreMes = "Noviembre";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }
                case 12 ->  {
                    nombreMes = "Diciembre";
                    System.out.println("El mes elegido es " + nombreMes);
                    System.out.println("Se encuentra dentro de la estacion de " + estacionMes + ".");
                }
                default -> {
                    System.out.println("Número de mes no válido.");
                }
            }

        }
    }

