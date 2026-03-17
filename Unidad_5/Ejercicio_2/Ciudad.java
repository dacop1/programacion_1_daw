package Ejercicio_2;

public class Ciudad {

	public static void main(String[] args) {

		// Crear objeto Persona
		Persona daniel = new Persona();

		// Usar setters
		daniel.setNombre("Daniel");
		daniel.setEdad(20);
		daniel.setEstatura(1.80);

		// Modificar nombre desde Ciudad
		daniel.setNombre("Carlos");

		// Mostrar datos
		System.out.println("Nombre: " + daniel.getNombre());
		System.out.println("Edad: " + daniel.getEdad());
		System.out.println("Estatura: " + daniel.getEstatura());

	}
}