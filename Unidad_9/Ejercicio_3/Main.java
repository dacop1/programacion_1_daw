package Ejercicio_3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduzca tu nombre y pulse intro para finalizar: ");
		String caracteres = sc.next();
		System.out.println("Hola"+ caracteres);
        sc.close();

	}

}
