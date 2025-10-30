package org.example.Position;

import org.example.Interface.EmployeeStrategy;

public abstract class Employee {
    private EmployeeStrategy trainStrategy;
    private String workerName;

    public Employee(String workerName) {
        this.workerName = workerName;
    }

    public void setWorkStrategy(EmployeeStrategy trainStrategy) {
        this.trainStrategy = trainStrategy;
    }

    public void setWorkerName(String workerName) {
        this.workerName = workerName;
    }

    public void performWork() {
        System.out.println("\nEmployee " + workerName + "Strategy below");
        trainStrategy.executeStrategy();
    }
}
