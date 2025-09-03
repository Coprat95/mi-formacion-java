package persona;

public class Persona {
    // Definimos clase y sus métodos
    static int contadorPersonas = 0; // ejemplo de atributo estático ( a la clase )
                                    // por cada objeto creado se incrementa el contador
    private String nombre;
    private String apellido;

// Constructor
    public Persona(String nombre,String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        // Incrementar el atributo static cada vez que se llama al constructor de persona
        Persona.contadorPersonas++;
    }
    @Override
    public String toString(){
        return "Nombre : "+ this.nombre+ " "+this.apellido + super.toString();
    }

    // Getter y setters nombre
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    // Getter y setters apellido
    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }





}
