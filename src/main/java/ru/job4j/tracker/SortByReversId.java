package ru.job4j.tracker;

import java.util.Comparator;

public class SortByReversId implements Comparator<Item> {

    @Override
    public int compare(Item o2, Item o1) {
        return Integer.compare(o2.getId(), o1.getId());
    }
}
