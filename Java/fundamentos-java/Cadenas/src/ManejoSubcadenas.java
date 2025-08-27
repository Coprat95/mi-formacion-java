public class ManejoSubcadenas {
    public static void main(String[] args) {
        // Tema de subcadenas
        //  Hola Mundo    puedes generar una subcadena de cualquier caracter o de varios
        // Hola subcadena1 Mundo subcadena2  .    undo podría ser subcadena tambien  o o.

        var cadena1 = "Hola Mundo";
        System.out.println("cadena1 = " + cadena1);

        // Subcadena
        var subcadena1 = cadena1.substring(0,4); // indice 4 no lo incluye es como si fuera 3
        System.out.println("subcadena1 = " + subcadena1);

        /* también se podría hacer así :
        var subcadena2 = cadena1.substring(5);  // indicamos indice inicio y va hasta el final
        System.out.println("subcadena2 = " + subcadena2); */

        var subcadena2 = cadena1.substring(5,10); // realmente es el 9 el último
        System.out.println("subcadena2 = " + subcadena2);
    }
}
