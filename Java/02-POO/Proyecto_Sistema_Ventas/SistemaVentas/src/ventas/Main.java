package ventas;

public class Main {
    public static void main(String[] args) {
        // Creacion objetos tipo Producto
        Producto p1 = new Producto("Estuche", 5.50);
        Producto p2 = new Producto ("Movil" , 199.90);

        System.out.println(p1.toString());
        System.out.println(p2.toString());

        // Creacion objeto tipo Orden
        Orden orden1 = new Orden();
        orden1.agregarProducto(p1);
        orden1.agregarProducto(p2);
        orden1.mostrarOrden();

        var orden2 = new Orden();
        orden2.agregarProducto(new Producto("Camisa",15.00)); // se podría hacer pero no se podría
                                                              // reutilizar ese producto
        orden2.agregarProducto(p1);
        orden2.agregarProducto(p2);
        orden2.mostrarOrden();
    }
}
// Para mejorar aún más el código, sustituimos mostratDatos() por metodo String y asi cada vez
// que hagamos un system.out.println(orden1)  u orden2 nos va a mostrar todos los datos
