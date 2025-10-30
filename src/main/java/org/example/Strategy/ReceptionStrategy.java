package org.example.Strategy;

import org.example.Interface.EmployeeStrategy;
import org.example.Position.Employee;
import org.example.Position.EmployeeContext;

public class ReceptionStrategy implements EmployeeStrategy {
    private final String designation;

    public ReceptionStrategy(String designation) {
        this.designation = designation;
    }

    @Override
    public void executeStrategy(EmployeeContext context) {
        System.out.println("Reception stategy: " + designation);
    }
}