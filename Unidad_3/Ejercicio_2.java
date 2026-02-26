/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_2;

import java.util.Scanner;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduzca su edad: ");
        int edad = sc.nextInt();
        
        int edadSiguiente = edad + 1;
        
        System.out.println("El año que viene tendrá " + edadSiguiente + " años.");
    }
    
}

