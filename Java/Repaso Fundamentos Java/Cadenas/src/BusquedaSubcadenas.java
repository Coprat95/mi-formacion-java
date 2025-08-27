public class BusquedaSubcadenas {
    public static void main(String[] args) {
        // Buscar subcadenas
        // indexOf - Devuelve el primer índice de la primera aparación de la subcadena
        var cadena1 ="Hola Mundo";
        // subcadena a buscar "Hola"
        var indice1 = cadena1.indexOf("Hola");
        System.out.println("indice1 = " + indice1);

        // lastIndexOf - devuelve el primer indice de la última aparición de la subcadena
        var indice2 = cadena1.lastIndexOf("Mundo");
        System.out.println("indice2 = " + indice2);
        // subcadena no encontrada devuelve -1
        var indice3 = cadena1.indexOf("java");
        System.out.println("indice3 = " + indice3);
        
        // sabiendo ya los indices puedes buscar mundo por ejemplo 
        var subcadena1 = cadena1.substring(5,10);
        System.out.println("subcadena1 = " + subcadena1);
    }
}
