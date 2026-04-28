package Ejercicio_1_repasot8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main (String args[]) {
		Set<Libro> listaA = new HashSet<>();
		Set<Libro> listaB = new LinkedHashSet<>();
		Set<Libro> listaC = new TreeSet<>();
		
		Libro a = new Libro();
		Libro b = new Libro();
		Libro c = new Libro();
		Libro d = new Libro();
		Libro e = new Libro();
		Libro f = new Libro();
		
		
		
		a.setAutor("bumstead");
		a.setIsbn(2);
		
		
		listaA.add(a);
		listaA.add(b);
		listaA.add(c);
		
		
		listaB.add(d);
		listaB.add(f);
		listaC.add(e);
		
		
		//Pregunta: Describe las diferencias que observas en el orden de los elementos 
		// la gestión de duplicados en cada tipo de Set.
		
		//Respuesta: 
		//HashSet no mantiene ningún orden específico de los elementos.
		//Al imprimirlos, los libros pueden aparecer en un orden diferente al que fueron insertados, ya que internamente utiliza una tabla hash para almacenarlos. 
		//En cuanto a los duplicados, no permite elementos repetidos: 
		//si dos objetos se consideran iguales, el segundo no se añade.
		//
		//
		//LinkedHashSet mantiene el orden de inserción de los elementos. Esto significa que los libros se 
		//muestran en el mismo orden en el que fueron añadidos al conjunto. Al igual que
		//HashSet, tampoco permite duplicados, por lo que los elementos repetidos no se almacenan.
		//
		//
		//
		//TreeSet almacena los elementos de forma ordenada automáticamente según el criterio definido en el método compareTo
		//En este ejercicio, los libros se ordenan por ISBN, por lo que aparecen ordenados de menor a mayor ISBN
		//independientemente del orden en que se insertaron. Además, TreeSet no permite duplicados
		//si al comparar dos objetos el método compareTo devuelve 0, el segundo elemento se considera repetido y no se añade al conjunto.
		//
		//
		//
		//
		
		
	}
}
