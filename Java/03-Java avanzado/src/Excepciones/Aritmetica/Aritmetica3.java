package Excepciones.Aritmetica;

/*
 * Diferencias entre Exception y RuntimeException:
 * RuntimeException = “esto no debería pasar si usas bien el metodo”
 * Exception = “esto puede pasar, prepárate para manejarlo”
 */

/**
 * Clase que contiene operaciones aritméticas con manejo de excepciones.
 */
public class Aritmetica3 {

    /**
     * Realiza una división entre dos enteros.
     *
     * @param numerador   el número que se divide
     * @param denominador el número por el que se divide
     * @return el resultado de la división
     * @throws ExcepcionDivision0 si el denominador es cero
     */
    public static int divisiones(int numerador, int denominador) throws ExcepcionDivision0 {
        if (denominador == 0) {
            throw new ExcepcionDivision0("No se puede dividir entre cero");
        }
        return numerador / denominador;
    }

    /**
     * Método principal que prueba la división con manejo de errores.
     */
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        try {
            int resultado = divisiones(num1, num2);
            System.out.println("Resultado: " + resultado);
        } catch (ExcepcionDivision0 e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}