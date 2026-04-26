package EJ3T8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main (String args[]) {
		
		//crear la lista
		List<String> nombres = new ArrayList<>();
		//Añadir con el método add
		nombres.add("pepe");
		nombres.add("pepe2");
		nombres.add("pepe3");
		nombres.add("pepe4");
		nombres.add("pepe5");
		
		// for each 
		for (String x :nombres) {
			System.out.println(x);
		}
		
		
		//for (int i = 0; i < nombres.size(); i++) { for normal
		  //  System.out.println(nombres.get(i));
		//}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el nuevo nombre:");
		 String pedirnombre = sc.nextLine();
		 nombres.add(pedirnombre);
		 System.out.println(nombres);
		
		 
		 
		 System.out.println("Introduce el  nombre a eliminar:");
		 
		 
		 String nombreban = sc.nextLine();
		 if (nombres.contains(nombreban)){
			 nombres.remove(nombreban);
		 }else{System.out.println("No existe el nombre");}
	
		System.out.println( nombres.size());	 // El método .size te devuelve el número total de objetos de la lista
	}

}
