package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            showMenu();
            System.out.println("Select: ");
            int select = Integer.parseInt(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Created a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
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
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Application changed successfully!");
                } else {
                    System.out.println("Order replacement error!");
                }
            } else if (select == 3) {
                System.out.println("=== Delete Item ===");
                System.out.println("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                if (tracker.delete(id)) {
                    System.out.println("Your application has been deleted!");
                } else {
                    System.out.println("Delete error!");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by id ===");
                System.out.println("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println("Request number: " + item);
                } else {
                    System.out.println("Application with entered " + id + " not found!");
                }
            } else if (select == 6) {
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
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
