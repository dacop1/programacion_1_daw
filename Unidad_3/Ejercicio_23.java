package ejercicio_23;

import java.util.Scanner;

public class Ejercicio_23 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Generar números aleatorios a y b (pueden estar en cualquier orden)
        int a = (int) (Math.random() * 100);  // Entre 0 y 99
        int b = (int) (Math.random() * 100);  // Entre 0 y 99

        // Normalizar para que a sea el menor y b el mayor
        int min = Math.min(a, b);
        int max = Math.max(a, b);

        int num;

        do {
            System.out.print("Introduce un número entero: ");
            num = sc.nextInt();

            if (num >= min && num <= max) {
                System.out.println("¡Correcto! El número está dentro del rango [" + min + ", " + max + "].");
            } else {
                System.out.println("Número fuera del rango. Intenta de nuevo.");
            }

        } while (num < min || num > max);

        System.out.println("Número introducido: " + num);
    }
}

