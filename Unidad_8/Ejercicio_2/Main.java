package EJ2T8;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import EJ1T8.Personas;

public class Main {
	public static void main (String args[]) {
        List personas  = new ArrayList();

        // Añadir elementos
        personas.add(new Personas("Paco"));
        personas.add(new Personas("Maria"));
        personas.add(new Personas("Pino"));

        // copiando la lista persona
        List copia = new LinkedList(personas);
        System.out.println(copia);
        
        List copia2 = new LinkedList();
        
        
        // Primera forma de añadir a las personas con un for each
        for (Object x : personas) {   //  Object x : la variable donde se guarda el elemento actual en cada vuelta
        	copia2.add(x); //  personas : la lista que vas a recorrer
        }
     
        
		//copia2.addAll(personas); // con el metodo addall se añade del 'tirón'
	   //System.out.println(copia2);
		
		
		
		
		Object primero = copia2.get(0);
		Object ultimo = copia2.getLast();
		
		copia2.set(0, ultimo);
		copia2.set(copia2.size()-1, primero);
		
        System.out.println(copia2);

        
        
	}
}
