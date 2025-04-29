package com.aluracursos.screenmatch.models;

import com.aluracursos.screenmatch.calculos.Clasificacion;

public class FiltroRecomendacion {
    public void filtrar(Clasificacion clasificacion) {
        if (clasificacion.getClasificacion() >= 4) {
            System.out.println("Muy buen evaluada por el momento.");
        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Popular en el momento.");
        } else {
            System.out.println("Vale la pena darle una oportunidad.");
        }
    }
}
