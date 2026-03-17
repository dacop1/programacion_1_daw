package Ejercicio_7;

public class Main {

	public static void main(String[] args) {

		// Crear un objeto Coche
		Coche miCoche = new Coche("Toyota", "Corolla", 2022, 4);
		miCoche.mostrarDetalles(); // Mostrar detalles del coche
		miCoche.mover();           // Mostrar mensaje de movimiento
		System.out.println();

		// Crear un objeto Motocicleta
		Motocicleta miMoto = new Motocicleta("Harley", "Sportster", 2021, true);
		miMoto.mostrarDetalles();  // Mostrar detalles de la moto
		miMoto.mover();            // Mostrar mensaje de movimiento
		System.out.println();

		// Crear un objeto Camión
		Camion miCamion = new Camion("Volvo", "FH", 2020, 18);
		miCamion.mostrarDetalles(); // Mostrar detalles del camión
		miCamion.mover();           // Mostrar mensaje de movimiento
	}
}