package aritmetica;

public class Aritmetica {
    int operando1 ;
    int operando2 ;

    public Aritmetica(){};

    public Aritmetica(int op1, int op2){
        operando1 = op1;
        operando2 = op2;
    }
    void sumar (){
        var resultado = operando1+operando2;
        System.out.println(resultado);
    }
    void restar (){
        var resultado = operando1-operando2;
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        var aritmetica1 = new Aritmetica(5,7);
        aritmetica1.sumar();
        aritmetica1.restar();

        // constructor vacío
        var aritmetica2 = new Aritmetica();
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 8;
        aritmetica2.sumar();
        aritmetica2.restar();

    }
}
