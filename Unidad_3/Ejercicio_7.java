package ejercicio_7;

import java.util.Scanner;

public class Ejercicio_7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();

        boolean mayorDeEdad = edad >= 18;

        System.out.println("¿Es mayor de edad?: " + mayorDeEdad);

        sc.close();
    }
}

