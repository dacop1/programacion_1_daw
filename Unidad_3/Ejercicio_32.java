package ejercicio_32;

import java.util.Scanner;

public class Ejercicio_32 {

    // Función que devuelve el máximo entre dos números enteros
    public static int maximo(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int n2 = sc.nextInt();

        // Llamada a la función y mostrar resultado
        int mayor = maximo(n1, n2);
        System.out.println("El número mayor es: " + mayor);

        sc.close();
    }
}

