package maquina_snacks;

import java.io.Serializable;
import java.util.Objects;

public class Snack implements Serializable {
private static int contador = 0;
private int id;
private String nombre;
private double precio;

    public Snack (){}
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

    // mostrarSnack / toString
    // Cuando hagamos un System.out.println(snack) saldrá con el formato siguiente:
    public String mostrarSnack() {
       return String.format("ID : %d | Nombre : %s, precio : %.2f €",
               getId(),getNombre(),getPrecio());
    }

    @Override
    public String toString() {
        return mostrarSnack();
    }

    // Equals y hashCode

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
