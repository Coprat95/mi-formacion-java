package ventas2;

public class Orden2 {
    private static int contadorOrden2 = 0;
    private static final  int MAXIMO_ORDEN = 10;
    private Producto2[] productos;
    private  int idOrden = 0;
    protected int contadorProductosOrd2;

    public Orden2 () {
       this.idOrden = ++contadorOrden2;
       this.productos = new Producto2[MAXIMO_ORDEN];
    }
    public void agregarProducto(Producto2 producto){
        if ( contadorProductosOrd2 < MAXIMO_ORDEN) {
            productos[contadorProductosOrd2++] = producto;
            System.out.println("Producto añadido. ");
        } else {
            System.out.println("Límite 10 alcanzado. No se ha podido añadir el producto. ");
        }
    }

    public Producto2[] getProductos() {
        return productos;
    }

    public void setProductos(Producto2[] productos) {
        this.productos = productos;
    }

    public int getIdOrden() {
        return idOrden;
    }

    public void setIdOrden(int idOrden) {
        this.idOrden = idOrden;
    }
    public double calcularTotal() {
        double valorTotal= 0.0;
        for (var i = 0; i < contadorProductosOrd2 ; i++) {

            valorTotal += productos[i].getPrecio2();
        }
        System.out.print("El valor total es de : " );
        return  valorTotal;
    }
}