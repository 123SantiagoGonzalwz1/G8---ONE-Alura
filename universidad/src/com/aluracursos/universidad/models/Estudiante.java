package com.aluracursos.universidad.models;

public class Estudiante {
    private String nombre;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object obj) {
        Estudiante otroEstudiante = (Estudiante) obj;
        return otroEstudiante.getNombre().equals(this.nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
