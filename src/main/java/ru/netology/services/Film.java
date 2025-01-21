package ru.netology.services;

public class Film {
    private int id;
    private String filmName;
    private String genre;
    private String country;

    public Film(int id, String filmName, String genre, String country) {
        this.id = id;
        this.filmName = filmName;
        this.genre = genre;
        this.country = country;
    }
}