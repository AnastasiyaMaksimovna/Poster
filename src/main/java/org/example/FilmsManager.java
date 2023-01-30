package org.example;

public class FilmsManager {
    private String[] films = new String[0];
    private int limitFilms;

    public FilmsManager() {
        this.limitFilms = 10;
    }

    public FilmsManager(int limitFilms) {
        this.limitFilms = limitFilms;
    }

    public void addFilm(String film) {
        String[] tmp = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            tmp[i] = films[i];
        }
        tmp[tmp.length - 1] = film;
        films = tmp;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        String[] tmp;
        if (limitFilms > films.length) {
            tmp = new String[films.length];
        } else {
            tmp = new String[limitFilms];
        }
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = films[films.length - i - 1];
        }

        return tmp;
    }

}

