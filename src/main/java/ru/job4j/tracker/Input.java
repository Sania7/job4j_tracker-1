package ru.job4j.tracker;


// Создаем интерфейс
public interface Input {

//метод который будет возвращать строку введенную от пользователя
    String askStr(String question);

//метод будет возвращать от пользователя число
    int askInt(String question);

}
