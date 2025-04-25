package com.aluracursos.radiosantiago.models;

public class MyFavorites {
    public void add(Audio audio) {
        if (audio.getRating() >= 8) {
            System.out.println(audio.getTitle() + " Favoritos del momento.");
        } else {
            System.out.println(audio.getTitle() + " Merecen ser escuchados.");
        }
    }
}
