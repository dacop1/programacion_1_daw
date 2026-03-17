package Ejercicio_7;

// Clase derivada de Vehiculo que representa una motocicleta
public class Motocicleta extends Vehiculo {

	private boolean tieneSidecar; // Indica si tiene sidecar

	// Constructor que inicializa los atributos de Motocicleta y Vehiculo
	public Motocicleta(String marca, String modelo, int anio, boolean tieneSidecar) {
		super(marca, modelo, anio);
		this.tieneSidecar = tieneSidecar;
	}

	// Sobrescribe mostrarDetalles para incluir si tiene sidecar
	@Override
	public void mostrarDetalles() {
		super.mostrarDetalles();
		System.out.println("Tiene sidecar: " + (tieneSidecar ? "Sí" : "No"));
	}

	// Sobrescribe mover para dar un mensaje específico de la motocicleta
	@Override
	public void mover() {
		System.out.println("La motocicleta está en movimiento");
	}
}