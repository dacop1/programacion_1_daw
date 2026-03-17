package Ejercicio_8;

// Empleado con salario fijo mensual
public class EmpleadoFijo extends Empleado {

	private double salarioMensual;

	public EmpleadoFijo(String nombre, double salarioMensual) {
		super(nombre);
		this.salarioMensual = salarioMensual;
	}

	// Sobrescribe calcularSalario() para devolver el salario mensual
	@Override
	public double calcularSalario() {
		return salarioMensual;
	}
}