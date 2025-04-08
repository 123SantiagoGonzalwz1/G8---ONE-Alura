package br.com.alura.bytebank.model;

import java.time.LocalDate;

public class Funcionario {
    private String nombre;
    private int matricula;
    private LocalDate fechaNacimiento;

    public Funcionario(String nombre, int matricula, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nombre='" + nombre + '\'' +
                ", matricula=" + matricula +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
}
