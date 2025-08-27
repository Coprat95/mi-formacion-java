public class OperadorAnd {
    public static void main(String[] args) {
        System.out.println("*** Operador AND && ***");
        boolean a = true, b = true;
        // and (regresa true SOLO si ambos valores son true)
        var resultado = a && b;
        System.out.println("resultado = " + resultado);
        a = false;
        resultado = a && b;
        System.out.println("resultado ( con a=false) = " + resultado);
    }
}
