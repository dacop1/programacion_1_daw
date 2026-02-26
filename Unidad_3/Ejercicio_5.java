package ejercicio_5;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la primera nota (entera): ");
        int nota1 = sc.nextInt();

        System.out.print("Introduce la segunda nota (entera): ");
        int nota2 = sc.nextInt();

        double media = (nota1 + nota2) / 2.0;

        System.out.println("La media es: " + media);

        // sc.close();  // No es necesario si no lo habéis dado aún
    }
}

