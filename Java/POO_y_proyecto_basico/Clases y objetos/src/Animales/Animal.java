package Animales;
// Clase Animal
public class Animal {
    private String tipoAnimal;
    private int edadAnimal;

    // Metodo Constructor
    public Animal(String tipoAnimal, int edadAnimal) {
        this.tipoAnimal = tipoAnimal;
        this.edadAnimal = edadAnimal;
    }
    // Getters and Setters
    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getEdadAnimal() {
        return edadAnimal;
    }

    public void setEdadAnimal(int edadAnimal) {
        this.edadAnimal = edadAnimal;
    }

    // métodos genéricos
    protected void dormir(){
        System.out.println("Duermos muchas horas al día. ");
    }
    protected void  comer(){
        System.out.println("Como muchas veces al día .");
    }
     protected void hacerSonido(){
        System.out.println("Sonido generado. ");
    }
}
