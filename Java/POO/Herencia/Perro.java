package Animales;

// clase perro extiende de animal
public class Perro extends Animal {
    private String raza;
    public Perro (String tipoAnimal, int edadAnimal, String raza) {
        super(tipoAnimal,edadAnimal);
        this.raza = raza;
    }
    protected String getRaza(){
        return  this.raza;
    }
    protected void setRaza(String raza){
        this.raza = raza;
    }
    // Sobreescribimos los métodos dormir y comer
    @Override
    protected void dormir(){
        System.out.println("Duermo mientras no está mi dueño. ");
        super.dormir();
    }
    @Override
    protected  void comer(){
        System.out.println("Como todas las barritas que puedo . ");
        // super.comer();  podríamos poner esto para mantener el de la clase padre
    }


    // Metodo nuevo
    @Override
    protected void hacerSonido(){
        System.out.println("Guau, guau!");
    }


    public static class PruebaAnimales {
        public static void main(String[] args) {
            var animal1 = new Animal("Gato", 5);
            System.out.println("Tipo de animal: "+animal1.getTipoAnimal());
            System.out.println("Edad del animal: "+animal1.getEdadAnimal());
            animal1.comer();
        }
    }
}