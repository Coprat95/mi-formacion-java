package Excepciones.Aritmetica;

public class Aritmetica {
    public static void main(String[] args) {
        int num1 = 5, num2 = 0;
        try {
            var resultadoDiv = num1 / num2 ;
            System.out.println("El resultado de la división entre " + num1 + " y " + num2 + " es : " + resultadoDiv);
        }catch (Exception e) {
            System.err.println("Excepcion lanzada : "+ e);

        }
    }
}
