package ejercicio_17;

import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número entero: ");
        int num1 = sc.nextInt();

        System.out.print("Introduce el segundo número entero: ");
        int num2 = sc.nextInt();

        if (num1 == num2) {
            System.out.println("Los números son iguales.");
        } else {
            System.out.println("Los números no son iguales.");
            if (num1 > num2) {
                System.out.println("El mayor es: " + num1);
            } else {
                System.out.println("El mayor es: " + num2);
            }
        }
    }
}

