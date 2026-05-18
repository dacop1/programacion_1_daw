package Ejercicio_2;

import java.io.FileWriter;
import java.io.IOException;

public class ExperimentoFlush {
	public static void main(String[] args) throws IOException, InterruptedException {
		// Creamos el escritor hacia un archivo
        FileWriter escritor = new FileWriter("prueba.txt");
        
        // Escribimos algo
        escritor.write("¿Donde está mi texto?");
        
        System.out.println("He escrito en el archivo... ¿o no?");
        
        // El programa se queda esperando aquí para que no termine
        Thread.sleep(3000); // Espera 3 segundos
        
        // No hemos puesto ni flush() ni close()
        escritor.close();
        
		/*
		 * ¿Qué está pasando en el código? Primero, el programa crea un escritor
		 * (FileWriter) apuntando al archivo prueba.txt. En este momento el archivo se
		 * crea (o se vacía si ya existía), pero aún no tiene nada dentro. Luego,
		 * escritor.write("¿Donde está mi texto?") intenta escribir el texto, pero no lo
		 * manda directamente al archivo. Lo deja guardado en el búfer, que es una zona
		 * de memoria temporal. El archivo sigue vacío. Después, el programa imprime por
		 * pantalla "He escrito en el archivo... ¿o no?" y se queda dormido 3 segundos
		 * con Thread.sleep(3000). Si abrieras el archivo en este momento, estaría vacío
		 * porque el búfer todavía no se ha vaciado. Cuando pasan los 3 segundos, el
		 * programa llega a escritor.close(). Aquí pasan dos cosas a la vez: primero
		 * vacía el búfer (manda el texto al archivo de verdad) y luego cierra la
		 * conexión con el archivo. En este momento es cuando el texto aparece por fin
		 * en prueba.txt.
		 */
        
    }
}
