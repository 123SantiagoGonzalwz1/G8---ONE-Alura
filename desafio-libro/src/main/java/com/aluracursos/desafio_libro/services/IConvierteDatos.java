package com.aluracursos.desafio_libro.services;

public interface IConvierteDatos {
    <T> T obtenerDatos(String json, Class<T> clase);
}
