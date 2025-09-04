package Excepciones.Aritmetica;

public class Aritmetica2 {
   public static int division (int numerador, int denominador){
      int resultado= 0;
       try {
       resultado = numerador / denominador;

          if (denominador == 0) {
          }
      } catch (Exception e) {
          System.err.println("Excepcion lanzada: "+e);
      }
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(division(6,3));
        System.out.println(division(100,0));
    }
}
