package edu.snooze;
/*
 * The AlarmClock business class is a model of an alarm clock.
 */

class AlarmClock {
    // attributes or properties, in Java these are called "fields" or "instance variables"
    private static int nextId = 1;
    private int id;

    private int snoozeInterval = 5; //default value when no value is provided
    private int repeat = 10;
    private static final int MIN_INTERVAL = 1; // class variable, shared by all instances of this class
    private static final int MAX_INTERVAL = 20;


    //constrcutors
    public AlarmClock() {
        //default constructor, no parameters
    }

    public AlarmClock(int snoozeInterval) {
        this(); // call the default constructor first
        setSnoozeInterval(snoozeInterval);
        this.id = nextId++;
    }

    public AlarmClock(int snoozeInterval, int repeat) {
        this(snoozeInterval); // delegate to ctor above me for snoozeInterval
        setRepeat(repeat);
    }

    // functions (methods in Java) that can be called on an object of this class
    void snooze() {
        // snoozeInterval is an instance variable, so we can use it in this method
        // + is used for string concatenation in java.

        System.out.println("Snoozing for " + getSnoozeInterval() + " minutes.");
    }


    public int getSnoozeInterval() {
        return snoozeInterval;
    }

    // TODO set a data constraint on snoozeInterval
    public void setSnoozeInterval(int snoozeInterval) {
        if((snoozeInterval >= MIN_INTERVAL) && (snoozeInterval <= MAX_INTERVAL)) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snooze interval [" + MIN_INTERVAL + ", " + MAX_INTERVAL + "]: " + snoozeInterval);
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public int getId() {
        return id;
    }

    public String toString() {
        return "AlarmClock [snoozeInterval=" + getSnoozeInterval() + ", repeat= " + getRepeat() + " id=" + getId() + "]";
    }
}

/*
 * System or "business class" to model the workings of an alarm clock.
 * This class definition has no main method, most classes don't.
 */
