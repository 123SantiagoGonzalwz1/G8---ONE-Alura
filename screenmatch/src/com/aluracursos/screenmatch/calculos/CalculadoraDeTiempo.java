package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.models.Titulo;

public class CalculadoraDeTiempo {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
