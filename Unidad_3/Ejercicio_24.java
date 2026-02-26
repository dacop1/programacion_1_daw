package ejercicio_24;

import java.util.Scanner;

public class Ejercicio_24 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int edad;
        int edadMin = Integer.MAX_VALUE;  // Inicializamos con el máximo valor posible
        int edadMax = Integer.MIN_VALUE;  // Inicializamos con el mínimo valor posible

        System.out.println("Introduce las edades de los alumnos (termina con -1):");

        while (true) {
            edad = sc.nextInt();

            if (edad == -1) {
                break;  // Salir del bucle si se introduce -1
            }

            // Actualizar mínimo y máximo
            if (edad < edadMin) {
                edadMin = edad;
            }

            if (edad > edadMax) {
                edadMax = edad;
            }
        }

        // Comprobar si se introdujo alguna edad válida
        if (edadMin == Integer.MAX_VALUE || edadMax == Integer.MIN_VALUE) {
            System.out.println("No se introdujeron edades válidas.");
        } else {
            System.out.println("Edad mínima: " + edadMin);
            System.out.println("Edad máxima: " + edadMax);
        }
    }
}

