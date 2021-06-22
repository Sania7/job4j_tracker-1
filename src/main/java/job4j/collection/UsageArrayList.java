package job4j.collection;

import java.util.ArrayList;

// 0. Коллекции, ArrayList, List, Обобщения [#10094 #117268]
public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();// создание списка
        names.add("Sasha");
        names.add("Vlad");// добавление в список
        names.add("Ivan");
        names.add("Petr");
        names.add("Petr");
        names.add("Petr");
        for (Object value : names) { //цикл для списка
            System.out.print(value + " "); // вывод в печать
        }
        System.out.println();
        names.set(4, "Serg"); //замена в списке
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println();
        names.remove(1); // удаление из списка
        for (String name1 : names) {
            System.out.print(name1 + " ");
        }
        System.out.println();
        for (int i = 0; i < names.size(); i++) {
            Object val = names.get(4);// чтение данных в списке
            System.out.print(val + " ");
        }
    }
}
