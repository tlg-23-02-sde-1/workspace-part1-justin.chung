package gov.research;

class WrappersTest {
    public static void main(String[] args) {
        String ageInput = "10"; //decalres sting and assigns "56"
        int age = Integer.parseInt(ageInput); // converts string to int
        Integer ageInteger = Integer.valueOf(ageInput); // converts string to Integer warpper

        String popInput = "7000000000";
        long pop = Long.parseLong(popInput);
        Long popLong = Long.parseLong(popInput);

        String priceInput = "200.50";
        double price = Double.parseDouble(priceInput);
        Double priceDouble = Double.valueOf(priceInput);

        String twinsInput = "true";
        boolean twins = Boolean.parseBoolean(twinsInput);
        Boolean twinsBoolean = Boolean.valueOf(twinsInput);

        System.out.println(age);
        System.out.println(ageInteger);
        System.out.println(pop);
        System.out.println(popLong);
    }
}