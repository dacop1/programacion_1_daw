package ejercicio_26;

import java.util.Scanner;

public class Ejercicio_26 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int veces = sc.nextInt();

        for (int i = 0; i < veces; i++) {
            System.out.println("Eco...");
        }
    }
}

