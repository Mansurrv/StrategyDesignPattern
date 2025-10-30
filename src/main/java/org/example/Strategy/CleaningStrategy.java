package org.example.Strategy;

import org.example.Interface.EmployeeStrategy;

public class CleaningStrategy implements EmployeeStrategy {
    @Override
    public void executeStrategy() {
        String designation = "Cleaner: cleans gym floors, mirrors, and equipment";
        System.out.println(designation);
    }
}


