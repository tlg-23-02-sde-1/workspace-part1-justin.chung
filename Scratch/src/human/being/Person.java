package human.being;/*
 * Immutable class practice, more accurately this is a class definition
 * written in such a way that instances of it cannot have their properties changed once created.
 * In short, getters but no setters.
 */

import java.time.LocalDate;
import java.time.Period;

import static java.time.LocalDate.now;

class Person {
    // Instance variables
    private String name;
    private LocalDate birthDate;

    // Constructor
    public Person(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // Accessor methods
    /**
     * Returns the person's age in whole years.
     * This can be derived from the birthDate and today's date.
     * You basically need the period between the two dates.
     */
    public int getAge() {
        Period period = Period.between(getBirthDate(),now());
        return period.getYears();
    }


    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    //toString method
    @Override
    public String toString() {
        return String.format("Name: %s, Birth Date: %s", getName(), getBirthDate());
    }
}