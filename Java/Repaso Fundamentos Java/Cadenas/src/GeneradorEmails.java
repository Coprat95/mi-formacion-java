import java.util.Locale;

public class GeneradorEmails {
    public static void main(String[] args) {
        var nombreCompleto ="Oliver Trave Garcia";
        var nombreEmpresa= "Montfrisa SA";
        var dominio =".com.es";

        // normalizamos nombre y email

        var nombreNormalizado = nombreCompleto.toLowerCase().replace(" ",".");
        var emailNormalizado = "@"+nombreEmpresa.toLowerCase().replace(" ","")+dominio;
        System.out.print("El email autogenerado es : ");
        System.out.println(nombreCompleto.toLowerCase().replace(" ",".")+"@"+nombreEmpresa.toLowerCase().replace(" ","")+dominio);
        System.out.print("El email autogenerado normalizando primero es : ");
        System.out.println(nombreNormalizado + emailNormalizado);
    }
}
