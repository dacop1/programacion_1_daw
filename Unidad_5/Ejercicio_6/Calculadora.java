package Ejercicio_6; // Indica el paquete al que pertenece esta clase

// Declaración de la clase Calculadora
public class Calculadora {
	
	 // Método estático que recibe dos números enteros y devuelve su suma
	 public static int sumar(int a, int b) {
	        return a + b; // Devuelve el resultado de sumar a y b
	    }

	 // Método estático que recibe dos números enteros y devuelve su resta
	    public static int restar(int a, int b) {
	        return a - b; // Devuelve el resultado de restar b a a
	    }

	 // Método estático que recibe dos números enteros y devuelve su multiplicación
	    public static int multiplicar(int a, int b) {
	        return a * b; // Devuelve el resultado de multiplicar a por b
	    }

	 // Método estático que recibe dos números enteros y devuelve su división
	    public static double dividir(int a, int b) {
	        return (double) a / b; // Convierte 'a' a double para que la división devuelva un número decimal
	    }

}