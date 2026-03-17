package Ejercicio_4;

public class ContadorObjetos {
	
	static int totalObjetos = 0;// Atributo estático que cuenta los objetos

	// Constructor
		public ContadorObjetos() {
			totalObjetos++; // Se incrementa cada vez que se crea un objeto
		}
		
		// Método estático para mostrar el total
		public static void mostrarTotalObjetos() {
			System.out.println("Total de objetos creados: " + totalObjetos);
		}
}
