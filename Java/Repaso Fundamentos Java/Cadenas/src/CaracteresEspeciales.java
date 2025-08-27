public class CaracteresEspeciales {
    public static void main(String[] args) {
        // Caracteres Especiales
        // \n  - imprime un salto de línea
        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = "Hola\nMundo";
        System.out.println("cadena2 = " + cadena2);

        // '\t' = tabulador
        var cadena3 = "Hola\tMundo";
        System.out.println("cadena3 = " + cadena3);
        
        // Añadir comillas ""
        var cadena4 = "Hola \" Mundo";  // sin el \" se cerraría las comillas y mundo queda fuera
        System.out.println("cadena4 = " + cadena4);




    }
}
