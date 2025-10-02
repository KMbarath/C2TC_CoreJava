package com.KMbarath.assignment;

import com.KMbarath.assignment.employees.Manager;
import com.KMbarath.assignment.employees.Developer;
import com.KMbarath.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Barath", "04", 100000.0, "Sales", 8);
        Developer dev = new Developer("Rex", "45", 60000.0, "Java", "Mid");

        System.out.println("=== Initial Details ===");
        EmployeeUtilities.printEmployeeDetails(mgr);
        EmployeeUtilities.printEmployeeDetails(dev);

        System.out.println("\n=== Annual Salaries ===");
        System.out.printf("%s annual: %.2f%n", mgr.getName(),
                          EmployeeUtilities.calculateAnnualSalary(mgr));
        System.out.printf("%s annual: %.2f%n", dev.getName(),
                          EmployeeUtilities.calculateAnnualSalary(dev));

        System.out.println("\n=== Give bonus to developer (using utilities) ===");
        EmployeeUtilities.giveBonus(dev, 5000.0);
        EmployeeUtilities.printEmployeeDetails(dev);

        System.out.println("\n=== Manager promotes developer ===");
        mgr.promoteEmployee(dev, 2000.0);
        EmployeeUtilities.printEmployeeDetails(dev);

        System.out.println("\n=== Developer commits code ===");
        dev.commitCode(120);
    }
}