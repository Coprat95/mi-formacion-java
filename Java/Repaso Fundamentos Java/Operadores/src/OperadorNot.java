public class OperadorNot {
    public static void main(String[] args) {
        System.out.println("*** Operador not ***");
        boolean a = false;
        System.out.println("a (inicial) = " + a);
        // operador NOT ! (invertir el valor lógico)
        var resultado = !a; // convertirá el valor inicial falso a verdadero
        System.out.println("a (final) = " + resultado);
    }
}
