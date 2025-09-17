package zona_fit.domain;

import java.util.Objects;

/**
 * @author Oliver
 * @version  1.0
 * Creacion clase cliente con sus atributos id, nombre, apellido y membresía.
 *
 */
public class Client {
    private int id;
    private String nombre;
    private String apellido;
    private int membresia;

    public Client(){}

    //  Constructor para eliminar un cliente
    public Client(int id){
        this.id = id;
    }
    // Constructor para agregar un nuevo cliente
    public Client(String nombre, String apellido, int membresia){
        this.nombre= nombre;
        this.apellido = apellido;
        this.membresia = membresia;
    }
    // Constructor con todos los parámetros para recuperar todos los clientes
    public Client(int id,String nombre, String apellido, int membresia){
        this (nombre, apellido, membresia); // usa el constructor de antes
        this.id = id;
//        this.nombre= nombre;
//        this.apellido = apellido;
//        this.membresia = membresia;
    }

    /**
     * procedemos a generar los getters y setters, toString, hashCode y equals
     */

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMembresia() {
        return membresia;
    }

    public void setMembresia(int membresia) {
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", membresia=" + membresia +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && membresia == client.membresia && Objects.equals(nombre, client.nombre) && Objects.equals(apellido, client.apellido);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellido, membresia);
    }
}
