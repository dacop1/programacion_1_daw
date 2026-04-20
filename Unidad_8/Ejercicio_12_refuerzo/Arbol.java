package Ejercicio_12_refuerzo;

import java.util.Objects;

public class Arbol implements Comparable<Arbol> {
    private String especie;
    private int altura;

    // Constructores
    public Arbol() {}

    public Arbol(String especie, int altura) {
        this.especie = especie;
        this.altura = altura;
    }

    // Getters y Setters
    public String getEspecie() { return especie; }
    public void setEspecie(String especie) { this.especie = especie; }
    public int getAltura() { return altura; }
    public void setAltura(int altura) { this.altura = altura; }

    // toString
    @Override
    public String toString() {
        return "Arbol [especie=" + especie + ", altura=" + altura + "m]";
    }

    // Criterio de igualdad: Solo especie
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arbol arbol = (Arbol) o;
        return Objects.equals(especie, arbol.especie);
    }

    @Override
    public int hashCode() {
        return Objects.hash(especie);
    }

    // Para la colección ordenada (alfabéticamente por especie)
    @Override
    public int compareTo(Arbol otro) {
        return this.especie.compareTo(otro.especie);
    }
}