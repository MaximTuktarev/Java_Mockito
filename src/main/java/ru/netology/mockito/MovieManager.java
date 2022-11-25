package ru.netology.mockito;

public class MovieManager {
    private String[] movies = new String[0];
    private int movieLimit = 10;

    public MovieManager() {

    }

    public MovieManager(int limit) {
        if (limit > 0) {
            movieLimit = limit;
        }

    }

    public void addMovie(String movie) {
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }


    public String[] findAll() {
        return movies;

    }

    public String[] findLast() {
        int resultLength = movies.length;
        if (resultLength > movieLimit) {
            resultLength = movieLimit;
        } else {
            resultLength = movies.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = resultLength - i - 1;
            result[i] = movies[index];
        }
        return result;
    }
}









