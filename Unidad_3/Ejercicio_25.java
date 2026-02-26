package ejercicio_25;

import java.util.Scanner;

public class Ejercicio_25 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aciertos = 0;

        while (true) {
            int num1 = (int)(Math.random() * 100) + 1; // Entre 1 y 100
            int num2 = (int)(Math.random() * 100) + 1;

            int resultadoCorrecto = num1 + num2;

            System.out.print("¿Cuánto es " + num1 + " + " + num2 + "? ");
            int respuesta = sc.nextInt();

            if (respuesta == resultadoCorrecto) {
                aciertos++;
                System.out.println("¡Correcto! Llevas " + aciertos + " aciertos.\n");
            } else {
                System.out.println("Respuesta incorrecta. El resultado correcto era " + resultadoCorrecto + ".");
                System.out.println("Has realizado " + aciertos + " operaciones correctamente.");
                break; // Termina el juego
            }
        }
    }
}

