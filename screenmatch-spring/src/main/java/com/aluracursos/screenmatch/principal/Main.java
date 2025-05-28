package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.model.DatosEpisodio;
import com.aluracursos.screenmatch.model.DatosSerie;
import com.aluracursos.screenmatch.model.DatosTemporada;
import com.aluracursos.screenmatch.model.Episodio;
import com.aluracursos.screenmatch.service.ConsumoAPI;
import com.aluracursos.screenmatch.service.ConvierteDatos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    private Scanner teclado = new Scanner(System.in);
    private ConsumoAPI consumoAPI = new ConsumoAPI();
    private ConvierteDatos convierteDatos = new ConvierteDatos();

    private final String URL_BASE = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=dc2c4dc8";

    public void muestraMenu() {
        System.out.println("Por favor, ingresa el nombre de la serie que quieres buscar: ");
        var nombreSerie = teclado.nextLine();
        var json = consumoAPI.obtenerDatos(URL_BASE + nombreSerie.replace(" ", "+") + API_KEY);
        var datos = convierteDatos.obtenerDatos(json, DatosSerie.class);
        System.out.println(datos);

        List<DatosTemporada> temporadas = new ArrayList<>();

        for (int i = 1; i <= datos.totalDeTemporadas(); i++) {
            json = consumoAPI.obtenerDatos(URL_BASE + nombreSerie.replace(" ", "+") + "&Season=" + i + API_KEY);
            var datosTemporadas = convierteDatos.obtenerDatos(json, DatosTemporada.class);
            temporadas.add(datosTemporadas);
        }

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        List<DatosEpisodio> datosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());

        System.out.println("Top 5 episodios");
        datosEpisodios.stream()
                .filter(e -> !e.evaluacion().equalsIgnoreCase("N/A"))
                //.peek(e -> System.out.println("Primer filtro (N/A)" + e)) // Una ojeada a la lógica de Java
                .sorted(Comparator.comparing(DatosEpisodio::evaluacion).reversed())
                /*.peek(e -> System.out.println("Segundo filtro (M>m)" + e))
                .map(e -> e.titulo().toUpperCase())
                .peek(e -> System.out.println("Tercer filtro (m>M)" + e))*/
                .limit(5)
                .forEach(System.out::println);

        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                        .map(d -> new Episodio(t.numero(), d)))
                .collect(Collectors.toList());

        episodios.forEach(System.out::println);

        System.out.println("Por favor, indica el año a partir del cual deaseas ver los episodios: ");
        var fecha = teclado.nextInt();
        teclado.nextLine();

        LocalDate fechaBusqueda = LocalDate.of(fecha, 1, 1);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        episodios.stream()
                .filter(e -> e.getFechaDeLanzamiento() != null && e.getFechaDeLanzamiento().isAfter(fechaBusqueda))
                .forEach(e -> System.out.println(
                        "Temporada " + e.getTemporada() +
                                "Episodio " + e.getTitulo() +
                                "Fecha de lanzamiento " + e.getFechaDeLanzamiento().format(dtf)
                ));

        // Busqueda de episodios por un pedazo de titulo
        System.out.println("Por favor, ingresa el titulo del episodio que deseas ver: ");
        var pedazoTitulo = teclado.nextLine();
        Optional<Episodio> episodioBuscado = episodios.stream()
                .filter(e -> e.getTitulo().toUpperCase().contains(pedazoTitulo.toUpperCase()))
                .findFirst();

        if (episodioBuscado.isPresent()) {
            System.out.println("Episodio encontrado.");
            System.out.println("Los datos son: " + episodioBuscado.get());
        } else {
            System.out.println("Episodio no encontrado.");
        }

        // Evaluaciones por temporada
        Map<Integer, Double> evaluacionesPorTemporada = episodios.stream()
                .filter(e -> e.getEvalaucion() > 0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                        Collectors.averagingDouble(Episodio::getEvalaucion)));

        System.out.println(evaluacionesPorTemporada);
    }
}
