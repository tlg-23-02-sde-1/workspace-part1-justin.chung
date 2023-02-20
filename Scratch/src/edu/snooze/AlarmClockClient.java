package edu.snooze;
/*
 * The application "AlarmClockClient" is a client for the class "AlarmClock".
 * Every Java application has ONE main-class, and usually many "business" classes.
 * Here, we will create a few instances of AlarmClock and give them a try.
 */


class AlarmClockClient {
    public static void main(String[] args) {
        // Create an alarm clock object
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(10);
        clock1.setRepeat(5);
        System.out.println(clock1);

        //  Create a second alarm clock object via the snoozeInterval constructor
        AlarmClock clock2 = new AlarmClock(10);
        System.out.println(clock2.getSnoozeInterval());


        // create a third alarm clock object VIA snoozeInterval and repeat constructor
        AlarmClock clock3 = new AlarmClock(10, 5);
        clock3.getSnoozeInterval();
        System.out.println(clock3);

        //show their toString() methods in action
        System.out.println(clock1); // toString is automatically called when you print an object.
    }
}
