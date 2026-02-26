package ejercicio_20;

import java.util.Scanner;

public class Ejercicio_20 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una nota entera de 0 a 10: ");
        int nota = sc.nextInt();

        String calificacion;

        if (nota >= 0 && nota <= 4) {
            calificacion = "Insuficiente";
        } else if (nota == 5) {
            calificacion = "Suficiente";
        } else if (nota == 6) {
            calificacion = "Bien";
        } else if (nota == 7 || nota == 8) {
            calificacion = "Notable";
        } else if (nota == 9 || nota == 10) {
            calificacion = "Sobresaliente";
        } else {
            calificacion = "Nota inválida";
        }

        System.out.println("Calificación: " + calificacion);
    }
}

