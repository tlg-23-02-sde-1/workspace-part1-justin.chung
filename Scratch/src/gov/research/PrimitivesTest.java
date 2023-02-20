package gov.research;

class PrimitivesTest {
    public static void main(String[] args) {
        int x = 0; // x must be initialized. protected in java.
        System.out.println(x);

        int age = 31;
        System.out.println("The age is: " + age);

        long population = 7000000000L;
        System.out.println("The population is: " + population);

        double height = 181.0;
        System.out.println("The height is: " + height);

        boolean isTall = true;
        System.out.println("Am I tall? " + isTall);

        char grade = 'A';
        System.out.println("My grade is: " + grade);

        String fav = "Belly";
        System.out.println("My favorite food is: " + "\"" + fav + "\"");

        int i = 18;
        System.out.println(i);

        int j = i;
        System.out.println(j);

        i++; // i is now 19. j is still 18.
        System.out.println(i);
        System.out.println(j);

        int n = 0;
        System.out.println(n++); // 0
        System.out.println(++n);
    }
}