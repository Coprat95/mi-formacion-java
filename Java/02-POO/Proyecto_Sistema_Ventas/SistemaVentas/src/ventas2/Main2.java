package ventas2;

public class Main2 {

    public static void main(String[] args) {
        var p1 = new Producto2("Zapato", 40);
        System.out.println(p1);  // al tener el metodo String imprime los datos
        var p2 = new Producto2("Bolso", 35.99);
        var p3 = new Producto2("Reloj", 255.99);

        var o1 = new Orden2();
        o1.agregarProducto(p1);
        o1.agregarProducto(p2);
        o1.agregarProducto(p3);
        System.out.println(o1.calcularTotal());
    }


}
