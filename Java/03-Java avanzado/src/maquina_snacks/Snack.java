package maquina_snacks;
public class Snack {
 // Atributos del snack
    private static int contadorSnacks;
    private int idSnack;
    private String nombre;
    private double precio;
// Por cada instancia de objeto se genera un id nuevo .
    public Snack (String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
        this.idSnack = ++contadorSnacks;
    }
// Getters & Setters
    public  int getIdSnack() {
        return idSnack;
    }

    public void setIdSnack(int idSnack) {
        this.idSnack = idSnack;
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
        return super.toString();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

}
