public interface InterfaceTraductor {
    // Interfaz = contrato obligatorio sin mochila
    // por defecto los metodos son public y abstract
    void traducir ();  // las clases hijas deberán implementar el comportamiento de éste metodo

    // Metodos con implementacion por default ( le queremos dar implementacion)
    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}

// se usa implments en vez de extends
class Ingles implements  InterfaceTraductor {

    @Override
    public void traducir(){
        System.out.println("Texto traducido a inglés. ");
    }

}

class Frances implements  InterfaceTraductor {
    @Override
    public void traducir(){
        System.out.println("Texto traducido a francés. ");
    }
}
class pruebaTraductor {
    public static void main(String[] args) {
        // una interface no puede ser instanciada ya que tiene métodos abstractos
        System.out.println("Iniciamos el traductor a inglés. ");
        InterfaceTraductor ingles = new Ingles();
        ingles.iniciarTraductor();
        ingles.traducir();


        // instanciamos Francés
        System.out.println("\nIniciamos el traductor a francés. ");
        InterfaceTraductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}
