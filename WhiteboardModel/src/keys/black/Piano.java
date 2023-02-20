package keys.black;/*
 * This class is a blueprint for a piano object.
 * It has a brand, volume, color, open/close, pedal sustain, and a song.
 * No main method here.
 */

import java.time.LocalDate;

public class Piano {

    private static int instanceCount = 0;
    //instance variables
    private Brands brand = Brands.YAMAHA;
    private int volume = 0;
    private Colors colorBody = Colors.BLACK;
    private String song = "Mary had a little lamb";
    private boolean State = false;
    private boolean pedalSustain = false;
    private BodyType bodyType = BodyType.GRAND;
    private LocalDate dateOfManufacture = LocalDate.of(2000, 1, 1);
    //default constructor in java
    public Piano() {
        // no op
    }


    /* CONSTRUCTORS
     * 1. default constructor
     * 2. constructor with brand
     * 3. constructor with brand and volume
     * 4. constructor with brand, volume, and color
     * 5. constructor with brand, volume, color, and song
     * 6. constructor with brand, volume, color, song, and state
     * 7. constructor with brand, volume, color, song, state, and bodyType
     * 8. constructor with brand, volume, color, song, state, bodyType, and dateOfManufacture
     */

    //constructor with brand
    public Piano(Brands brand) {
        this();
        setBrand(brand);
    }

    //constructor with brand and volume
    public Piano(Brands brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    //constructor with brand, volume, and color
    public Piano(Brands brand, int volume, Colors colorBody) {
        this(brand, volume);
        setColor(colorBody);
    }

    //constructor with brand, bodyType, and color
    public Piano(Brands brand, BodyType bodyType, Colors colorBody) {
        this(brand);
        setBodyType(bodyType);
        setColor(colorBody);
    }

    //constructor with brand, volume, color, and song
    public Piano(Brands brand, int volume, Colors colorBody, String song) {
        this(brand, volume, colorBody);
        changeSong(song);
    }

    //constructor with brand, volume, color, song, and state
    public Piano(Brands brand, int volume, Colors colorBody, String song, boolean State) {
        this(brand, volume, colorBody, song);
        this.State = State;
    }

    //constructor with brand, volume, color, song, state, and bodyType
    public Piano(Brands brand, int volume, Colors colorBody, String song, boolean State, BodyType bodyType) {
        this(brand, volume, colorBody, song, State);
        setBodyType(bodyType);
    }

    //constructor with brand, volume, color, song, state, bodyType, and dateOfManufacture
    public Piano(Brands brand, int volume, Colors colorBody, String song, boolean State, BodyType bodyType, LocalDate dateOfManufacture) {
        this(brand, volume, colorBody, song, State, bodyType);
        setDateOfManufacture(dateOfManufacture);
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    /*
     * ACCESSOR METHODS
     * 1. getBrand
     * 2. getVolume
     * 3. getColorBody
     * 4. getSong
     * 5. getState
     * 6. getPedalSustain
     * 7. getBodyType
     */

    public Brands getBrand() {
        return brand;
    }

    //renames the brand
    public void setBrand(Brands newBrand) {
        this.brand = newBrand;
        System.out.println("Changing brand to " + getBrand());
    }

    public int getVolume() {
        return volume;
    }

    //sets the volume of the piano from user input if it is between 0 and 100
    public void setVolume(int volume) {
        if (volume < 0 || volume > 100) {
            System.out.println("Invalid volume: " + volume + ". Volume must be between 0 and 100");
        } else {
            this.volume = volume;
            System.out.println("Setting volume to " + getVolume());
        }
    }

    public Colors getColorBody() {
        return colorBody;
    }

    public String getSong() {
        return song;
    }

    public boolean getState() {
        return State;
    }

    public boolean getPedalSustain() {
        return pedalSustain;
    }

    /* mutator methods
     * 1. turnOn
     * 2. turnOff
     * 3. setVolume
     * 4. changeBrand
     * 5. changeColor
     * 6. pressPedalSustain
     * 7. releasePedalSustain
     * 8. changeSong
     * 9. setBodyType
     * 10. setDateOfManufacture
     */

    public BodyType getBodyType() {
        return bodyType;
    }

    //sets the body type
    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    //sets the date of manufacture
    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    //turns on the piano and souts the brand
    public void turnOn() {
        this.State = true;
        System.out.println("Opening your " + getBrand() + " piano");
    }

    //turns off the piano and souts the brand
    public void turnOff() {
        this.State = false;
        System.out.println("Closing your " + getBrand() + " piano");
    }

    //changes the color of the piano
    public void setColor(Colors newColor) {
        this.colorBody = newColor;
        System.out.println("Changing color to " + getColorBody());
    }

    //engages the pedal sustain
    public void pressPedalSustain() {
        this.pedalSustain = true;
        System.out.println("Changing pedal sustain to " + getPedalSustain());
    }

    //disengages the pedal sustain
    public void releasePedalSustain() {
        this.pedalSustain = false;
        System.out.println("Changing pedal sustain to " + getPedalSustain());
    }

    //changes the song
    public void changeSong(String newSong) {
        this.song = newSong;
        System.out.println("Changing song to " + getSong());
    }

    /* toString Override
     * using String.format to print out the values of the piano
     */

    public String toString() {
        return String.format("Piano [brand=%s, volume=%d, colorBody=%s, song=%s, State=%b, pedalSustain=%b, bodyType=%s, dateOfManufacture=%s]", brand, volume, colorBody, song, State, pedalSustain, bodyType, dateOfManufacture);
    }
}
