package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {
    @Test
    public void whenWeSortDirectly() {
        List<Item> items = new ArrayList<>();
        items.add(new Item(12,"Book"));
        items.add(new Item(7, "Pen"));
        items.add(new Item(3, "Bag"));
        items.add(new Item(5, "Table"));
        items.add(new Item(1, "Note"));
        Collections.sort(items, new SortById());
        List<Item> items2 = new ArrayList<>();
        items2.add(new Item(1, "Note"));
        items2.add(new Item(3, "Bag"));
        items2.add(new Item(5, "Table"));
        items2.add(new Item(7, "Pen"));
        items2.add(new Item(12, "Book"));
        assertThat(items, is(items2));
    }

}