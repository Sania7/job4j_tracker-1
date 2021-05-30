package ru.job4j.tracker.oop;

//1.2. Вызов метода объекта [#166085 #117323]
public class Student {
    public void music(String lyrics) { // метод с параметрами
        System.out.println("I can sing a song: " + lyrics);
    }
    public void song() {
        System.out.println("I believe i can fly!");
    }

    public static void main(String[] args) {
        Student petya = new Student(); // объект класса Student создается
        String song = "I believe, i can fly!"; // создаем переменную
        petya.music(song); // вызываем метод у созданного объекта с переменной
        petya.song();
    }
}
