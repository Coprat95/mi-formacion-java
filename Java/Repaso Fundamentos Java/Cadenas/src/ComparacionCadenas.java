public class ComparacionCadenas {
    public static void main(String[] args) {
        // Comparacion de Cadenas ( pool de cadenas)  el pool es donde se guardan las cadenas
        var cadena1 = "Java";
        var cadena2 = "Java"; // apunta hacia la misma referencia

        // Comparacion de cadenas (==) comparan la referencia en memoria
        System.out.print("cadena1 es igual en referencia que cadena2: ");
        System.out.println(cadena1 == cadena2);
        String cadena3 = new String("Java"); // se crea una nueva referencia
        System.out.println(cadena1 == cadena3); // devuelve false

        // Comparar contenido usaremos el metodo equals
        System.out.print("Cadena1 es igual en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));
        System.out.println(("Cadena1 es igual en contenido a cadena2: ")+ cadena1.equals(cadena2));


    }
}
