public class Persona {
    // Definimos clase y sus métodos
    String nombre;
    String apellido;


     void mostrarPersona() {
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido: " + apellido);
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de Clase y objetos Persona *** ");
        // Instanciamos objeto1
        var objeto1 = new Persona();
        objeto1.nombre = "Oliver";
        objeto1.apellido = "Trave";
        objeto1.mostrarPersona();
        // Segundo objeto
        var objeto2 = new Persona();
        objeto2.nombre = "Alicia";
        objeto2.apellido= "Baldan";
        objeto2.mostrarPersona();

    }

}
