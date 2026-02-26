/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

/**
 *
 * @author 06_1DAW_Alum
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        short max = 32767;
        System.out.println("Valor máximo de short: " + max);
        
        short siguiente = (short) (max + 1);
        System.out.println("Valor siguiente al máximo: " + siguiente);
        
        short min = -32768;
        System.out.println("Valor mínimo de short: " + min);
        
        short anterior = (short) (min - 1);
        System.out.println("Valor anterior al mínimo: " + anterior);
    }
}

