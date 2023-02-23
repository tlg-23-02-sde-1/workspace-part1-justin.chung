package com.hr.client;

import com.hr.Employee;
import com.transportation.DestinationUnreachableException;

public class EmployeeClient {

    public static void main(String[] args) {
        //create an instance of Employee
        Employee employee = new Employee("Justin");

        //call goToWork() on the Employee object
        try {
            employee.goToWork();
            System.out.println("Arrived at work");
        } catch (DestinationUnreachableException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}