package ejercicio_9;

import java.util.Scanner;

public class Ejercicio_9 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Está lloviendo? (true/false): ");
        boolean llueve = sc.nextBoolean();

        System.out.print("¿Has terminado las tareas? (true/false): ");
        boolean tareasTerminadas = sc.nextBoolean();

        System.out.print("¿Necesitas ir a la biblioteca? (true/false): ");
        boolean irBiblioteca = sc.nextBoolean();

        // Lógica del permiso
        boolean puedeSalir = (!llueve && tareasTerminadas) || irBiblioteca;

        System.out.println("¿Puedes salir a la calle?: " + puedeSalir);

        sc.close();
    }
}

