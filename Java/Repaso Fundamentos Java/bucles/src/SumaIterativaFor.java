public class SumaIterativaFor {
    public static void main(String[] args) {
        System.out.println("Suma iterativa de los 5 primeros números ");
        // FORMA MÁS LIMPIA DE HACERLO
      final var MAXIMO = 5;
      var numero = 1;
      var suma = 0;
      while (numero <= MAXIMO) {
          suma += numero++;
          System.out.println("Suma parcial es = "+suma);

      }
        System.out.println("El resultado de la suma de los 5 primeros números es de "+suma);


        /*
        var num1 = 1;
        int suma;
       // USANDO FOR
        for (var i =2; i<= 5;i++) {
            suma = num1 + i;
            System.out.println(suma);
            num1 = suma;

        }
        // USANDO WHILE

        int i = 2;
        while (i <= 5) {
            suma = num1 + i;
            System.out.println(suma);
            num1 = suma;
            i++;
         */
        }
    }

