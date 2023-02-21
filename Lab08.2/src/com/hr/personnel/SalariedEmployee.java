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

    @Override
    public void pay(){
        System.out.println(getName() + " is paid salary " + getSalary());
    }

    @Override // This annotation is optional but it's good practice to use it.
    public String toString() {
        StringBuilder output = new StringBuilder(super.toString())
                .append(", salary=")
                .append(getSalary());
        return output.toString();
    }
}