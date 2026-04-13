package Ejercicio_4;

import java.util.ArrayList;

public class NotasEjemplo {
    public static void main(String[] args) {

        // Array de entrada con notas en formato String
        String[] notasEntrada = {"7.5", "4.2", "9.0", "3.8", "6.5"};

        // 1. Crear un ArrayList de tipo Double (números decimales)
        ArrayList<Double> notas = new ArrayList<>();

        // Convertir cada String del array a Double y guardarlo en el ArrayList
        for (String d : notasEntrada) {
            notas.add(Double.valueOf(d));
        }

        // Calcular la suma de todas las notas
        double suma = 0;
        for (double n : notas) {
            suma += n;
        }

        // Calcular la media (promedio)
        double media = suma / notas.size();

        // Crear un ArrayList para guardar solo los aprobados (nota >= 5)
        ArrayList<Double> aprobados = new ArrayList<>();

        // Recorrer las notas y añadir solo las que están aprobadas
        for (double n : notas) {
            if (n >= 5) {
                aprobados.add(n);
            }
        }

        // Mostrar todas las notas
        System.out.println(notas);

        // Mostrar la media
        System.out.println(media);

        // Mostrar la lista de aprobados
        System.out.println(aprobados);
    }
}