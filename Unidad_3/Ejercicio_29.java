package ejercicio_29;

public class Ejercicio_29 {

    public static void main(String[] args) {

        // Bucle exterior: recorre las tablas del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i + ":");

            // Bucle interior: multiplica desde 1 hasta 10
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }

            System.out.println(); // Línea en blanco para separar tablas
        }
    }
}

