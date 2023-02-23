package com.hr;

import com.transportation.Car;
import com.transportation.DestinationUnreachableException;

public class Employee {
    // INSTANCE VARIABLES
    private String name;

    // CONSTRUCTORS
    public Employee(String name) {
        this.name = name;
    }

    // BUSINESS METHODS

    /*
     * OPTION 4: try catch but throw a different one
     */

    public void goToWork()
            throws WorkException {
        // create an instance of Car with all three properties: vin, make, model
        Car myCar = new Car ("123456789", "Toyota", "Camry");
        myCar.start();
        try {
            // call moveTo() on the Car object, passing "West Seattle" for the destination
            myCar.moveTo("Mars");
        }
        catch (DestinationUnreachableException e) {
            throw new WorkException("Unable to get to work",e);
        }
        finally {
            myCar.stop();
        }
    }

    /*
     * OPTION 3: TRY CATCH RESPOND IN SOME WAY THEN RETHROW
     * "catch and rethrow"
     */

    /*
    public void goToWork()
    throws DestinationUnreachableException {
        // create an instance of Car with all three properties: vin, make, model
        Car myCar = new Car ("123456789", "Toyota", "Camry");
        myCar.start();
        try {
            // call moveTo() on the Car object, passing "West Seattle" for the destination
            myCar.moveTo("West Seattle");
        }
        catch (DestinationUnreachableException e) {
            System.out.println("Email sent to Lisa Herbold to complain");
            throw e;
        }
        finally {
            myCar.stop();
        }
    }

     */

    /*
     * OPTION 2: "punt" the exception to the caller.
     * Because the exception is checked I must say THROWS
     * Note that a try finally can be used for the regular finally reasons.
     */

    /*
    public void goToWork()
    throws DestinationUnreachableException {
        // create an instance of Car with all three properties: vin, make, model
        Car myCar = new Car ("123456789", "Toyota", "Camry");
        myCar.start();
        try {
            // call moveTo() on the Car object, passing "West Seattle" for the destination
            myCar.moveTo("Mars");
        } finally {
            myCar.stop();
        }
    }

     */


    /*
     * OPTION 1: try_catch and handle the exception
     */
    /*
    public void goToWork() {
        // create an instance of Car with all three properties: vin, make, model
        Car myCar = new Car ("123456789", "Toyota", "Camry");
        try {
        // call moveTo() on the Car object, passing "West Seattle" for the destination
            myCar.start();
            myCar.moveTo("Mars");
            System.out.println("Arrived at work");
        } catch (DestinationUnreachableException e) {
            System.out.println(" Error a car cannot go to destination " + e);;
        } finally {
            myCar.stop();
        }
    }
    */

    // ACCESSOR METHODS
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": name=" + getName();
    }
}