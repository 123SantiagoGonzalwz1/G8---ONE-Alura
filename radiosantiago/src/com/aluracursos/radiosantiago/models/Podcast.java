package com.aluracursos.radiosantiago.models;

public class Podcast extends Audio {
    private String compere;
    private String description;

    @Override
    public int getRating() {
        if (getTotalLikes() > 2000) {
            return 9;
        } else {
            return 2;
        }
    }

    public String getCompere() {
        return compere;
    }

    public void setCompere(String compere) {
        this.compere = compere;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
