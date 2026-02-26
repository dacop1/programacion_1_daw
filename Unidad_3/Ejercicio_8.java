package ejercicio_8;

public class Ejercicio_8 {

    public static void main(String[] args) {

        boolean exp1 = 3 <= 5 && 2 == 2;
        boolean exp2 = 3 <= 5 && 2 > 10;
        boolean exp3 = 1 != 2 || 5 < 3;
        boolean exp4 = !(1 < 2);

        System.out.println("3 <= 5 && 2 == 2 → " + exp1);
        System.out.println("3 <= 5 && 2 > 10 → " + exp2);
        System.out.println("1 != 2 || 5 < 3 → " + exp3);
        System.out.println("!(1 < 2) → " + exp4);
    }
}

