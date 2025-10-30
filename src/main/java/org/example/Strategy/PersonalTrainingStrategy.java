package org.example.Strategy;

import org.example.Interface.EmployeeStrategy;

public class PersonalTrainingStrategy implements EmployeeStrategy {
    @Override
    public void executeStrategy() {
        String designation = "Personal Training Strategy: creates personalized workout programs for clients";
        System.out.println(designation);
    }
}
