public class MetodosDeCadenas {
    public static void main(String[] args) {
        // Métodos de cadenas
        var cadena1 = "Hola Mundo";
        
        // Obtener el largo de una cadena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud); // te devuelve longitud 10 ( 9 indices)

        // Reemplazar caracteres
        var nuevaCadena= cadena1.replace('H','M'); // reemplaza los caracteres H por M
        System.out.println("nuevaCadena = " + nuevaCadena);  // Mola Mundo
        var nuevaCadena2 = cadena1.replace('o','a');
        System.out.println("nuevaCadena2 = " + nuevaCadena2); // Hala Munda ( todas las o por a)

        // Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas); // HOLA MUNDO

        // Convertir a minusculas
        System.out.println("Resultado en minúsculas : "+ cadena1.toLowerCase()); // hola mundo

        // Eliminar espacios al inicio y al final
        var cadena2 = " Leo Reyes       ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2 sin espacios= " + cadena2.trim());


    }
}
