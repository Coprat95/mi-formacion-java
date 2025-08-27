public class InmutabilidadCadenas {
    public static void main(String[] args) {
        // Inmutabilidad de Cadenas
        // una vez  que se ha definido un objeto en memoria no se le puede modificar sus caracteres
        // solo se puede asignar un nuevo objeto en memoria
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);
        var cadena2 = cadena1;
        cadena1 = "Adios";
        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
    }
}
