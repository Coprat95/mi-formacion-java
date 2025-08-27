import java.util.Scanner;
public class RecetaCocina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre de la receta :");
        var nombreReceta = sc.nextLine();

        System.out.println("Introduzca los ingredientes: ");
        var ingredientesReceta = sc.nextLine();
        System.out.println("ingredientesReceta = " + ingredientesReceta);

        System.out.println("Cuanto dura la receta? En minutos: ");
        var tiempoReceta = Integer.parseInt(sc.nextLine());
        System.out.println("tiempoReceta = " + tiempoReceta + "minutos.");

        System.out.println("Ingresa la dificultad de la receta(fácil/media/difícil) : ");
        var dificultadReceta = sc.nextLine();
        System.out.println("dificultadReceta = " + dificultadReceta);

        // Imprimamos la receta
        System.out.println("Ingredientes para la receta "+ nombreReceta);
        System.out.println(ingredientesReceta);
        System.out.println("Duración : "+ tiempoReceta+ ", dificultad: "+dificultadReceta);


    }
}
