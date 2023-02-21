/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */

package com.hr.personnel.client;

import com.hr.personnel.*;

import java.time.LocalDate;

/**
 * Application main-class.
 */
class HRClient {

    public static void main(String[] args) {
        // create Department object
        Department dept = new Department("Sales", "Seattle");
        System.out.println(dept);

        // add Employees to it
        dept.addEmployee(new HourlyEmployee("Jason",    LocalDate.of(1990, 8, 24), 100, 20));
        dept.addEmployee(new SalariedEmployee("Julie",  LocalDate.of(2000, 2, 2), 100_000));
        dept.addEmployee(new SalariedEmployee("Justin", LocalDate.of(2023, 02, 20), 100_000));
        dept.addEmployee(new HourlyEmployee("Jill",     LocalDate.of(2023, 02, 20), 50, 40));
        dept.addEmployee(new Executive("Gates",         LocalDate.of(2023, 02, 20), 500_000));

        // list its Employees
        System.out.println("\nList employees:");
        dept.listEmployees();

        // make its Employees work
        System.out.println("\nMake employees work:");
        dept.workEmployees();

        System.out.println("\nList employees:");
        dept.listEmployees();

        System.out.println("\nPay employees:");
        dept.payEmployees();

        System.out.println("\nTake vacation:");
        dept.holidayBreak();
    }
}