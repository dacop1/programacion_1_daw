package Ejercicio_7;

// Clase base que representa un vehículo genérico
public class Vehiculo {

	protected String marca;   // Marca del vehículo
	protected String modelo;  // Modelo del vehículo
	protected int anio;       // Año de fabricación

	// Constructor que inicializa los atributos del vehículo
	public Vehiculo(String marca, String modelo, int anio) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
	}

	// Método para mostrar los detalles básicos del vehículo
	public void mostrarDetalles() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Año: " + anio);
	}

	// Método para indicar que el vehículo se está moviendo
	// Se puede sobrescribir en las clases derivadas
	public void mover() {
		System.out.println("El vehículo se está moviendo");
	}
}