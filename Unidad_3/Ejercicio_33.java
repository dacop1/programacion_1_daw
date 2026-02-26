package ejercicio_33;

import java.util.Scanner;

public class Ejercicio_33 {

    // Función que devuelve el máximo entre dos números enteros
    public static int maximo(int a, int b) {
            if (a > b) {
                       return a;
            } else {
                    return b;
            }

    }

    // Función  que devuelve el máximo entre tres números enteros
    public static int maximo(int a, int b, int c) {
        // Primero obtenemos el máximo de los dos primeros
        int maxAB = maximo(a, b);
        // Luego comparamos ese resultado con el tercero
        return maximo(maxAB, c);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int n1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int n2 = sc.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int n3 = sc.nextInt();

        int mayor = maximo(n1, n2, n3);
        System.out.println("El número mayor es: " + mayor);

        sc.close();
    }
}

