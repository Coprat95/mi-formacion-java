package maquina_snacks;
import java.util.Scanner;

public  class MaquinaSnacks {

    public static void MaquinaSnacks (){
        mostrarMenu();

    };
    private static void mostrarMenu(){
        System.out.println("""
                1. Comprar snack
                2. Mostrar ticket
                3. Agregar nuevo snack
                4. Salir
                Elije una opcion: 
                """);
        ejecutarOpciones();
    };

    private static void ejecutarOpciones() throws OpcionNoValida_MS {
        Scanner scanner = new Scanner (System.in);
        var opcion = Integer.parseInt(scanner.nextLine());
        switch (opcion) {
            case 1: {
                System.out.println("Elije el snack que quieres comprar :");
            }
            case 2: {
                System.out.println("Mostramos ticket. ");
            }
            case 3: {
                System.out.println("Agregar nuevo snack. ");
                agregarSnack();
                System.out.println("Snack agregado. ");

            }
            case 4: {
                System.out.println("Nos vemos en la próxima ! ");
            }
             default : {
                 throw new OpcionNoValida_MS ("Opcion escogida no válida");

            }
        }

    };

    private static void mostrarTicked(){};

    private static void agregarSnack(){};


}
