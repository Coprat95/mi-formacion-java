package Empleado;

/*
Crea una clase abstracta Empleados que tenga de atributos nombre y salarioBase.
Debe tener un metodo abstracto calcularSalario() y uno normal mostrarDatos() que
imprime el nombre y el salario base.

Crearemos dos clases que hereden de empleado: empleadoTiempoCompleto. (salario base)
empleadoPorHoras ( salario por hora )


 */
public abstract class Empleado {
    protected String nombre;
   protected double salarioBase;

    // Constructor
    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }
    public abstract void calcularSalario();
    public void mostrarDatos() {
        System.out.printf("""
                Nombre : %s
                Salario: %s €
                """, nombre, salarioBase);
    }
}



