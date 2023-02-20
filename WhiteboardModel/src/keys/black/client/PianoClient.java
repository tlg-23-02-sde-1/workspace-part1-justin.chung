package keys.black.client;

import keys.black.Brands;
import keys.black.Colors;
import keys.black.Piano;

public class PianoClient {
    public static void main(String[] args) {
        Piano p1 = new Piano();
        Piano p2 = new Piano();
        p1.setBrand(Brands.KAWAII);
        p1.turnOn();
        p1.setVolume(12);
        p1.changeSong("Chopin Ballade No. 4 in F minor, Op. 52");
        p1.turnOff();

        System.out.println("\n");

        p2.setBrand(Brands.STEINWAY);
        p2.turnOn();
        p2.setVolume(20);
        p2.changeSong("Chopin Nocturne No. 20 in C-sharp minor, Op. posth.");
        p2.turnOff();

        System.out.println("\n");

        Piano p3 = new Piano();
        p3.turnOn();
        p3.setVolume(10);
        System.out.println(p3.getSong());
        p3.turnOff();

        System.out.println("\n");

        Piano p4 = new Piano(Brands.YAMAHA);
        System.out.println(p4);
        Piano p5 = new Piano(Brands.YAMAHA, 10);
        System.out.println(p5);
        Piano p6 = new Piano(Brands.YAMAHA, 10, Colors.BLACK);
        System.out.println(p6);
        Piano p7 = new Piano(Brands.YAMAHA, 10, Colors.BLACK, "Chopin Nocturne No. 20 in C-sharp minor, Op. posth.");
        System.out.println(p7);
        Piano p8 = new Piano(Brands.YAMAHA, 10, Colors.WHITE, "Chopin Nocturne No. 20 in C-sharp minor, Op. posth.", true);
        System.out.println(p8);
    }
}