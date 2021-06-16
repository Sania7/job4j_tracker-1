package job4j.ex;


// 0.1. java.lang.NullPointerException [#219364 #117311]
public class NPEx {
    public static void main(String[] args) {
        String[] shops = new String[5];// создаем массив
        shops[0] = "Petr Arsentev";// помещаем в массив с индексом [0] строку
        for (int i = 0; i < shops.length; i++) { // проходим циклом по массиву
            String el = shops[i];// помещаем в элемент el индекс массива shops
            if (el != null) {// проверяем если элемент не равен null
                System.out.println(el + " has a size : " + el.length());// выводим на печать
            }
        }
    }
}