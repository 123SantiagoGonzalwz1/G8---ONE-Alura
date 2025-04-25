package com.aluracursos.radiosantiago.models;

public class Audio {
    private String title;
    private int totalViews;
    private int totalLikes;
    private int rating;

    public void ILike() {
        this.totalLikes++;
    }

    public void reproduce() {
        this.totalViews++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    public int getTotalLikes() {
        return totalLikes;
    }

    public void setTotalLikes(int totalLikes) {
        this.totalLikes = totalLikes;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
