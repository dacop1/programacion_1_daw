package Ejercicio_5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String NOMBRE = "dani";
		String CONTRASEÑA = "dani";
		
		for (int i = 3; 3 > i; i--) {
			System.out.println("Usuario:");
			String nombre = sc.nextLine();

			System.out.println("Contraseña: ");
			String contraseña = sc.nextLine();

			if (nombre.equals(NOMBRE) && contraseña.equals(CONTRASEÑA)) {
				System.out.println("la contraseña es correcta");
				break;
			}else {
				
				System.out.println("Contraseña Incorrecta");
			}
		
		}
				
	}

}
