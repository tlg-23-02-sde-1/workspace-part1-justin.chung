package net.flix;

public class Movie {
    private String name;
    private Integer releaseYear;
    private Double revenue;
    private Rating rating;
    private Genre genre;


    public Movie() {
    }

    public Movie(String name) {
        this();
        setName(name);
    }

    public Movie(String name, Integer releaseYear) {
        this(name);
        setReleaseYear(releaseYear);
    }

    public Movie(String name, Integer releaseYear, Double revenue) {
        this(name, releaseYear);
        setRevenue(revenue);
    }

    public Movie(String name, Integer releaseYear, Double revenue, Rating rating) {
        this(name, releaseYear, revenue);
        setRating(rating);
    }

    public Movie(String name, Integer releaseYear, Double revenue, Rating rating, Genre genre) {
        this(name, releaseYear, revenue, rating);
        setGenre(genre);
    }

    public Genre getGenre() {
        return this.genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public Rating getRating() {
        return this.rating;
    }

    public void setRating (Rating rating) {
        this.rating = rating;
    }

    public String getName(String name) {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getReleaseYear() {
        return this.releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setRevenue(Double revenue) {
        this.revenue = revenue;
    }

    public Double getRevenue() {
        return this.revenue;
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return String.format("%s (%d) $%,.2f Rated: %s Genre: %s", getName(), getReleaseYear(), getRevenue(), getRating(), getGenre());
    }
}