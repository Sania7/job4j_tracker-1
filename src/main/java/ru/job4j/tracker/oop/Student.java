package ru.job4j.tracker.oop;

//1.2. Вызов метода объекта [#166085 #117323]
public class Student {
    public void music() { // метод без параметров
        System.out.println("Tra tra tra!");
    }
    public void song() {
        System.out.println("I believe i can fly!");
    }

    public static void main(String[] args) {
        Student petya = new Student(); // объект класса Student создается
        petya.music(); // вызываем метод у созданного объекта
        petya.song();
    }
}
