/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el año actual: ");
        int añoActual = sc.nextInt();
        
        System.out.print("Introduce tu año de nacimiento: ");
        int añoNacimiento = sc.nextInt();
        
        int edad = añoActual - añoNacimiento;
        
        System.out.println("Tu edad es: " + edad + " años.");
    }
    
}

