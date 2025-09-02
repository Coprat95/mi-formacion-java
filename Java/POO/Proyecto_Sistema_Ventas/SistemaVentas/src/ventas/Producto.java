package ventas;

public class Producto {
    private static int contadorProducto = 0;
    private final int idProducto;  // no se debe cambiar el id (final, constante)
    private String nombre;
    private double precio;

    public Producto (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.idProducto = ++contadorProducto;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getIdProducto() {
        return this.idProducto;
    }


    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
