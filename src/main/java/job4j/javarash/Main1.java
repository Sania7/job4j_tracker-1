package job4j.javarash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main1 {
    public static void main(String[] args) {
        HashMap<Integer, String> passportAndNames = new HashMap<>(); //создали словарь
        passportAndNames.put(212133, "Александр Александрович Банников"); //добавили в словарь
        passportAndNames.put(243523, "Юлия Петровна Банникова");
        passportAndNames.put(213554, "Иван Александрович Банников");
        passportAndNames.put(264335, "Вячеслав Романович Чекрыжов");
        passportAndNames.put(212135, "Александр Иванович Банников");
        System.out.println(passportAndNames.get(212135));
        System.out.println();
        String alexandrName = passportAndNames.get(212135); // получили значение по ключу
        System.out.println(alexandrName);
        System.out.println();
        passportAndNames.remove(212135); //удалили по ключу
        System.out.println(passportAndNames);
        System.out.println();
        //проверяем наличие ключа
        System.out.println(passportAndNames.containsKey(264335));
        //проверяем наличие значения
        System.out.println(passportAndNames.containsValue("Иван Александрович Банников"));
        System.out.println(passportAndNames.containsValue("Александр Иванович Банников"));
        System.out.println();
        Set<Integer> keys = passportAndNames.keySet();
        System.out.println("Ключи: " + keys);
        System.out.println();
        ArrayList<String> values = new ArrayList<>(passportAndNames.values());
        System.out.println("Значения " + values);
        System.out.println();
        System.out.println(passportAndNames.size());//возвращает число в словаре
        System.out.println();
        //passportAndNames.clear();//удаляем все элементы
        System.out.println(passportAndNames);
        System.out.println();
        if (!passportAndNames.isEmpty()) {//проверяем есть ли хоть один элемент
            System.out.println(passportAndNames);
        }
        System.out.println();
        HashMap<Integer, String> passportAndNames2 = new HashMap<>();
        passportAndNames2.put(917352, "Алексей Андреевич Ермаков");
        passportAndNames2.put(925648, "Максим Олегович Архаров");
        passportAndNames.putAll(passportAndNames2);//объеденяем две Мары в одну
        System.out.println(passportAndNames);
        System.out.println();
        for (Map.Entry entry : passportAndNames.entrySet()) {// проходим циклом
            System.out.println(entry);
        }
    }
}
