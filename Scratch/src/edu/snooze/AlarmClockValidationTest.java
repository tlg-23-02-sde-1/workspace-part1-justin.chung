package edu.snooze;

class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock1 = new AlarmClock();
        clock1.setSnoozeInterval(10);
        for(int i = -1; i < 22; i++) {
            clock1.setSnoozeInterval(i);
        }

        System.out.println(clock1);
    }
}