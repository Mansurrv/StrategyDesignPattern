package org.example.Strategy;

import org.example.Interface.EmployeeStrategy;
import org.example.Position.Employee;
import org.example.Position.EmployeeContext;

public class CleaningStrategy implements EmployeeStrategy {
    private String designation;

    public CleaningStrategy(String designation) {
        this.designation = designation;
    }

    @Override
    public void executeStrategy(EmployeeContext context) {
        System.out.println("Cleaning strategy: " + designation);
    }
}


