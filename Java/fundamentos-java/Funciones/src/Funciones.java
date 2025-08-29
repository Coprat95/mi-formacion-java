public class Funciones {
    /*
 - public: permite que la clase o método sea accesible desde otras clases o archivos.
 - static: indica que el método pertenece a la clase y no a una instancia (no necesitas crear un objeto para usarlo).
 - void: significa que el método no devuelve ningún valor.
 - Los nombres de métodos suelen escribirse en infinitivo si describen una acción (por convención), como "saludar".
*/
    static void saludar (String nombre) {
        System.out.println(" Hola "+nombre+", bienvenid@ a las funciones .");
    }
    public static void main(String[] args) {
        saludar("Oliver");
        saludar("Alicia");
    }
}
