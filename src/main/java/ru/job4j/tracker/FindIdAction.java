package ru.job4j.tracker;

public class FindIdAction implements UserAction{
    private final Output out;

    public FindIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "=== Find item by id ===";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println("=== Find item by id ===");
        int id = Integer.parseInt(input.askStr("Enter id: "));
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(item.getName() + "," + item.getId());
        } else {
            out.println("Application with entered " + id + " not found!");
        }
        return true;
    }
}
