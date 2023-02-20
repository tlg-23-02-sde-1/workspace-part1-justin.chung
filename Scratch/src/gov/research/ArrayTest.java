package gov.research;

import java.util.Arrays;

class ArrayTest {
    public static void main(String[] args) {
        int[] ages = new int[2];
        ages[0] = 31;
        ages[1] = 28;
        System.out.println(Arrays.toString(ages));

        double[] prices = { 1.0, 2.0, 3.0 };
        System.out.println(prices.length);

        String[] names = { "John", "Jane", "Jack" };
        for(String name : names) {
            System.out.println(name);
        }
        System.out.println(Arrays.toString(names));
    }
}