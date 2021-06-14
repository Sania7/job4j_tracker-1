package ru.job4j.tracker;

public class FindAllAction implements UserAction{
    @Override
    public String name() {
        return "=== Show all items ===";
    }


    @Override
    public boolean execute(Input input, Tracker tracker) {
        System.out.println("=== Show all items ===");
        Item[] items = tracker.findAll();
        if (items.length > 0) {
            for (Item item : items) {
                System.out.println(item.toString());
            }
        } else {
            System.out.println("The store does not contain orders!");
        }
        return true;
    }
}
