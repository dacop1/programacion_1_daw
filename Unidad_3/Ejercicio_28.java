package ejercicio_28;

import java.util.Scanner;

public class Ejercicio_28 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        long factorial = 1;

        // Calculamos el factorial
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + n + " es: " + factorial);
    }
}

