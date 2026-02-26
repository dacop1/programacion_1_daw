package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = sc.nextInt();

        System.out.println("El número es: " + numero);

        sc.close();
    }
}

