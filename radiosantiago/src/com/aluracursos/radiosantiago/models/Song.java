package com.aluracursos.radiosantiago.models;

public class Song extends Audio {
    private String album;
    private String singer;
    private String gender;

    @Override
    public int getRating() {
        if (getTotalLikes() > 5000) {
            return 8;
        } else {
            return 4;
        }
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
