package Ejercicio_7;

// Clase derivada de Vehiculo que representa un coche
public class Coche extends Vehiculo {

	private int numPuertas;  // Número de puertas del coche

	// Constructor que inicializa los atributos del coche y de Vehiculo
	public Coche(String marca, String modelo, int anio, int numPuertas) {
		super(marca, modelo, anio); // Llama al constructor de Vehiculo
		this.numPuertas = numPuertas;
	}

	// Sobrescribe mostrarDetalles para incluir el número de puertas
	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles(); // Muestra los datos de Vehiculo
		System.out.println("Número de puertas: " + numPuertas);
	}

	// Sobrescribe mover para dar un mensaje específico del coche
	@Override
	public void mover() {
		System.out.println("El coche está en movimiento");
	}
}
