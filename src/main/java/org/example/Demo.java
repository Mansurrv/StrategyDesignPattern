package org.example;

public class Demo {
    public static void main(String[] args) {
        Human human = new Human();

        human.setActivity(new Coding());
        human.execute();

        human.setActivity(new Training());
        human.execute();

        human.setActivity(new Sleeping());
        human.execute();
    }
}
