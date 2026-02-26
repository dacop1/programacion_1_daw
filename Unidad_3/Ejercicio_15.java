package ejercicio_15;

import java.util.Scanner;

public class Ejercicio_15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número decimal: ");
        double numDecimal = sc.nextDouble();

        // Math.round devuelve long, casteamos a int si quieres entero
        int redondeado = (int) Math.round(numDecimal);

        System.out.println("Número redondeado al entero más próximo: " + redondeado);

        sc.close();
    }
}

