package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

    class FilmManagerTest {

        Film film1 = new Film(1, "Бладшот", "боевик", "США");
        Film film2 = new Film(2, "Вперёд", "мультфильм", "США, Япония");
        Film film3 = new Film(3, "Отель 'Белград'", "комедия", "Россия");
        Film film4 = new Film(4, "Джентельмены", "боевик", "США");
        Film film5 = new Film(5, "Человек невидимка", "ужасы", "США, Канада, Австралия");
        Film film6 = new Film(6, "Тролли0", "мультфильм", "США");


    // Проверка вывода пустого массива
        @Test
        public void shouldOutputEmpty() {
            FilmManager manager = new FilmManager();
            manager.findAll();

            Film[] expected = {};
            Assertions.assertArrayEquals(expected, manager.findAll());
        }

    // Добавление первого фильма
        @Test
        public void shouldAddedFirstFilm() {
            FilmManager manager = new FilmManager();
            manager.addFilm(film1);

            Film[] expected = {film1};
            Assertions.assertArrayEquals(expected, manager.findAll());
        }

    // Добавление второго фильма
        @Test
        public void shouldAddedSecondFilm() {
            FilmManager manager = new FilmManager();
            manager.addFilm(film1);
            manager.findAll();
            manager.addFilm(film2);

            Film[] expected = {film1, film2};
            Assertions.assertArrayEquals(expected, manager.findAll());
        }

    //Вывод фильмов в порядке добавления
        @Test
        public void shouldFindAll() {
            FilmManager manager = new FilmManager();
            manager.addFilm(film1);
            manager.addFilm(film2);
            manager.addFilm(film3);
            manager.addFilm(film4);
            manager.addFilm(film5);
            manager.addFilm(film6);

            Film[] expected = {film1, film2, film3, film4, film5, film6};
            Assertions.assertArrayEquals(expected, manager.findAll());

        }

    // Вывод фильмов в обратном порядке, если количество фильмов в массиве больше, чем указано по умолчанию.
        @Test
        public void findLastDefaultSize() {
            FilmManager manager = new FilmManager();
            manager.addFilm(film1);
            manager.addFilm(film2);
            manager.addFilm(film3);
            manager.addFilm(film4);
            manager.addFilm(film5);
            manager.addFilm(film6);
            manager.findLast();

            Film[] expected = {film6, film5, film4, film3, film2};
            Assertions.assertArrayEquals(expected, manager.findLast());
        }

    // Увеличение количества выведенных фильмов в обратном порядке.
        @Test
        public void shouldFindLastSize6() {
            FilmManager manager = new FilmManager(6);
            manager.addFilm(film1);
            manager.addFilm(film2);
            manager.addFilm(film3);
            manager.addFilm(film4);
            manager.addFilm(film5);
            manager.addFilm(film6);

            manager.findLast();
            Film[] expected = {film6, film5, film4, film3, film2, film1};
            Assertions.assertArrayEquals(expected, manager.findLast());
        }

    // Уменьшение количества выведенных фильмов в обратном порядке
        @Test
        public void shouldFindLastSize4() {
            FilmManager manager = new FilmManager(4);
            manager.addFilm(film1);
            manager.addFilm(film2);
            manager.addFilm(film3);
            manager.addFilm(film4);
            manager.addFilm(film5);
            manager.addFilm(film6);
            manager.findLast();

            Film[] expected = {film6, film5, film4, film3};
            Assertions.assertArrayEquals(expected, manager.findLast());
        }

    // Вывод фильмов в обратном порядке, в случае если количество фильмов в массиве меньше, чем указано по умолчанию
        @Test
        public void shouldFindLastMinDefaultSize() {
            FilmManager manager = new FilmManager();
            manager.addFilm(film1);
            manager.addFilm(film2);
            manager.addFilm(film3);
            manager.addFilm(film4);
            manager.findLast();

            Film[] expected = {film4, film3, film2, film1};
            Assertions.assertArrayEquals(expected, manager.findLast());
        }
}