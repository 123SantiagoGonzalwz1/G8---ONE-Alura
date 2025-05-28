package com.aluracursos.desafio_libro.principal;

import com.aluracursos.desafio_libro.model.Datos;
import com.aluracursos.desafio_libro.model.DatosLibros;
import com.aluracursos.desafio_libro.services.ConsumoAPI;
import com.aluracursos.desafio_libro.services.ConvierteDatos;

import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    private static final String URL_BASE = "https://gutendex.com/books/";
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos conversor = new ConvierteDatos();
    private Scanner teclado = new Scanner(System.in);

    public void muestraMenu() {
        var json = consumoAPI.obtenerDatos(URL_BASE);
        System.out.println(json);

        var datos = conversor.obtenerDatos(json, Datos.class);
        System.out.println(datos);

        // Top 10 libros más descargados
        System.out.println("Top 10 libros más descargados");
        datos.libros().stream()
                .sorted(Comparator.comparing(DatosLibros::numeroDeDescargas).reversed())
                .limit(10)
                .map(l -> l.titulo().toUpperCase())
                .forEach(System.out::println);

        // Busqueda de libros por nombre
        System.out.println("Por favor, ingrese el nombre del libro que desea buscar: ");
        var tituloLibro = teclado.nextLine();
        json = consumoAPI.obtenerDatos(URL_BASE + "?search=" + tituloLibro.replace(" ", "+"));
        var datosBusqueda = conversor.obtenerDatos(json, Datos.class);

        Optional<DatosLibros> libroBuscado = datosBusqueda.libros().stream()
                .filter(l -> l.titulo().toUpperCase().contains(tituloLibro.toUpperCase()))
                .findFirst();

        if (libroBuscado.isPresent()) {
            System.out.println("Libro encontrado.");
            System.out.println(libroBuscado.get());
        } else {
            System.out.println("Libro no encontrado.");
        }

        // Trabajando con estadísticas
        DoubleSummaryStatistics est = datos.libros().stream()
                .filter(d -> d.numeroDeDescargas() > 0.0)
                .collect(Collectors.summarizingDouble(DatosLibros::numeroDeDescargas));

        System.out.println("Cantidad media de descargas: " + est.getAverage());
        System.out.println("Cantidad máxima de descargas: " + est.getMax());
        System.out.println("Cantidad mínima de descargas: " + est.getMin());
        System.out.println("Cantidad de registros evaluados para calcular las estadísticas: " + est.getCount());
    }
}
