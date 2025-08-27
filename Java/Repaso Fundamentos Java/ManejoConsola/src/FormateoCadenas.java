public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("*** Formateo de Cadenas ***");
        var nombre = "Matías";
        var edad = 35;
        var salario = 21000.50;

        // String.format   + usado laboralmente
        var mensaje = String.format("Nombre : %s , Edad: %d, Salario :%.2f"
                , nombre, edad, salario); // se podría concatenar
        // "Nombre : "+ nombre; tambien se puede hacer así . %s sustituye el contenido
        // %d: sustituye un entero
        // %.2f  (dos decimales .2) f - flotante
        System.out.println(mensaje);

        // Método printf : ponemos un %n al final para salto de línea ya que le quitamos el println
        System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f%n", nombre, edad, salario);


        var numeroEmpleado = 12;
        // Formateo con text block
        mensaje = """
                %nDetalle Persona:\s
                --------------
                \tNombre: %s
                --------------
                \tNumero de Empleado: %04d
                -------------
                \tEdad: %d
                --------------
                \tSalario: %.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);      //  \s añade un espacio en blanco
        // %04d   se completa con ceros (0) y hasta cuatro dígitos (4)  d(entero) = %04d
        System.out.println(mensaje);

        // Formateo con text block y printf directamente
        System.out.printf("""
                %nDetalle Persona:\s
                --------------
                \tNombre: %s
                --------------
                \tNumero de Empleado: %04d
                -------------
                \tEdad: %d
                --------------
                \tSalario: %.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}

