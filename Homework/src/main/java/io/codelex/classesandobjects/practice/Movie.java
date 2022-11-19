package io.codelex.classesandobjects.practice;

import java.util.ArrayList;

public class Movie {
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating) {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio) {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }


    public String getTitle() {
        return title;
    }

    public String getStudio() {
        return studio;
    }

    public String getRating() {
        return rating;
    }

    public void printMovie() {
        System.out.println(title + "; " + studio + "; " + rating);
    }

    public static Movie[] getPG(Movie[] movies) {
        ArrayList<Movie> moviesList = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getRating().equals("PG")) {
                moviesList.add(movie);
            }
        }
        Movie[] moviesPG = new Movie[moviesList.size()];
        if (moviesList.size() != 0) {
            for (int i = 0; i < moviesList.size(); i++) {
                moviesPG[i] = moviesList.get(i);
            }
        }
        return moviesPG;
    }

    public static void main(String[] args) {
        Movie movie1 = new Movie("Casino Royale", "Eon Productions", "PG13");
        Movie movie2 = new Movie("Glass", "Buena Vista International", "PG13");
        Movie movie3 = new Movie("Spider-Man: Into the Spider-Verse", "Columbia Productions", "PG");
        Movie movie4 = new Movie("Minions: The Rise of Gru", "Universal Pictures", "PG");
        Movie movie5 = new Movie("Downfall", "Constantin Film", "R");
        Movie[] movies = {movie1, movie2, movie3, movie4, movie5};
        for (Movie movie : movies) {
            movie.printMovie();
        }
        System.out.println();
        Movie[] moviesPG = getPG(movies);
        for (Movie movie : moviesPG) {
            movie.printMovie();
        }
    }
}
