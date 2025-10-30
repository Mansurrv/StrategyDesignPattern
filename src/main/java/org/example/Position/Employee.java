package org.example.Position;

import org.example.Interface.EmployeeStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
    private final List<EmployeeStrategy> strategies = new ArrayList<>();
    private String workerName;

    public Employee(String workerName) {
        this.workerName = workerName;
    }

    public void addWorkStrategy(EmployeeStrategy strategy) {
        strategies.add(strategy);
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public void performWork(EmployeeContext context) {
        System.out.println("\nEmployee " + workerName + "Strategy below");
        for (EmployeeStrategy strategy : strategies) {
            strategy.executeStrategy(context);
        }
    }
}
