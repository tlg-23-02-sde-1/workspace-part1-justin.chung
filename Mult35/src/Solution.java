import java.util.Scanner;

public class Solution {

    public int solution(int number) {
        //TODO: Code stuff here
        Scanner urInt = new Scanner(System.in);
        int myInt = urInt.nextInt();

        if(myInt < 0) {
            return 0;
        }

        int sum = 0;
        for ( int i = 0; i < myInt; i++) {
            if(i % 3 == 0) {
                sum += i;
            }
            else if(i % 5 == 0) {
                sum+= i;
            }
        }
        return sum;
    }
}