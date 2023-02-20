package keys.black.client;

import keys.black.BodyType;
import keys.black.Brands;
import keys.black.Colors;
import keys.black.Piano;

import java.util.Arrays;

class PianoClientArgs {
    public static void main(String[] args) {
        if (args.length < 3) {
            String usage = "Usage: java PianoClientArgs <Brand> <BodyType> <Body Color>";
            String example = "Example: PianoClientArgs: Brand, BodyType, Body Color";
            String note = "Note: supported brands are " + Arrays.toString(Brands.values()) + "\n" +
                    "Support body types are " + Arrays.toString(BodyType.values()) + "\n" +
                    "Supported colors are " + Arrays.toString(Colors.values()) + "\n";
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;
        }

        System.out.println("You provided " + args.length + " arguments");
        Brands brand = Brands.valueOf(args[0].toUpperCase());
        BodyType bodyType = BodyType.valueOf(args[1].toUpperCase());
        Colors colorBody = Colors.valueOf(args[2].toUpperCase());

        Piano piano = new Piano(brand, bodyType, colorBody);

        System.out.println("Congratulations on your order! Your custom piano is: Brand = " + piano.getBrand() + ", Volume = " + piano.getBodyType() + ", Color = " + piano.getColorBody());
    }
}