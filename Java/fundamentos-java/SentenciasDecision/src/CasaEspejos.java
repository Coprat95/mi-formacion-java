import java.util.Scanner;
public class CasaEspejos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("*** Entrada a la casa de los espejos ***");
        System.out.println("Tienes más de 10 años ? (true/false)");
        var esMayor10 = Boolean.parseBoolean(scanner.nextLine());
        System.out.println("Tienes miedo a la oscuridad? (true/false) ");
        var miedoOscuridad= Boolean.parseBoolean(scanner.nextLine());
        if (esMayor10 && !miedoOscuridad) {
            System.out.println("De acuerdo, puedes entrar. ");
        }else {
            System.out.println("Lo sentimos, no eres apto para entrar. ");
        }
    }
}
