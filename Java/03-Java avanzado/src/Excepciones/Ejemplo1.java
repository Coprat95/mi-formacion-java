package Excepciones;

public class Ejemplo1 {
    public static void main(String[] args) {
        var num1 = 2;
        var num2 = 0;
        // Introducimos el try ANTES de que empiece el código conflictivo
        try {
            var resultadoDiv = num1 / num2;
            System.out.println("Resultado de la división entre num1 y num2 es : " + resultadoDiv);
       // Introducimos catch cuando ACABA el código conflictivo
            // Exception es la clase padre de todas las excepciones
        }catch (Exception e){
            System.err.println("Ocurrió un error: "+e);  // system.err lo imprime como error (en rojo)
        }

        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	at Excepciones.Ejemplo1.main(Ejemplo1.java:7)

    Process finished with exit code 1  // éste 1 significa que ha terminado con un error el código
         */
    }
}
