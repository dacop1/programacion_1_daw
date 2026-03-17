package Ejercicio_1;

public class Main {

	public static void main(String[] args) {
		
		CuentaBancaria cuenta1 = new CuentaBancaria(); // Crear objeto
		
		cuenta1.setTitular("Juan"); // Asignar titular
		cuenta1.setSaldo(1000); // Asignar saldo
		
		System.out.println("Titular: " + cuenta1.getTitular()); // Mostrar titular
		System.out.println("Saldo: " + cuenta1.getSaldo()); // Mostrar saldo
	}
}
