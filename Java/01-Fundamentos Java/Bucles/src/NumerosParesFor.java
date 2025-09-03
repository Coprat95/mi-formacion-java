public class NumerosParesFor {
    public static void main(String[] args) {
        System.out.println("*** Introducimos los números pares del 1 al 20 usando FOR ");
        for ( var i = 0; i <= 20 ; i++) {
          if (i % 2 == 0 )  {
              System.out.println(i);
          }
          i++;
        }
    }
}
