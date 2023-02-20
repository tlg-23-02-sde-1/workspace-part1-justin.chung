package net.flix.client;

import net.flix.Genre;
import net.flix.Movie;
import net.flix.Rating;

class MovieClient {
    public static void main(String[] args) {
        Movie movie = new Movie("Shrek");
        movie.setReleaseYear(2005);
        movie.setRevenue(491_800_000.03);
        movie.setRating(Rating.PG);
        movie.setGenre(Genre.COMEDY);
        System.out.println(movie);

        Movie movie2 = new Movie("The Labrinth", 1986, 20.0, Rating.R, Genre.HORROR);
        System.out.println(movie2);

        Movie movie3 = new Movie("Vacation in Java");
        System.out.println(movie3);
    }
}