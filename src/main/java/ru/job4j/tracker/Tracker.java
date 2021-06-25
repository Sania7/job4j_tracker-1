package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//5. Tracker - хранилище [#396 #117284]
public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;


    // добавить заявку
    public Item add(Item item) {
        item.setId(ids++);//
        items.add(item);// добавляет заявку в массив items
        return item;
    }

    public List<Item> findAll() {
        return items;
    }

    // найти по имени заявку
    public List<Item> findByName(String key) {
        List<Item> rsl = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(key)) {
                rsl.add(item);
            }
        }
        return rsl;
    }

    //найти по идентификатору
    public Item findById(int id) {
       int index = indexOf(id);
        return index != -1 ? items.get(index) : null;
    }

    // метод замены заявки
    public boolean replace(int id, Item item) {
        int index = indexOf(id); // находим index  с помощью метода indexOf
        boolean rsl = index != -1;  //проверяем если не отрицательный
        if (rsl) {
            items.set(index, item); //приравниваем index к переменной item
            item.setId(id);
        }
        return rsl; // возвращаем правда
    }

    // метод который будет возвращать index по id
    private int indexOf(int id) {
        int rsl = -1;// иницилизируем счетчик
        for (int i = 0; i < items.size(); i++) { // проходим по размеру
            if (items.get(i).getId() == id) { //сравниваем с массива items[i] index принадлежащий к id
                // если равен id
                rsl = i; // если равен то rsl =  i
                break; // останавливаем цикл
            }
        }
        return rsl; // возвращаем результат
    }

    //метод удаления заявки
    public boolean delete(int id) {
        int index = indexOf(id);
        boolean rsl = index != -1;
        if (rsl) {
            items.remove(index);
        }
        return rsl;
    }

}