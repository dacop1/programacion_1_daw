package ejercicio_12;

import java.util.Scanner;

public class Ejercicio_12 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        double num = sc.nextDouble();

        // 1) Usando Math.abs()
        double absolutoMath = Math.abs(num);

        // 2) Usando operador ternario
        double absolutoTernario = (num < 0) ? -num : num;

        System.out.println("Valor absoluto usando Math.abs(): " + absolutoMath);
        System.out.println("Valor absoluto usando operador ternario: " + absolutoTernario);

        sc.close();
    }
}

