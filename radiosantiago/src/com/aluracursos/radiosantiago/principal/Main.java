package com.aluracursos.radiosantiago.principal;

import com.aluracursos.radiosantiago.models.MyFavorites;
import com.aluracursos.radiosantiago.models.Podcast;
import com.aluracursos.radiosantiago.models.Song;

public class Main {
    public static void main(String[] args) {
        Song mySong = new Song();
        mySong.setTitle("Niña Bonita");
        mySong.setSinger("Binomio de Oro");

        Podcast myPodcast = new Podcast();
        myPodcast.setCompere("Oscar Flores");
        myPodcast.setTitle("Salsas viejitas, pero bonitas.");

        for (int i = 0; i < 100; i++) {
            mySong.ILike();
        }

        for (int i = 0; i < 5000; i++) {
            mySong.reproduce();
        }

        for (int i = 0; i < 300; i++) {
            myPodcast.ILike();
        }

        for (int i = 0; i < 3000; i++) {
            myPodcast.reproduce();
        }

        System.out.println("Total de reproducciones: " + mySong.getTotalViews());
        System.out.println("Total de me gusta: " + mySong.getTotalLikes());

        MyFavorites favorites = new MyFavorites();
        favorites.add(myPodcast);
        favorites.add(mySong);
    }
}
