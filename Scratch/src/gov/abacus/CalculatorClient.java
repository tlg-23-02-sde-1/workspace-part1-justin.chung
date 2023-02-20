package gov.abacus;

class CalculatorClient {
    public static void main(String[] arge) {
        double refract = Calculator.add(1,2);
        System.out.println("the sum is " + refract);
        System.out.println("the difference is " + Calculator.sub(2,1));
        System.out.println("ten is even? " + Calculator.isEven(10));
        System.out.println("ten divided by two is " + Calculator.divide(10,4));
        System.out.println("random 1-14 is " + Calculator.roll());
        System.out.println("random 10-20 is " + Calculator.roll(10,20));
        System.out.println("the mean is: " + Calculator.mean(1, new int[] {1,2,3,4,5,6,7,8,9,10}) + "\n");
    }
}