package ejercicio_6;

import java.util.Scanner;

public class Ejercicio_6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el radio de la circunferencia: ");
        double radio = sc.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("Longitud de la circunferencia: " + longitud);
        System.out.println("Área de la circunferencia: " + area);

        sc.close();
    }
}
