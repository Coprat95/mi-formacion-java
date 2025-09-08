package maquina_snacks2;



import java.io.Serializable;
import java.util.Objects;

// Creación clase Snack JavaBeans
public class Snack implements Serializable {
    private static int contador = 0;
    private int id;
    private String nombre;
    private double precio;

    public Snack (){}  // Constructor sin argumentos requerido por JavaBeans

    public  Snack(String nombre, double precio) {
        this.id = ++contador;
        this.nombre = nombre;
        this.precio = precio;
    }

    // Getters y Setters


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // Generación toString, equals y hashcode

    public String mostrarSnack() {
        return "Id : " + id + " | Nombre: " + nombre + " , precio = " + precio + "€";
    }



    @Override
    public String toString() {
        return mostrarSnack();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return id == snack.id && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, precio);
    }
}