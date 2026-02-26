package ejercicio_18;

import java.util.Scanner;

public class Ejercicio_18 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        double num = sc.nextDouble();

        // Usando valor absoluto: casi-cero si |num| < 1 y num != 0
        if (num != 0 && Math.abs(num) < 1) {
            System.out.println(num + " es un número casi-cero.");
        } else {
            System.out.println(num + " NO es un número casi-cero.");
        }
    }
}
