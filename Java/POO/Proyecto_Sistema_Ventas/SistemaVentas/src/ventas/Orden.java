package ventas;

public class Orden {
    private int contadorProductos; // para saber cuantos productos metemos por orden
    private static int contadorOrdenes; // para saber cuantas ordenes creamos
    private final int idOrden; // id orden
    private Producto[] productos; // Array objetos tipo Producto  ( como si fuera String o int)
    private static final int MAX_PRODUCTOS = 10; // límite de productos por orden , p.e

    public Orden (){
        this.idOrden = ++contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS]; // de momento se autorellena con mull
    }
    public void agregarProducto(Producto producto){
        if (contadorProductos <= MAX_PRODUCTOS) {
            this.productos[this.contadorProductos++] = producto;
            System.out.println("Producto ingresado.");
         // Aplicamos restricción para no superar el máximo
        } else {
            System.out.println("No se ha podido ingresar el producto. " +
                    "Máximo de "+MAX_PRODUCTOS+"superado.");
        }
    }

    public double calcularTotal () {  // no ponemos nada ya que no hace falta ingresar nada
        double total = 0;
    for (var i = 0; i < this.contadorProductos; i++){
     var producto = this.productos[i];
      total += producto.getPrecio();
    }
    return total;
    }

    public void mostrarOrden (){ // se llamará por ejemplo desde orden1.mostrarOrden()
                                 // por eso no hace falta un (int this.idOrden)
        System.out.println("Id Orden: "+ this.idOrden);
        var totalOrden = calcularTotal();
        System.out.println("\tTotal de la Orden :"+ totalOrden +" €");
        System.out.println("\tProductos de la Orden: ");
        for ( var i = 0 ; i < contadorProductos; i++){

            System.out.println("\t\t"+productos[i]);
        }

    }
}






