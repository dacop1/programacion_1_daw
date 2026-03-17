package Ejercicio_8;

public class Main {

	public static void main(String[] args) {

		// Array de empleados usando la clase base como tipo
		Empleado[] empleados = new Empleado[2];

		// Añadimos un EmpleadoFijo
		empleados[0] = new EmpleadoFijo("Juan", 2000);

		// Añadimos un EmpleadoPorHoras
		empleados[1] = new EmpleadoPorHoras("Ana", 120, 15);

		// Recorremos el array y mostramos el nombre y salario
		for (Empleado e : empleados) {
			// Llamamos a calcularSalario() desde referencia Empleado
			System.out.println("Nombre: " + e.nombre + " - Salario: " + e.calcularSalario());
		}
	}
}