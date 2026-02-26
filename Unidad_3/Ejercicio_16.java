package ejercicio_16;

import java.util.Scanner;

public class Ejercicio_16 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Generar dos números aleatorios entre 0 y 100
        int a = (int) (Math.random() * 101);
        int b = (int) (Math.random() * 101);

        System.out.print("Introduce un número entero: ");
        int num = sc.nextInt();

        // Determinar rango mínimo y máximo para que funcione aunque a > b
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        // Comprobar si el número está en el rango [min, max]
        if (num >= min && num <= max) {
            System.out.println("El número está dentro del rango.");
            System.out.println("Rango: [" + min + ", " + max + "]");
        }

        // Mostrar siempre el número introducido
        System.out.println("Número introducido: " + num);

        sc.close();
    }
}

