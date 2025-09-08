package maquina_snacks_Oliver;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable { // Lo hacemos JavaBeans)
    private static int contador = 0;
    private int id ;
    private String nombre;
    private double precio;

    public Snack (){} // constructor sin argumentos (Requerido por JavaBeans)
    public Snack (String nombre, double precio ) {
        this.id = ++contador;
        this.nombre = nombre;
        this.precio = precio;
    }
    // Getters & Setters

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

    // métodos toSring, equals y hashCode


    @Override
    public String toString() {
        return "Id : "+this.id+" | Nombre : "+this.nombre+
                ", precio : "+precio+" €";
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
