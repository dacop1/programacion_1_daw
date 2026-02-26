package ejercicio_30;

import java.util.Scanner;

public class Ejercicio_30 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int n = sc.nextInt();

        // Bucle que controla las filas
        for (int i = n; i >= 1; i--) {

            // Bucle que imprime los asteriscos de cada fila
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }

            System.out.println(); // Salto de línea
        }
    }
}

