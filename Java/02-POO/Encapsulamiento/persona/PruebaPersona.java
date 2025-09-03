package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        // Contador por cada persona que se crea ( cuando llamamos al constructor)

        System.out.println("Variable estática : " +Persona.contadorPersonas);

        var persona1 = new Persona("Oliver","Trave");
        // Utilizar los get para recuperar los datos
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getApellido());
        // Cambiar los datos con los setters
        persona1.setNombre("Alicia");
        persona1.setApellido("Baldan");

        System.out.println("Variable estática : " +Persona.contadorPersonas);

        var persona2 = new Persona("Alicia","Baldan");
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getApellido());

        System.out.println("Variable estática : " +Persona.contadorPersonas);

    }
}
