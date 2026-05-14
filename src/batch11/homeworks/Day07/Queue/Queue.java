package batch11.homeworks.Day07.Queue;

import java.util.LinkedList;

public class Queue {

    private LinkedList<String> names;

    public Queue() {
        this.names = new LinkedList<>();
    }

    public void join(String personName) {
        names.add(personName);
    }

    public void serve() {
        if (!names.isEmpty()) {
            String servedPerson = names.removeFirst();
            System.out.println("Now serving: " + servedPerson);
        } else {
            System.out.println("The queue is empty. No one to serve!");
        }
    }
    public void display() {
        System.out.println("\n--- Current Waiting List ---");
        if (names.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            for (String name : names) {
                System.out.println("- " + name);
            }
        }
    }

    public int count() {
        return names.size();
    }
}
