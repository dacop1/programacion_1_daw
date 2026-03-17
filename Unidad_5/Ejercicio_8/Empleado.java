package Ejercicio_8;

// Clase base que representa a cualquier empleado
public class Empleado {

	protected String nombre; // Nombre del empleado

	// Constructor con parámetro nombre
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	// Método para calcular el salario
	// En la clase base devuelve 0
	public double calcularSalario() {
		return 0;
	}

	// Método toString opcional para mostrar información
	@Override
	public String toString() {
		return "Nombre: " + nombre + " - Salario: " + calcularSalario();
	}
}