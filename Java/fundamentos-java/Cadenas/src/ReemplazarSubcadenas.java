public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        // Reemplazar subcadenas  .replace
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        // Reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo","a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        System.out.println(cadena); // Seguirá imprimiendo Hola Mundo,son diferentes cadenas
        
        // Reemplazar "Hola" por "Adios";
        var nuevaCadena2= nuevaCadena.replace("Hola","Adios");
        System.out.println("nuevaCadena2 = " + nuevaCadena2); // Adios a todos
        
        var nuevaCadena3= cadena.replace("Hola","Adios");
        System.out.println("nuevaCadena3 = " + nuevaCadena3); // Adios Mundo
        
    }
}
