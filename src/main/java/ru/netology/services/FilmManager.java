package ru.netology.services;

public class FilmManager {

    private Film[] films = new Film[0];
    private int size;

    public FilmManager() {
        this.size = 5;
    }

    public FilmManager(int size) {
        this.size = size;
    }

    // Добавление фильма
        public void addFilm(Film film) {
            Film[] tmp = new Film[films.length +1];

            for (int i = 0; i < films.length; i++) {
                tmp[i] = films[i];
            }

            tmp[tmp.length - 1] = film;
            this.films = tmp;
        }

    // Вывод всех фильмов в порядке добавления

        public Film[] findAll() {
            return films;
        }

    // Вывод фильмов в порядке добавления с возможностью выбора количества фильмов
        public  Film[] findLast() {
            int resultLength;
            if (films.length < size) {
                resultLength = films.length;
            } else {
                resultLength = size;
            }

            Film[] reverse = new Film[resultLength];
            for (int i = 0; i < reverse.length; i++) {
                reverse[i] = films[films.length - 1 -i];
            }
            return reverse;
        }
}

