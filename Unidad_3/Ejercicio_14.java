package ejercicio_14;

import java.util.Scanner;

public class Ejercicio_14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la nota del primer trimestre (entera): ");
        int nota1 = sc.nextInt();

        System.out.print("Introduce la nota del segundo trimestre (entera): ");
        int nota2 = sc.nextInt();

        System.out.print("Introduce la nota del tercer trimestre (entera): ");
        int nota3 = sc.nextInt();

        // Calcular nota media como double para decimales
        double media = (nota1 + nota2 + nota3) / 3.0;

        // Mostrar solo parte entera (casteando a int)
        int mediaEntera = (int) media;

        System.out.println("Nota media (boletín - parte entera): " + mediaEntera);
        System.out.println("Nota media (expediente - con decimales): " + media);

        sc.close();
    }
}

