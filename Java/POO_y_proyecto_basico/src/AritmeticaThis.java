import java.beans.PropertyEditorSupport;

public class AritmeticaThis {
    int operando1;
    int operando2;
    public AritmeticaThis() {};
    public AritmeticaThis(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Operador this apunta a " + this);
    }
    void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("El resultado de la suma es " + resultado);
    }
    void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("El resultado de la resta es " + resultado);
    }

    public static void main(String[] args) {
        var aritmetica1 = new AritmeticaThis(5,7);
        aritmetica1.sumar();
        aritmetica1.restar();
        System.out.println("Imprimir direccion memoria obj1 :" + aritmetica1);
        // Creamos segundo objeto
        var aritmetica2 = new AritmeticaThis(12,8);
        aritmetica2.sumar();
        aritmetica2.restar();
        System.out.println("Dir. memoria obj2: "+ aritmetica2);
    }
}
