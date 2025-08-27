public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Comparacion ***");
        int a = 3, b = 2;
        // Igualdad ==
        var resultado = a == b;  // si es cierto true, else false
        System.out.println("resultado a==b " + resultado);
        // Distinto !=
        resultado = a!=b;
        System.out.println("resultado != " + resultado);
        // Mayor que >
        resultado = a > b;
        System.out.println("resultado  >" + resultado);
        // Mayor o igual que >=
        resultado = a >= b;
        System.out.println("resultado >= " + resultado);
        // Menor que <
        resultado = a < b;
        System.out.println("resultado < " + resultado);
        // Menor o igual que <=
        System.out.println("resultado <= " + resultado);
        b = 3;
        resultado = a <=b;
        System.out.println("resultado <= " + resultado);
    }
}
