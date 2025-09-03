public class DetalleProducto {
    public static void main(String[] args) {
        String nombreProducto;
        double precioProducto;
        int stockProducto;
        boolean disponibilidadProducto;

        nombreProducto = "Portátil msi 13th i7";
        System.out.println("nombreProducto = " + nombreProducto);
        precioProducto = 750.00;
        System.out.println("precioProducto = " + precioProducto);
        stockProducto = 2;
        System.out.println("stockProducto = " + stockProducto);
        disponibilidadProducto = true;
        System.out.println("disponibilidadProducto = " + disponibilidadProducto);

        System.out.println("Tras la compra de dos portátiles");
        nombreProducto = "Portátil msi 13th i7";
        System.out.println("nombreProducto = " + nombreProducto);
        precioProducto = 700.00;
        System.out.println("precioProducto = " + precioProducto);
        stockProducto = 0;
        System.out.println("stockProducto = " + stockProducto);
        disponibilidadProducto = false;
        System.out.println("disponibilidadProducto = " + disponibilidadProducto);
    }
}
