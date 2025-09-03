package Animales;

public class PruebaAnimal {
    public static void main(String[] args) {
        // Instanciamos objeto Animal
                var animal1 = new Animal("Gato",5);
        // Obtener los datos de animal
        System.out.println("*** Tipo Animal ***");
        System.out.println("Tipo animal = "+animal1.getTipoAnimal());
        System.out.println("Edad animal = "+animal1.getEdadAnimal());
        // Usar los métodos de animal
        animal1.hacerSonido();
        animal1.comer();
        animal1.dormir();

        System.out.println();
        System.out.println("*** Tipo Perro ***");

        // Instanciamos objeto Perro
        var perro1 = new Perro("Kira",13,"Caniche");
        System.out.println("Tipo perro = "+ perro1.getTipoAnimal());
        System.out.println("Edad perro = "+ perro1.getEdadAnimal());
        System.out.println("Raza perro = "+ perro1.getRaza());
        // métodos exclusivos Perro + dormir ( de clase padre con super)
        perro1.hacerSonido();
        perro1.comer();
        perro1.dormir();

        // Instanciamos objeto Gato. Probamos polimorfismo en hacerSonido()
        var gato1 = new Gato("Misifú",10,"Pekinés");
        System.out.println("Tipo gato = "+ gato1.getTipoAnimal());
        System.out.println("Edad gato = "+ gato1.getEdadAnimal());
        System.out.println("Raza gato = "+ gato1.getRaza());
        // métodos exclusivos Perro + dormir ( de clase padre con super)
        gato1.hacerSonido();
        gato1.comer();
        gato1.dormir();
        System.out.println("*** USANDO POLIMORFISMO ***");
        // USANDO POLIMORFISMO
        Animal poliPerro = new Perro ("Scooby", 12, "Yorkshire");
        poliPerro.hacerSonido();

        Animal poliGato = new Gato ("Minino", 3,"Egipcio");
        poliGato.hacerSonido();





    }
}
