package ejercicio_10;

import java.util.Scanner;

public class Ejercicio_10 {

    public static void main(String[] args) {

        final double PRECIO_MANZANA = 2.35;
        final double PRECIO_PERA = 1.95;

        Scanner sc = new Scanner(System.in);

        // Ventas de manzanas
        System.out.print("Introduce los kilos de manzanas del primer semestre: ");
        double manzanasSem1 = sc.nextDouble();

        System.out.print("Introduce los kilos de manzanas del segundo semestre: ");
        double manzanasSem2 = sc.nextDouble();

        // Ventas de peras
        System.out.print("Introduce los kilos de peras del primer semestre: ");
        double perasSem1 = sc.nextDouble();

        System.out.print("Introduce los kilos de peras del segundo semestre: ");
        double perasSem2 = sc.nextDouble();

        // Cálculos
        double totalManzanas = (manzanasSem1 + manzanasSem2) * PRECIO_MANZANA;
        double totalPeras = (perasSem1 + perasSem2) * PRECIO_PERA;

        double totalAnual = totalManzanas + totalPeras;

        // Resultado
        System.out.println("Beneficio total anual: " + totalAnual + " €");

        sc.close();
    }
}

