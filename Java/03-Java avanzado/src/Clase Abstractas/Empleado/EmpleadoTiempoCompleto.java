package Empleado;

public class EmpleadoTiempoCompleto extends Empleado{

    public EmpleadoTiempoCompleto (String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
        @Override
        public void calcularSalario () {
            var salario = this.salarioBase;
            System.out.println(salarioBase+" €");
        }
    }
