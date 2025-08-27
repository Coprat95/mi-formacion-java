public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios ****");
        int a = 3, b=2, resultado;
        var c = true;
        // Operador unario +
        resultado = +a;
        System.out.println("a += " + a);
        // Operador unario -
        resultado =-a;
        System.out.println("resultado - = " + resultado);

        // Operadores unarios incremento/decremento
        // Pre -incremento;
        a = 3;
        resultado = ++a; // primero se incrementa el valor
        System.out.println("resultado ++a = " + resultado);
        System.out.println("a ya se incrementó = " + a);
        // Post-incremento
        a = 3;
        resultado = a++; // primero se usa el valor y despues se incrementa
        System.out.println("resultado a++ = " + resultado);
        System.out.println("a en este momento se incrementa a = "+a);
        // Caso decremento funciona igual
    }
}
