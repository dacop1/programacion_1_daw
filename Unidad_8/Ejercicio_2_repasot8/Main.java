package Ejercicio_2_repasot8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
	public static void main (String args[]) {
		List<Integer> listaA = new ArrayList<>();
		List<Integer> listaB = new LinkedList<>();
		
		
		for(int i = 0; i<100000; i++) {
			listaA.add(i);
			System.out.println(listaA.get(i));
			
		}
		
		for(int i = 0; i<100000; i++) {
			listaB.add(i);
			System.out.println(listaA.get(i));
			
		}
		
		
		for (Integer num : listaA) { //for each
		    System.out.println(num);
		}
	}
}
