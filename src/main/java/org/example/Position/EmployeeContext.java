package org.example.Position;

public class EmployeeContext {
    private String clientName;
    private String goal;

    public EmployeeContext(String clientName, String goal) {
        this.clientName = clientName;
        this.goal = goal;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getGoal() {
        return goal;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }
}
