public class OperadorOr {
    public static void main(String[] args) {
        // OR (regresa true si cualquiera de los valores es true)
        boolean a = true, b = false;
        var resultado = a||b ;
        System.out.println("resultado = " + resultado); // true
        a = false;
        resultado = a||b;
        System.out.println("resultado = " + resultado); // false
    }
}
