package Ejercicio_8;

// Empleado que cobra por horas trabajadas
public class EmpleadoPorHoras extends Empleado {

	private int horasTrabajadas;
	private double precioHora;

	public EmpleadoPorHoras(String nombre, int horasTrabajadas, double precioHora) {
		super(nombre);
		this.horasTrabajadas = horasTrabajadas;
		this.precioHora = precioHora;
	}

	// Sobrescribe calcularSalario() devolviendo horas * precioHora
	@Override
	public double calcularSalario() {
		return horasTrabajadas * precioHora;
	}
}