package Ejercicio_12_refuerzo;

import java.util.*;

public class Jardin {
    public static void main(String[] args) {
        // Colección inicial (permite duplicados)
        List<Arbol> listaArboles = new ArrayList<>();
        
        listaArboles.add(new Arbol("Álamo", 4));
        listaArboles.add(new Arbol("Olivo", 3));
        listaArboles.add(new Arbol("Olivo", 4));
        listaArboles.add(new Arbol("Higuera", 2));
        listaArboles.add(new Arbol("Naranjo", 2));
        listaArboles.add(new Arbol("Naranjo", 2));
        listaArboles.add(new Arbol("Naranjo", 2));

        System.out.println("Total elementos (ArrayList): " + listaArboles.size());

        // Filtrar repetidos (HashSet usa el equals de especie)
        Set<Arbol> sinRepetidos = new HashSet<>(listaArboles);
        System.out.println("Diferentes especies (4 esperados): " + sinRepetidos.size());
        System.out.println(sinRepetidos);

        // Ordenar alfabéticamente (TreeSet usa el compareTo)
        Set<Arbol> ordenados = new TreeSet<>(sinRepetidos);
        System.out.println("Orden alfabético: " + ordenados);
    }
}