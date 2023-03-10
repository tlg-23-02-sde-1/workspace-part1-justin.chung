package com.hr.personnel;
import java.time.LocalDate;

public class HourlyEmployee extends Employee {
    private double rate;
    private double hours;

    public HourlyEmployee() {
        super();
    }

    public HourlyEmployee(String name, LocalDate hireDate) {
        super(name, hireDate);
    }

    public HourlyEmployee(String name, LocalDate hireDate, double rate, double hours) {
        this(name, hireDate);
        setRate(rate);
        setHours(hours);
    }


    double getRate() {
        return rate;
    }
    void setRate(double rate) {
        this.rate = rate;
    }

    double getHours() {
        return hours;
    }
    void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public void pay(){
        System.out.println(getName() + " is paid hourly " + getRate() * getHours());
    }

    @Override
    public String toString() {
        StringBuilder output = new StringBuilder(super.toString())
                .append(", rate=")
                .append(getRate())
                .append(", hours=")
                .append(getHours());
        return output.toString();
    }
}