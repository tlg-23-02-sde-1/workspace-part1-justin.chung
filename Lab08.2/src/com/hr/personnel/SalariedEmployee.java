package com.hr.personnel;
import java.time.LocalDate;

public class SalariedEmployee extends Employee {

    private double salary;

    public SalariedEmployee() {
        super();
    }

    public SalariedEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public SalariedEmployee(String name, LocalDate hireDate, double salary) {
        this(name, hireDate);
        setSalary(salary);
    }

    void setSalary(double salary) {
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }

    public String toString() {
        StringBuilder output = new StringBuilder("SalariedEmployee: name=")
                .append(getName())
                .append(", hireDate=")
                .append(getHireDate())
                .append(", salary=")
                .append(getSalary());
        return output.toString();
    }
}