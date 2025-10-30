package org.example;

import org.example.Interface.EmployeeStrategy;
import org.example.Position.*;
import org.example.Strategy.*;


public class Runner {
    public static void main(String[] args) {
        Employee mansurCoach = new FitnessCoach("Mansur Coach");
        mansurCoach.setWorkStrategy(new PersonalTrainingStrategy());
        mansurCoach.performWork();

        Employee nurhanNutrition = new Nutrition("Nurhan Nutrition");
        nurhanNutrition.setWorkStrategy(new NutritionConsultationStrategy());
        nurhanNutrition.performWork();

        Employee dosykReceptionist = new Reception("Dosyk Receptionist");
        dosykReceptionist.setWorkStrategy(new ReceptionStrategy());
        dosykReceptionist.performWork();

        Employee sultanCleaner = new Cleaning("Sultan Cleaner");
        sultanCleaner.setWorkStrategy(new CleaningStrategy());
        sultanCleaner.performWork();
    }
}
