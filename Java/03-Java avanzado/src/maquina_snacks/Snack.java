package maquina_snacks;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {  // lo hacemos JavaBeans ya que vamos a
                                              // instanciar objetos de ella
 // Atributos del snack
    private static int contadorSnacks = 0;
    private int idSnack;
    private String nombre;
    private double precio;
// Por cada instancia de objeto se genera un id nuevo .
    public Snack () { // constructor vacío al ser JavaBeans
        this.idSnack = ++contadorSnacks;
    }
    public Snack (String nombre, double precio ){
        this(); // llama al constructor vacío  primero.
        this.nombre = nombre;
        this.precio = precio;

    }
// Getters & Setters
    public  int getIdSnack() {
        return idSnack;
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

    // Metodos toString, equals y HashCode para optimizar a la hora de buscar los snacks en lista

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
