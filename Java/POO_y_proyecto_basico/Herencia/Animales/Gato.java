package Animales;

public class Gato extends Animal{
    private String raza ;
    public Gato (String tipoAnimal, int edadAnimal, String raza) {
        super(tipoAnimal, edadAnimal);
        this.raza = raza;
    }
    String getRaza(){
        return this.raza;
    }
    void setRaza(String raza){
        this.raza = raza;
    }
    @Override
      protected   void hacerSonido(){
            System.out.println("Miauu... Miauu!");
        }
    }

