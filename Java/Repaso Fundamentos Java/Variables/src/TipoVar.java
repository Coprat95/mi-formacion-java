public class TipoVar {
    public static void main(String[] args) {
        // sin el uso de var
        String nombre1= "Juan";
        System.out.println("nombre1 = " + nombre1);
        // con uso de var
        var nombre2 ="Carlos";
        System.out.println("nombre2 = " + nombre2);
        // Definir otras variables usando var
        var edad = 30; // se interfiere el tipo int
        System.out.println("edad = " + edad);
        var sueldo = 5000.5F; // se interfiere tipo float
        var esCasado = false; // se interfiere tipo boolean
        esCasado = true;
        System.out.println("esCasado = " + esCasado);
        // esCasado = "No". No podemos asignar un tipo distinto
        // Cuando definimos la variable utilizando var se debe definir el valor.
    }
}
