package com.KMbarath.assignment.utilities;

import com.KMbarath.assignment.employees.Employee;
public class EmployeeUtilities {

    public static double calculateAnnualSalary(Employee e) {
        return e.getSalary() * 12;
    }

    public static void giveBonus(Employee e, double bonus) {
        e.setSalary(e.getSalary() + bonus);
    }

    public static void printEmployeeDetails(Employee e) {
        System.out.println(e.getDetails());
    }

}
