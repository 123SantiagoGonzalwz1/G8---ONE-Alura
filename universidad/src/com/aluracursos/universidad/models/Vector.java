package com.aluracursos.universidad.models;

import java.util.Arrays;

public class Vector {
    private Estudiante[] estudiantes = new Estudiante[100];
    private int totalDeEstudiantes = 0;

    public void adicionar(Estudiante estudiante) {
        this.guardarEspacio();;
        this.estudiantes[totalDeEstudiantes] = estudiante;
        totalDeEstudiantes++;
    }

    public void adiciona(int posicion, Estudiante estudiante) {
        this.guardarEspacio();
        if (!posicionValida(posicion)) {
            throw new IllegalArgumentException("¡Posición invalida!");
        }

        for (int i = totalDeEstudiantes - 1; i >= posicion; i-=1) {
            estudiantes[i+1] = estudiantes[i];
        }
        estudiantes[posicion] = estudiante;
        totalDeEstudiantes++;
    }
    
    public Estudiante obtener(int posicion) {
        if (!posicionOcupada(posicion)) {
            throw new IllegalArgumentException("¡Posicion Invalida!");
        }

        return estudiantes[posicion];
    }

    private boolean posicionOcupada(int posicion) {
        return posicion >= 0 && posicion < totalDeEstudiantes;
    }

    private boolean posicionValida(int posicion) {
        return posicion >= 0 && posicion <= totalDeEstudiantes;
    }

    public void remover(int posicion) {
        for (int i = posicion; i < this.totalDeEstudiantes; i++) {
            this.estudiantes[i] = this.estudiantes[i+1];
        }
        totalDeEstudiantes--;
    }

    public boolean contiene(Estudiante estudiante) {
        for (int i = 0; i < totalDeEstudiantes; i++) {
            if (estudiante.equals(estudiantes[i])) {
                return true;
            }
        }
        return false;
    }

    public int tamano() {
        return totalDeEstudiantes;
    }

    public String toString() {
        return Arrays.toString(estudiantes);
    }

    private void guardarEspacio() {
        if (totalDeEstudiantes == estudiantes.length) {
            Estudiante[] nuevoArray = new Estudiante[estudiantes.length*2];

            for (int i = 0; i < estudiantes.length; i++) {
                nuevoArray[i] = estudiantes[i];
            }
            this.estudiantes = nuevoArray;
        }
    }
}
