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
       int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    // метод замены заявки
    public boolean replace(int id, Item item) {
        int index = indexOf(id); // находим index  с помощью метода indexOf
        boolean rsl = index != -1;  //проверяем если не отрицательный
        if (rsl) {
            items[index] = item; //приравниваем index к переменной item
            item.setId(id);
        }
        return rsl; // возвращаем правда
    }

    // метод который будет возвращать index по id
    private int indexOf(int id) {
        int rsl = -1;// иницилизируем счетчик
        for (int i = 0; i < size; i++) { // проходим по размеру
            if (items[i].getId() == id) { //сравниваем с массива items[i] index принадлежащий к id
                // если равен id
                rsl = i; // если равен то rsl =  i
                break; // останавливаем цикл
            }
        }
        return rsl; // возвращаем результат
    }

    //метод удаления заявки
    public boolean delete(int id) {
        int index = indexOf(id); // находим переменную по методу
        boolean rsl = index != -1; // сразу инициализируем переменную проверкой
        if (rsl) { //проверяем условие
            int start = index + 1; // стартовая позиция
            int dostPos = index;// index найденного элемента
            int length = size - index;//в конце обнуляем последнюю ячейку
            System.arraycopy(items, start, items, dostPos, length);
            items[size - 1] = null;// уменьшить указатель position
            size--;
            return true;
        }
        return rsl;
    }

}