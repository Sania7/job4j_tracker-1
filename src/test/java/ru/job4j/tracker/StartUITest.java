package ru.job4j.tracker;


//5.1. Тестирование. Подготовка данных. [#182960 #117299]
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class StartUITest {

//    @Test
//    public void whenAddItem() {
//        String[] answers = {"Fix PC"};
//        Input input = new StubInput(answers);
//        Tracker tracker = new Tracker();
////        StartUI(input, tracker);
//        Item created = tracker.findAll()[0];
//        Item expected = new Item("Fix PC");
//        assertThat(created.getName(), is(expected.getName()));
//    }

//    @Test
//    public void replaceItem() {
//        Tracker tracker = new Tracker();
//        Item item = new Item();
//        tracker.add(item);
//        String[] answers = {String.valueOf(item.getId()), "replaced item"};
////        StartUI.replaceItem(new StubInput(answers), tracker);
//        Item replaced = tracker.findById(item.getId());
//        assertThat(replaced.getName(), is("replaced item"));
//    }

//    @Test
//    public void deleteItem() {
//        Tracker tracker = new Tracker();
//        Item item = new Item();
//        tracker.add(item);
//        String[] answers = {String.valueOf(item.getId()),"deleted item"};
//        StartUI.deleteItem(new StubInput(answers), tracker);
//        Item deleted = tracker.findById(item.getId());
//        assertNull(deleted);
//    }
}