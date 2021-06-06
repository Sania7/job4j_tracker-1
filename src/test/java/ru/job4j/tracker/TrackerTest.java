package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item();
        item.setName("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    //замена заявки
    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();// создаем объект tracker
        Item bug = new Item();//создаем объект Item
        bug.setName("Bug"); // присваиваем имя
        tracker.add(bug); // добаляем в хранилище bug
        int id = bug.getId();// присваиваем переменной
        Item bugWithDesc = new Item(); //создаем еще объект
        bugWithDesc.setName("Bug with description.");//устанавливаем имя
        tracker.replace(id, bugWithDesc);// используем метод для замены
        assertThat(tracker.findById(id).getName(), is("Bug with description."));
    }

    // удаление заявки
    @Test
    public void whenDelete() {
        Tracker tracker = new Tracker();
        Item bug = new Item();
        bug.setName("Bug");
        tracker.add(bug);
        int id = bug.getId();
        tracker.delete(id);
        assertThat(tracker.findById(id), is(nullValue()));
    }
}