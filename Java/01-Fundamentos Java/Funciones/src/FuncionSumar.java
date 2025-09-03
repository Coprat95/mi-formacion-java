public class FuncionSumar {
    static int sumar (int num1, int num2) {
    var resultado = num1+ num2;
    return resultado;
    }


    public static void main(String[] args) {
       // diferentes formas de usar la funcion sumar
        // 1
        int arg1 = 2, arg2 = 3;
       var resultadosuma =  sumar ( arg1,arg2);
        System.out.println(resultadosuma);
        // 2
        var resultadoFinal = sumar(3,5);
        System.out.println(resultadoFinal);
        // 3
        System.out.println(sumar(6,5));
    }
}
