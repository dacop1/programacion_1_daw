package Ejercicio_3_repasot8;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
	public static void main (String args[]) {
		
		Map<Integer, String> map1 = new HashMap<>();
		Map<Integer, String> map2 = new LinkedHashMap<>();
		Map<Integer, String> map3 = new TreeMap<>();
		
		map1.put(1, "pino" );
		map1.put(3, "raul" );
		map1.put(5, "ale" );
		map1.put(7, "adri" );
		map1.put(9, "cris" );
		
		
		
		map2.put(1, "pino" );
		map2.put(3, "raul" );
		map2.put(5, "ale" );
		map2.put(7, "adri" );
		map2.put(9, "cris" );
		
		
		
		map3.put(1, "pino" );
		map3.put(3, "raul" );
		map3.put(5, "ale" );
		map3.put(7, "adri" );
		map3.put(9, "cris" );
		
		
		mostrarMapa(map1);
		
		
	}
	
	
	
	public static void mostrarMapa(Map<Integer, String> mapa) {
		// Obtenemos el iterador del entrySet del mapa que recibimos 
		Iterator<Map.Entry<Integer, String>> it = mapa.entrySet().iterator();
		
		while (it.hasNext()){
			Map.Entry<Integer, String> entrada = it.next();
			System.out.println("Clave"+ entrada.getKey()  + "Valor"+ entrada.getValue());
		}
	
	}



}
