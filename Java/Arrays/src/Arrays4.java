import java.util.Scanner;
public class Arrays4 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        // Declarar el arreglo
        System.out.println("Proporciona el largo del array : ");
        var largoArray = Integer.parseInt(scanner.nextLine());
        // Creamos de manera dinámica el array dependiendo lo que ingrese el usuario.
        var array = new int [largoArray];
        // Solicitar los valores del arreglo
        System.out.println("Ingrese los valors del arreglo");
        for (var i = 0; i <largoArray;i++){
            System.out.print("Proporciona array["+i+"]= ");
            array[i]= Integer.parseInt(scanner.nextLine());


        }
        // Imprimir los valores del arreglo
        System.out.println("\nImpresión del array");
        for (var i =0; i<largoArray;i++) {
            System.out.println("array["+ i +"] = " +array[i]);
        }


    }
}
