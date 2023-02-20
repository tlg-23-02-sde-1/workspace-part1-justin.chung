/*
 * This class represents a television. It has a brand and a volume.
 * No main method here.
 */

class Television {

    // private instance variables
    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // Static instance variables
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    // Instance variables
    private String brand;
    private int volume;
    private DisplayType display = DisplayType.LED;
    private int brightness;
    private boolean mute = false;
    private int oldVolume = 0;

    //constructors

    public Television() {
        instanceCount++;// increments instance count
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }

    // Methods
    void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + volume);
    }

    void turnOff() {
        System.out.println("Shutting down your " + getBrand() + " TV");
    }

    //accessor methods in java are not void

    int getVolume() {
        return volume;
    }

    String getBrand() {
        return brand;
    }

    int getBrightness() {
        return brightness;
    }


    //mutator methods in java are void

    public void setBrand(String brand) {
        switch (brand) {
            case "Samsung":
            case "Sony":
            case "LG":
            case "Toshiba":
                this.brand = brand;
                break;
            default:
                System.out.println("Invalid brand Brand not Set");
        }
    }

    public void increaseVolume(int amount) {
        if (volume + amount > MAX_VOLUME) {
            System.out.println("Volume cannot exceed " + MAX_VOLUME);
            return;
        }

        if (volume + amount < MIN_VOLUME) {
            System.out.println("Volume cannot be less than " + MIN_VOLUME);
            return;
        }

        else {
            this.volume += amount;
            System.out.println("Increasing volume to " + getVolume());
        }
    }

    public void setVolume (int volume)  {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
        }
        else {
            System.out.printf("Invalid volume input: %s, valid range is %s-%s\n", volume, MIN_VOLUME, MAX_VOLUME);
        }
    }

    public void increaseBrightness(int amount) {
        this.brightness += amount;
        System.out.println("Increasing brightness to " + getBrightness());
    }

    private boolean verifyInternetConnection() {
        // some code here
        return true;
    }

    private boolean isMuted() {
        if (mute) {
            return true;
        }
        return false;
    }

    public void mute() {
        if(isMuted()) {
            mute = false;
            volume = oldVolume;
        }
        else {
            mute = true;
            oldVolume = volume;
            volume = 0;
        }
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public DisplayType getDisplay() {
        return display;
    }


    public String toString() {
//        return String.format("Brand: " + getBrand() + ", Volume: " + getVolume() + ", Brightness: "
//        + getBrightness() + ", Muted: " + isMuted() + ", Display: " + getDisplay());
        return String.format("Brand: %s, Volume: %s, Brightness: %s, Muted: %s, Display: %s ", getBrand(),
                getVolume(), getBrightness(), isMuted(), getDisplay());
    }
}
