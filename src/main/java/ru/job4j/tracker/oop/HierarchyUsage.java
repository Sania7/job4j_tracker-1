package ru.job4j.tracker.oop;

public class HierarchyUsage {
    public static void main(String[] args) {
        //создаем объект класса Car
        Car car = new Car();

        //Делаем приведение к типу родителя Transport up-casting
        Transport tr = car;

        //Делаем приведение к типу родителя Object up-casting
        Object obj = car;

        //Приведение типа при создании объекта
        Object ocar = new Car();

        //Приведение типа за счет понижения по иерархии down casting
        Car carFromObject = (Car) ocar;

        //Ошибка в приведении типа
        Object bicycle = new Bicycle();

        //Код завершится с ошибкой приведения типов ClassCastException
        Car cb = (Car) bicycle;

    }
}
