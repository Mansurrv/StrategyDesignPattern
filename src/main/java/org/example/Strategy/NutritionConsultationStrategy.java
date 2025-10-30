package org.example.Strategy;

import org.example.Interface.EmployeeStrategy;
import org.example.Position.Employee;
import org.example.Position.EmployeeContext;

public class NutritionConsultationStrategy implements EmployeeStrategy {
    private String designation;

    public NutritionConsultationStrategy(String designation) {
        this.designation = designation;
    }

    @Override
    public void executeStrategy(EmployeeContext context) {
        System.out.println("Nutrition strategy: " + designation);
    }
}


