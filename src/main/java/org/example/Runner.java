package org.example;

import org.example.Interface.EmployeeStrategy;
import org.example.Position.*;
import org.example.Strategy.*;


public class Runner {
    public static void main(String[] args) {
        EmployeeContext userGoal = new EmployeeContext("Dosymzhan", "lose weight");

        Employee mansurCoach = new FitnessCoach("Mansur Coach");
        mansurCoach.addWorkStrategy(new PersonalTrainingStrategy("muscle gain, strength, endurance"));
        mansurCoach.addWorkStrategy(new GroupTrainingStrategy("weight loss"));
        mansurCoach.performWork(userGoal);

        Employee nurhanNutrition = new Nutrition("Nurhan Nutrition");
        nurhanNutrition.addWorkStrategy(new NutritionConsultationStrategy("fat loss, muscle gain, or maintenance"));
        nurhanNutrition.performWork(userGoal);

        Employee dosykReceptionist = new Reception("Dosyk Receptionist");
        dosykReceptionist.addWorkStrategy(new ReceptionStrategy("greeting guests"));
        dosykReceptionist.performWork(userGoal);

        Employee sultanCleaner = new Cleaning("Sultan Cleaner");
        sultanCleaner.addWorkStrategy(new CleaningStrategy(""));
        sultanCleaner.performWork(userGoal);
    }
}
