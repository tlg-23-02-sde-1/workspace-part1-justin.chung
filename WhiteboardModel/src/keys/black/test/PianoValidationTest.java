package keys.black.test;

import keys.black.BodyType;
import keys.black.Brands;
import keys.black.Colors;
import keys.black.Piano;

import java.time.LocalDate;

class PianoValidationTest {
    public static void main(String[] args) {
        Piano p1 = new Piano();
        Piano p2 = new Piano(Brands.YAMAHA, BodyType.GRAND, Colors.BLACK);

        System.out.println(p1);
        System.out.println(p2);
        p1.setVolume(101);
        p1.changeSong("Chopin Ballade No. 4 in F minor, Op. 52");

        Piano p3 = new Piano(Brands.YAMAHA, 100, Colors.BLACK, "Chopin Ballade No. 4 in F minor, Op. 52", true, BodyType.GRAND, LocalDate.of(2000, 1, 1));
        System.out.println(p3);
    }
}