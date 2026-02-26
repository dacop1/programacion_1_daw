package ejercicio_11;

import java.util.Scanner;

public class Ejercicio_11 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double num2 = sc.nextDouble();

        double mayor = (num1 > num2) ? num1 : num2;

        System.out.println("El mayor es: " + mayor);

        sc.close();
    }
}

