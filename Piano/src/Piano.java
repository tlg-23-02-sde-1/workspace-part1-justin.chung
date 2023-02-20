class Piano {
    //instance variables
    String brand;
    int volume = 0;
    String colorBody = "black";
    boolean power = false;
    boolean pedalSustain = false;
    boolean pedalDampener = false;

    //methods
    void turnOn() {
        power = true;
        System.out.println("Turning on your " + brand + " piano");
    }

    void turnOff() {
        power = false;
        System.out.println("Turning off your " + brand + " piano");
    }

    void increaseVolume(int volumeIncrease) {
        volume += volumeIncrease;
        System.out.println("Increasing volume to " + volume);
    }

}
