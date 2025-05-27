package com.aluracursos.screenmatch.principal;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    public void muestraMenu() {
        List<String> nombres = Arrays.asList("Santiago", "Aleyda", "Oscar", "Daniela", "Choco");
        nombres.stream()
                .sorted()
                .filter(n -> n.startsWith("C"))
                .map(String::toUpperCase)
                .limit(3)
                .forEach(System.out::println);
    }
}
