package ru.job4j.tracker;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Item implements Comparable<Item> {
    private int id; //переменная поле уникальный номер заявления
    private String name; // содержит название заявления
    private LocalDateTime created = LocalDateTime.now(); //время подачи заявления

    public LocalDateTime getCreated() {
        return created;
    }

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Item() {}
    public Item(String name) {
        this.name = name;
    }
    public Item(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, id);
    }

    @Override
    public String toString() {
        return "Item {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", created = " + formatter.format(created) +
                '}';
    }

    @Override
    public int compareTo(Item another) {
        return Integer.compare(id, another.id);
    }
}