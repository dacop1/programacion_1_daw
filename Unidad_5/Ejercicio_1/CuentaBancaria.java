package Ejercicio_1;

public class CuentaBancaria {

	private String titular; // Nombre del titular de la cuenta
	private int saldo; // Dinero disponible en la cuenta

	public String getTitular() { // Devuelve el titular
		return titular;
	}

	public int getSaldo() { // Devuelve el saldo
		return saldo;
	}

	public void setSaldo(int saldo) { 
		if (saldo >= 0) // Solo permite saldo positivo
			this.saldo = saldo;
	}

	public void setTitular(String titular) { // Cambia el titular
		this.titular = titular;
	}
}
