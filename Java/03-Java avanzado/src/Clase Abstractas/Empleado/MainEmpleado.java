package Empleado;

public class MainEmpleado {
    public static void main(String[] args) {
        System.out.println("Ejemplo con empleado de tiempo completo. ");
        Empleado empCompleto = new EmpleadoTiempoCompleto("Oliver",1500);
        empCompleto.mostrarDatos();
        empCompleto.calcularSalario();

        System.out.println("\nEjemplo con empleado que trabaja por horas ");
        Empleado empHoras = new EmpleadoPorHoras("Alicia",0,40,10);
        empHoras.mostrarDatos();
        empHoras.calcularSalario();
    }
}
