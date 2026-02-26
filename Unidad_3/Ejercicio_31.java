package Ejercicio_31;

import java.util.Scanner;

public class Ejercicio_31 {

    public static void variosSaludos(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Hola");
        }
    }

    public static void main(String[] args) {

        // 1. Llamada con 3
        variosSaludos(3);

        // 2. Llamada con un número leído por teclado
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        variosSaludos(n);

        // 3. Llamada con el doble
        variosSaludos(n * 2);

    }
}
