package aritmetica;
// importante que todas nuestras clases no estén directamente dentro de la carpeta source
// por buenas prácticas mejor que estén dentro de paquetes

public class PruebaAritmetica {
    public static void main(String[] args) {
        var aritmetica1 = new AritmeticaThis(5,7);
        System.out.println("Atributo operando1 : " + aritmetica1.getOperando1());
        System.out.println("Modificamos operando1 a 7 ");
        aritmetica1.setOperando1(7);
        System.out.println("Operando1 = a  "+aritmetica1.getOperando1());

        aritmetica1.sumar();
        aritmetica1.restar();


        // Creamos segundo objeto
        var aritmetica2 = new AritmeticaThis(12,8);
        aritmetica2.sumar();
        aritmetica2.restar();

    }
}
