/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;

/**
 * Intended usage (by human):
 *  $ java TelevisionClientArgs <brand> <volume> <display>
 * 
 * Example:
 *  $ java TelevisionClientArgs Samsung 32 PLASMA
 *
 * GOAL:
 *  Create an instance of Television with the specifications (values) provided by the user.
 */

class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of your (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note = "Note: Supported brands are " + Arrays.toString(Television.VALID_BRANDS) +
                    "Volume must be between" + Television.MIN_VOLUME + " and " + Television.MAX_VOLUME + "\n" +
                    "Supported displays are " + Arrays.toString(DisplayType.values());

            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;  // early return from main(), application exits
        }

        // at this point, you can safely proceed, because you got your arguments
        // first, let's just show that we got them
        System.out.println("You provided " + args.length + " arguments");

        //first convert any string inputs to proper types
        String brand = args[0];
        int volume = Integer.parseInt(args[1]);
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase());

        // now create an instance of Television from these values
        Television tv = new Television(brand, volume, display);

        // now print out the instance
        System.out.println(String.format("Congratulations on your order! Your custom television is: Brand =" +
                "%s, Volume = %d, Display = %s",tv.getBrand(), tv.getVolume(), tv.getDisplay()));



    }
}