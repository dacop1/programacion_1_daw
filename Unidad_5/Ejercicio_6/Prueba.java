package Ejercicio_6;

public class Prueba {
	
    public static void main(String[] args) {
        
        // Llamamos a los métodos de la clase Calculadora
        int suma = Calculadora.sumar(10, 5);
        int resta = Calculadora.restar(10, 5);
        int multiplicacion = Calculadora.multiplicar(10, 5);
        double division = Calculadora.dividir(10, 5);

        // Mostramos los resultados por pantalla
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
    }

}
