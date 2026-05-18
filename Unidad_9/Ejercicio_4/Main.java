package Ejercicio_4;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		byte[] palabra = new byte[5];
		System.in.read(palabra);
		System.out.println(new String(palabra));
		
		
		/*
		 * ¿Qué hace este código? El programa crea un "cajón" llamado palabra con
		 * capacidad exacta para 5 bytes (5 huecos en memoria). Por ahora está vacío,
		 * esperando datos. Cuando llega a System.in.read(palabra), el programa se
		 * detiene y espera a que el usuario escriba algo por teclado. Al pulsar Enter,
		 * coge los primeros 5 bytes de lo que se haya escrito y los mete dentro del
		 * cajón. Si el usuario escribe más de 5 caracteres, los ignora. Si escribe
		 * menos, los huecos que sobran se quedan a cero. Finalmente, new
		 * String(palabra) convierte esos 5 bytes en texto legible y println lo muestra
		 * por pantalla.
		 */
	}

}
