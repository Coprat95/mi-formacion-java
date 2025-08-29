public class FuncionRecursiva {
    // Imprimir 1 al 5 usando una funcion recursiva
    // Funcion recursiva
    static void contar (int num1) {
        if (num1 <=5)  {
            System.out.println(num1);
            num1++;
            contar(num1);
        }
        else {
            System.out.print("Hemos llegado al número final : " +(num1-1));

        }
    }


    public static void main(String[] args) {

        contar(1);
    }
}

/* Forma más elegante  , hace 10 iteraciones en vez de 5 :

public class FuncionRecursiva {
    // Imprimir 1 al 5 usando una funcion recursiva
    // Funcion recursiva
    static void funcionRecursiva(int numero){
        // Caso Base
        if(numero == 1)
            System.out.print(numero + " ");
        else{
            // Caso recursivo
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(10);
    }
}

 */