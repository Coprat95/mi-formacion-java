package persona;

public class PruebaPersona2 {
    public static void main(String[] args) {

        var personaid1 = new Persona2 ("Manolo","Bombo");
        System.out.println(Persona2.getContadorPersona());
        var personaid2 = new Persona2("Antonia","Garcia");
        System.out.println(Persona2.getContadorPersona());


    }
}
