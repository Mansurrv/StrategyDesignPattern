package org.example.Strategy;

import org.example.Interface.EmployeeStrategy;

public class NutritionConsultationStrategy implements EmployeeStrategy {
    @Override
    public void executeStrategy() {
        String designation = "Nutrition Consultation: provides consultations about diet and supplements";
        System.out.println(designation);
    }
}
