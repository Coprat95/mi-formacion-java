package persona;

public class Persona2 {
    protected String nombre;
    protected String apellido;
    protected static int contadorPersona =0; // static porque es atributo de clase
    protected   int idUnico ;

    public Persona2 (String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.idUnico = ++contadorPersona;
    }
    // Getters y setters para reforzar el ENCAPSULAMIENTO
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdUnico() {
        return idUnico;
    }

    public void setIdUnico(int idUnico) {
        this.idUnico = idUnico;
    }

    // metodo static ya que el atributo tambien es static
    public static int getContadorPersona(){
        return Persona2.contadorPersona;
    }
}
