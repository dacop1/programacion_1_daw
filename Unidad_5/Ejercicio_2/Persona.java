package Ejercicio_2;

public class Persona {
	
	private String nombre;
	private int edad;
	private double estatura;
	
	
	
	
	public String getNombre() { // Getter nombre
		return nombre;
	}
	public void setNombre(String nombre) { // Setter nombre
		this.nombre = nombre;
	}
	public int getEdad() { // Getter edad 
		return edad;
	}
	public void setEdad(int edad) { 
		if(edad >= 0 && edad <= 120) // Validación y  Setter edad 
			this.edad = edad;
	}
	public double getEstatura() { // Getter estatura
		return estatura;
	}
	
	// Setter estatura
	public void setEstatura(double estatura) { // Validación
		this.estatura = estatura;
	}
	
	

}
