package ru.job4j.tracker;

public class FindIdAction implements UserAction{
    @Override
    public String name() {
        return "=== Find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Find item by id ===");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            System.out.println("Request number: " + item);
        } else {
            System.out.println("Application with entered " + id + " not found!");
        }
        return true;
    }
}
