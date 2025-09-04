package JavaBeans;



import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {
        Persona p1 = new Persona();
        p1.setNombre("Oliver");
        p1.setApellido("Trave");
        System.out.println("Nombre : "+ p1.getNombre());
        System.out.println("Apellido : " + p1.getApellido());


    }
}
    class  Persona implements Serializable {
    private String nombre;
    private String apellido;

    public  Persona (){}

        public String getNombre() {
            return this.nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return this.apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

    }
