package ventas2;

import ventas.Producto;

public class Producto2 {
    protected static int contadorProductos2 = 0;
    private final int idProducto2;
    private String nombre2;
    private double precio2;

    public Producto2 (String nombre2, double precio2) {
        this.nombre2 = nombre2;
        this.precio2 = precio2;
        this.idProducto2 = ++contadorProductos2;
    }

    public String getNombre2() {
        return this.nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public double getPrecio2() {
        return this.precio2;
    }

    public void setPrecio2(double precio2) {
        this.precio2 = precio2;
    }

    public int getIdProducto2() {
        return this.idProducto2;
    }

    @Override
    public String toString() {
        return "Producto2{" +
                "idProducto2=" + idProducto2 +
                ", nombre2='" + nombre2 + '\'' +
                ", precio2=" + precio2 +
                '}';
    }
}
