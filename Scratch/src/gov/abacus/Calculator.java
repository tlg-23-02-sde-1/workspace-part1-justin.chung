package gov.abacus;

/* Static methods are called without an instance
 *
 */
class Calculator {

    /* returns the arithmetic mean ()
     * of the supplied integers
     */
    public static double mean(int first, int...nums) {
        double sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum / (nums.length + 1);
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }

    /* Returns a random integer between 1 and 14 inclusive.
     * in java static classes
     */
    public static int roll() {
        return (int) (Math.random() * 14) + 1;
    }
    /*
     * returns a random integer between min and max inclusive
     */

    public static int roll(int min, int max) {
        return (int) (Math.random() * (max - min + 1)) + min;
    }
}
