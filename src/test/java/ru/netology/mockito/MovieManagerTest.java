package ru.netology.mockito;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class MovieManagerTest {


    @Test
    public void shouldShowAll() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Maxoynee 1");
        manager.addMovie("Maxoynee 2");
        manager.addMovie("Maxoynee 3");
        manager.addMovie("Maxoynee 4");
        manager.addMovie("Maxoynee 5");
        manager.addMovie("Maxoynee 6");
        manager.addMovie("Maxoynee 7");
        manager.addMovie("Maxoynee 8");
        manager.addMovie("Maxoynee 9");
        manager.addMovie("Maxoynee 10");

        String[] expected = {"Maxoynee 1", "Maxoynee 2", "Maxoynee 3", "Maxoynee 4", "Maxoynee 5", "Maxoynee 6", "Maxoynee 7", "Maxoynee 8", "Maxoynee 9", "Maxoynee 10"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowDefaultTenFilms() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Maxoynee 1");
        manager.addMovie("Maxoynee 2");
        manager.addMovie("Maxoynee 3");
        manager.addMovie("Maxoynee 4");
        manager.addMovie("Maxoynee 5");
        manager.addMovie("Maxoynee 6");
        manager.addMovie("Maxoynee 7");
        manager.addMovie("Maxoynee 8");
        manager.addMovie("Maxoynee 9");
        manager.addMovie("Maxoynee 10");
        String[] expected = {"Maxoynee 10", "Maxoynee 9", "Maxoynee 8", "Maxoynee 7", "Maxoynee 6", "Maxoynee 5", "Maxoynee 4", "Maxoynee 3", "Maxoynee 2", "Maxoynee 1"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowBelowLimit() {
        MovieManager manager = new MovieManager(5);


        manager.addMovie("Maxoynee 1");
        manager.addMovie("Maxoynee 2");
        manager.addMovie("Maxoynee 3");
        manager.addMovie("Maxoynee 4");
        manager.addMovie("Maxoynee 5");
        manager.addMovie("Maxoynee 6");
        manager.addMovie("Maxoynee 7");
        manager.addMovie("Maxoynee 8");
        manager.addMovie("Maxoynee 9");
        manager.addMovie("Maxoynee 10");

        String[] expected = {"Maxoynee 5", "Maxoynee 4", "Maxoynee 3", "Maxoynee 2", "Maxoynee 1"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowZero() {
        MovieManager manager = new MovieManager();
        String[] expected = {};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowOverLimit() {
        MovieManager manager = new MovieManager(10);
        manager.addMovie("Maxoynee 1");
        manager.addMovie("Maxoynee 2");
        manager.addMovie("Maxoynee 3");
        manager.addMovie("Maxoynee 4");
        manager.addMovie("Maxoynee 5");
        manager.addMovie("Maxoynee 6");
        manager.addMovie("Maxoynee 7");
        manager.addMovie("Maxoynee 8");
        manager.addMovie("Maxoynee 9");
        manager.addMovie("Maxoynee 10");
        manager.addMovie("Maxoynee 11");
        String[] expected = {"Maxoynee 10", "Maxoynee 9", "Maxoynee 8", "Maxoynee 7", "Maxoynee 6", "Maxoynee 5", "Maxoynee 4", "Maxoynee 3", "Maxoynee 2", "Maxoynee 1"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldShowDefaultLimitWithLessMovies() {
        MovieManager manager = new MovieManager(10);
        manager.addMovie("Maxoynee 1");
        manager.addMovie("Maxoynee 2");
        manager.addMovie("Maxoynee 3");
        String[] expected = {"Maxoynee 3", "Maxoynee 2", "Maxoynee 1"};
        String[] actual = manager.findLast();
        assertArrayEquals(expected, actual);
    }
}