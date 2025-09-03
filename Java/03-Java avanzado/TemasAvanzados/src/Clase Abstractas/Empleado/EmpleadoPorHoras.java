package Empleado;

public class EmpleadoPorHoras extends Empleado {
    double horasTrabajadas;
    double salarioHora;
   double sueldoTotal;

    //Constructor
    public EmpleadoPorHoras (String nombre, double salarioBase, double horasTrabajadas, double salarioHora) {
        super ( nombre,  salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.salarioHora = salarioHora;

    }
    public void mostrarDatos() {
        System.out.printf("""
                Nombre : %s
                Horas trabajadas: %s
                Salario por hora :%s €
                
                """, nombre, horasTrabajadas,salarioHora);
    }

    @Override
    public void calcularSalario () {
        sueldoTotal = salarioHora * horasTrabajadas;
        System.out.println(sueldoTotal+"  €");

    }
}
