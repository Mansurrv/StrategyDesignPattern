package org.example;

public class Human {
    Activity activity;

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public void execute() {
        activity.doSomething();
    }
}