package ru.job4j.tracker.oop;


//1.8. Состояние объекта [#167388 #117328]
public class Jar {
    private int value; // поле класса

    public Jar(int size) {// конструктор с параметрами,
        // то что при создании объекта сразу указываем параметры
        this.value = size;
    }

    public void pour(Jar another) { // метод перелить воду
        this.value = this.value + another.value;
        another.value = 0;
    }

    public static void main(String[] args) { // метод main
        Jar first = new Jar(10);
        Jar second = new Jar(5);
        System.out.println("first: " + first.value + " second :" + second.value);
        first.pour(second);
        System.out.println("first: " + first.value + " second :" + second.value);
    }
}
