package ru.job4j.tracker;

import java.util.Arrays;


//5. Tracker - хранилище [#396 #117284]
public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    // добавить заявку
    public Item add(Item item) {
        item.setId(ids++);//
        items[size++] = item;// добавляет заявку в массив items
        return item;
    }

    // метод найти все
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    // найти по имени заявку
    public Item[] findByName(String key) {
        Item[] copyItems = new Item[size]; // создаем результатирующий  массив
        int copySize = 0; // счетчик
        for (int i = 0; i < size; i++) { //проходим циклом по размеру не по всему циклу
            Item item = this.items[i];// создаем переменную в которую помещаем индекс этого размера
            if (item.getName().equals(key)) {// сравниваем переменную с ключем аргументом
                copyItems[copySize++] = item;//копируем в результатирующий массив
            }
        }
        return Arrays.copyOf(copyItems, copySize);//возвращаем обрезанный массив
    }

    //найти по идентификатору
    public Item findById(int id) {
        Item rsl = null; // присваиваем null классу Item в переменную rsl
        for (int index = 0; index < size; index++) { // проходим циклом по размеру size
            Item item = items[index]; //присваиваем в переменную item c массива items index
            if (item.getId() == id) {// сравниваем
                rsl = item; // присваиваем в rsl переменную результат
                break;
            }
        }
        return rsl;
    }
    public boolean replace(int id, Item item) {

        return false;
    }

}