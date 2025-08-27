public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("*** Operador Ternario ***");
        // Sintaxis
        // condición ? exp1 : exp2

        // Determinar si un número es par o no
        var numero = 20;
        // a resultado se le asigna "Es par" o "Es impar"
        var resultado = (numero % 2 == 0 ) ? "Es par" : "Es impar";
        System.out.println("resultado = " + resultado);

        // Calcular si es mayor de edad
        var mayorEdad = (numero >= 18) ? "Mayor de edad." : "Menor de edad.";
        System.out.println("Edad: " + mayorEdad);

        // valor positivo, negativo , cero (equivalente if , else if , else)
        // operador ternario anidado
        numero = 10;
        resultado = (numero >0 ) ? "positivo" : ( numero<0) ? "Negativo" : "Cero";
        // si es  > 0         positivo.    nueva condicion <0 = negativo  . Else  = cero.
        System.out.println("El numero "+ numero + " es " + resultado);
        

    }
}
