package org.example.Strategy;

import org.example.Interface.EmployeeStrategy;

public class ReceptionStrategy implements EmployeeStrategy {
    @Override
    public void executeStrategy() {
        String designation = "Receptionist: answers questions about memberships and schedules";
        System.out.println(designation);
    }
}
