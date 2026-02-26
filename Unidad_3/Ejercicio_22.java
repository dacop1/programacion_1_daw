package ejercicio_22;

import java.util.Scanner;

public class Ejercicio_22 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;

        do {
            System.out.print("Introduce un número (0 para salir): ");
            num = sc.nextInt();

            if (num != 0) {
                // Comprobar si es par
                boolean esPar = (num % 2 == 0);
                // Comprobar si es positivo
                boolean esPositivo = (num > 0);
                // Calcular cuadrado
                int cuadrado = num * num;

                System.out.println("Número: " + num);
                System.out.println("Es par: " + esPar);
                System.out.println("Es positivo: " + esPositivo);
                System.out.println("Su cuadrado: " + cuadrado);
                System.out.println(); // línea en blanco para separar iteraciones
            }

        } while (num != 0);

        System.out.println("Programa terminado.");
    }
}

