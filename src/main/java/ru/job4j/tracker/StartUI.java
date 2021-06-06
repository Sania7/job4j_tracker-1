package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {
    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {
                System.out.println("=== Create a new Item ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("=== Show all items ===");
                Item[] n = tracker.findAll();
                if (n.length == 0) {
                    System.out.println("Error, we can`t find result!");
                } else {
                    for (int i = 0; i < n.length; i++) {
                        System.out.println("Found: " + n[i]);
                    }
                }

            } else if (select == 2) {
                System.out.println("=== Edit item ===");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Enter name: ");
                String name = scanner.nextLine();
                Item newiItem = new Item(name);
                tracker.replace(id, newiItem);
                if (tracker.replace(id, newiItem)) {
                    System.out.println("Operation completed!");
                } else {
                    System.out.println("Error, operation failed!");
                }
            } else if (select == 3) {
                System.out.println("=== Delete item ===");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                tracker.delete(id);
                if (tracker.delete(id)) {
                    System.out.println("Error, operation failed!");
                } else {
                    System.out.println("Operation completed!");
                }
            } else if (select == 4) {
                System.out.println("=== Find item by Id ===");
                System.out.print("Enter id: ");
                int id = Integer.parseInt(scanner.nextLine());
                Item item = tracker.findById(id);
                if (item != null) {
                    System.out.println(item.getName() + " ' " + item.getId());
                } else {
                    System.out.println("Application with this id was not found!");
                }
            } else if (select == 5) {
                System.out.println("=== Find items by name ===");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item[] rsl = tracker.findByName(name);
                if (rsl.length > 0) {
                    for (int i = 0; i < rsl.length; i++) {
                        System.out.println(rsl[i]);
                    }
                } else {
                    System.out.println("No tickets with this name were found!");
                }
            } else if (select == 6) {
                System.out.println("=== Exit Program ===");
                run = false;
            }
        }
    }
    private void showMenu() {
        System.out.println("Menu: ");
        System.out.println("0. Add new Item.");
        System.out.println("1. Show all items.");
        System.out.println("2. Edit item.");
        System.out.println("3. Delete item.");
        System.out.println("4. Find item by Id.");
        System.out.println("5. Find items by name.");
        System.out.println("6. Exit Program.");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);

    }
}
