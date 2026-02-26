package ejercicio_13;

public class Ejercicio_13 {

    public static void main(String[] args) {

        // Expresión 1: 10 + 5 * 2 > 20 && 4 == 4
        // Precedencia: * antes de +, luego >, ==, && 
        boolean exp1 = 10 + 5 * 2 > 20 && 4 == 4;
        // 5*2=10, 10+10=20, 20>20 -> false, 4==4 -> true, false && true -> false

        // Expresión 2: !(7 + 3 > 10) || 3 * 2 <= 6
        // Paréntesis, luego !, *, >, <=, || 
        boolean exp2 = !((7 + 3) > 10) || 3 * 2 <= 6;
        // 7+3=10, 10>10 -> false, !false -> true, 3*2=6, 6<=6 -> true, true || true -> true

        // Expresión 3: 10 / 2 + 3 * 5 == 19 && true
        // División y multiplicación antes que suma, luego ==, &&
        boolean exp3 = 10 / 2 + 3 * 5 == 19 && true;
        // 10/2=5, 3*5=15, 5+15=20, 20==19 -> false, false && true -> false

        // Expresión 4:
        int x = 5;
        x += 3 * 2;  // 3*2=6; x=5+6=11

        // Expresión 5:
        boolean b = false;
        b = !b || 7 % 2 == 1;
        // !false -> true; 7%2=1; 1==1 -> true; true || true -> true

        System.out.println("Expresión 1: " + exp1);  // false
        System.out.println("Expresión 2: " + exp2);  // true
        System.out.println("Expresión 3: " + exp3);  // false
        System.out.println("Valor de x (expresión 4): " + x); // 11
        System.out.println("Valor de b (expresión 5): " + b); // true
    }
}
