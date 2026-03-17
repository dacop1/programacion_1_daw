package Ejercicio_7;

// Clase derivada de Vehiculo que representa un camión
public class Camion extends Vehiculo {

	private double capacidadCarga; // Capacidad de carga en toneladas

	// Constructor que inicializa atributos de Camion y Vehiculo
	public Camion(String marca, String modelo, int anio, double capacidadCarga) {
		super(marca, modelo, anio);
		this.capacidadCarga = capacidadCarga;
	}

	// Sobrescribe mostrarDetalles para incluir la capacidad de carga
	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Capacidad de carga: " + capacidadCarga + " toneladas");
	}

	// Sobrescribe mover para dar un mensaje específico del camión
	@Override
	public void mover() {
		System.out.println("El camión está en movimiento");
	}
}