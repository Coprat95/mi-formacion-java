public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("***Operadores de Asignación***");
        // Asignacion =
        var miNumero =10;
        int miNumero2 ;
        // Asignacion compuesto
        // +=   Sumamos a la variable
        miNumero +=5; // miNumero = miNumero + 5;  15;
        System.out.println("miNumero = " + miNumero);
        // -=, *= , /=,  %=
        miNumero *=2;  // 30
        System.out.println("miNumero = " + miNumero);

        // Asignacion de variables múltiples
        int a= 10, b = 15, c = 20;  // tienen que ser del mismo tipo
        System.out.printf("""
                a = %d
                b = %d
                c = %d
                """,a,b,c);

    }
}
