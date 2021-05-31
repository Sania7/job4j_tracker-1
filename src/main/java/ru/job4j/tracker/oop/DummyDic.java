package ru.job4j.tracker.oop;


//1.4. Вызов метода с возвращаемым типом. [#167387 #117324]

public class DummyDic {
    public static String engToRus(String eng) {

        String word = "Слово";
        return  eng + word;
    }

    public static void main(String[] args) {
        DummyDic dummyDic = new DummyDic();
        String word = dummyDic.engToRus(" ");
        System.out.println(word);
    }
}
