package org.example.Strategy;

import org.example.Interface.EmployeeStrategy;
import org.example.Position.Employee;
import org.example.Position.EmployeeContext;

public class GroupTrainingStrategy implements EmployeeStrategy {
    private String designation;

    public GroupTrainingStrategy(String designation) {
        this.designation = designation;
    }

    @Override
    public void executeStrategy(EmployeeContext context) {
        System.out.println("Group training strategy: " + designation);
    }
}


