package Ejercicio_13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
	public static void main (String args[]) {
		
		// Creación del mapa
		Map<String, Integer> InventarioFruteria = new HashMap<>();
		
		
		//Añadiendo frutas
		InventarioFruteria.put("Manzanas", 69);
		InventarioFruteria.put("Kiwi", 67);
		InventarioFruteria.put("Naranjas", 88);
		InventarioFruteria.put("Mango", 1);
		
		
		//Accediendo desde su clave
		System.out.println(InventarioFruteria.get("Manzanas"));
		
		//Añadiendo más manzanas
		InventarioFruteria.put("Manzanas", 100);
		
		
		//Comprobar si existe mango
		if (InventarioFruteria.containsKey("Mangos")) {
			System.out.println(InventarioFruteria.get("Mangos"));
		}else {System.out.println("No tenemos esa fruta de momento");}
		
		
		
		//Recorrido for each
		Set<String>claves = InventarioFruteria.keySet();
		for (String k : claves ) {
			System.out.println(InventarioFruteria.get(k));
		}
		
		
		Iterator<String> it = InventarioFruteria.keySet().iterator();
		while (it.hasNext()) {
		    String clave = it.next();
		    System.out.println(clave + ": " + InventarioFruteria.get(clave));
		}
		
		//1.Después de actualizar el número de "Manzanas",
		//¿aparecen dos entradas diferentes o se ha sobrescrito la anterior?
		//¿Por qué crees que ocurre esto?
		//1. Se ha sobrescrito el anterior, porque no permite que en una misma clave tenga dos  valores iguales
		
		
		//2.¿Qué pasaría si intentas usar un número entero (int) como clave en lugar de un String?
		//No permite valores primitivos solo objetos
		
		
		//3.¿Por qué es más eficiente usar un Map que una ArrayList para este caso específico de un inventario?
		//Porque puedes asignar el nombre que tu quieras a la clave
		// Además de que accedes  directamente  al objeto
		
	}
}
