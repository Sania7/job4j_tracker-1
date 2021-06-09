package ru.job4j.tracker;



public class StartUI {
    public void init(Input input, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            int select = Integer.parseInt(input.askStr("Select:"));
            if (select == 0) {
                System.out.println("=== Created a new Item ===");
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
                System.out.println("Добавленная заявка " + item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] items = tracker.findAll();
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println(item.toString());
                    }
                } else {
                    System.out.println("The store does not contain orders!");
                }
            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                String name = input.askStr("Enter name: ");
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Application changed successfully!");
                } else {
                    System.out.println("Order replacement error!");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                if (tracker.delete(id)) {
                    System.out.println("Your application has been deleted!");
                } else {
                    System.out.println("Delete error!");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by id ===");
                int id = Integer.parseInt(input.askStr("Enter id: "));
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Request number: " + item);
                } else {
                    System.out.println("Application with entered " + id + " not found!");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                String name = input.askStr("Enter name: ");
                Item[] items = tracker.findByName(name);
                if (items.length > 0) {
                    for (Item item : items) {
                        System.out.println("Application with name " + item + " found!");
                    }
                } else {
                    System.out.println("Application with name " + name + " not found!");
                }
            } else if (select == 6) {
                System.out.println("Exit!");
                run = false;
            }
        }
    }
    private void showMenu() {
        String[] menu = {"Add new Item.", "Show all items.", "Edit item.",
                "Delete item.", "Find item by id.", "Find items by name.",
                "Exit Program."};
        System.out.println("Menu: ");
        for (int i = 0; i < menu.length; i++) {
            System.out.println(i + ". " + menu[i]);
        }
    }
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(input, tracker);
    }
}
