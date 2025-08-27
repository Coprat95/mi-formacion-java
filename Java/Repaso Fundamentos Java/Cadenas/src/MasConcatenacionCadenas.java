public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Mas formas de concatenar cadenas en Java
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;

        // Metodo concat
        cadena3 = cadena1.concat(" ").concat("Mundo");
        System.out.println("cadena3 usando concat= " + cadena3);

        // StringBuilder . Es mas eficiente ya que solo crea un objeto en memoria

        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        // constructorCadenas.append(cadena1).append(" ").append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);

        // StringBuffer  Seguro para cuando trabajas con varios procesos al mismo tiempo
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
       resultado= stringBuffer.toString();
        System.out.println("stringBuffer = " + stringBuffer);



        // join  : unir dos  o más cadenas
        resultado = String.join(" ",cadena1,cadena2); // ese espacio significa que por cada cadena
                                                      // que unamos se unirán con un espacio en blanco

        System.out.println("resultado join = " + resultado);
    }
}
