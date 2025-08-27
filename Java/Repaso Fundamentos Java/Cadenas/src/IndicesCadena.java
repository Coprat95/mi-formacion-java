public class IndicesCadena {
    public static void main(String[] args) {
        String cadena1 = "Hola Mundo"; // o var cadena1 =...
        
        // recuperar el primer caracter 
        var primerCaracter= cadena1.charAt(0); // Debe recuperar el caracter 'H'
        System.out.println("primerCaracter = " + primerCaracter);
        // recuperar el ultimo caracter ( en la posicion 9 )
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);
        // imprimir la letra M, indice 5
        var letraM = cadena1.charAt(5);
        System.out.println("letraM = " + letraM);
    }
}
