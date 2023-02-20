package net.flix;

public enum Genre {
    ACTION("Action"),
    COMEDY("Comedy"),
    DRAMA("Drama"),
    HORROR("Horror"),
    MYSTERY("Mystery"),
    ROMANCE("Romance"),
    THRILLER("Thriller"),
    WESTERN("Western");

    /*
     * everything under this line is regular class definition stuff
     *  namely, fields, constrcutors, methods
     */
    private String display;

    //contrsuctor - called only from inside (8 times, from those listed above)
    Genre(String display) {
        this.display = display;
    }
    public String Display() {
        return display;
    }

    public String toString() {
        return Display();
    }
}