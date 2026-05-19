package Ejercicio_8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;

public class Main {
	public static void main(String[] args) throws Exception{
		String ruta = "fichero.txt";
		
		FileWriter fw = new FileWriter(ruta, true);
		fw.write("Esta linea se añadio desde java");
		fw.close();
		
		
        // Leer y mostrar
        BufferedReader br = new BufferedReader(new FileReader(ruta));
        String linea;
        while ((linea = br.readLine()) != null) {
            System.out.println(linea);
        }
        br.close();
	}
	
}
