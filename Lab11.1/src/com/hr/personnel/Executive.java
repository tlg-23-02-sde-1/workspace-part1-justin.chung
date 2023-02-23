package com.hr.personnel;
import java.time.LocalDate;

public class Executive extends SalariedEmployee{
    public Executive() {
        super();
    }

    public Executive(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public Executive(String name, LocalDate hireDate, double salary) {
        super(name, hireDate, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is playing golf as an executive since: " + getHireDate());
    }

    @Override
    public void fileReturn() {
        System.out.println(getName() + " filed returned electronically.");
    }

    @Override
    public double getStandardDeduction() {
        return 12_000.0;
    }
}