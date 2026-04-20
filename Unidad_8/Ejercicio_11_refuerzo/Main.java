package Ejercicio_11_refuerzo;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // 1. Crear colección que guarde orden de inserción y permita repetidos
        List<Integer> listaPrincipal = new ArrayList<>();
        listaPrincipal.add(10);
        listaPrincipal.add(7);
        listaPrincipal.add(10); // Repetido a propósito
        listaPrincipal.add(3);
        listaPrincipal.add(14);

        System.out.println("Contenido inicial (ArrayList): " + listaPrincipal);

        // 2. Eliminar números impares
        // Usamos removeIf para evitar errores de concurrencia al modificar la lista
        listaPrincipal.removeIf(n -> n % 2 != 0);

        // 3. Añadir al principio el número 8
        listaPrincipal.add(0, 8);

        System.out.println("Tras eliminar impares y añadir el 8: " + listaPrincipal);

        // 4. Nueva colección que descarte repetidos automáticamente (HashSet)
        Set<Integer> sinRepetidos = new HashSet<>(listaPrincipal);
        
        System.out.println("Contenido sin repetidos (HashSet): " + sinRepetidos);

        // 5. Nueva colección con orden natural (TreeSet)
        // La rellenamos con los números de la colección anterior
        Set<Integer> ordenNatural = new TreeSet<>(sinRepetidos);

        System.out.println("Contenido en orden natural (TreeSet): " + ordenNatural);
    }
}
