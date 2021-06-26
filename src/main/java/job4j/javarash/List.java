package job4j.javarash;

import java.util.ArrayList;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Адександр");
        list.add("Юлия");
        list.add("Иван");
        list.add("Вячеслав");
        for (String s : list) {
            System.out.print(s + " ");
        }
        System.out.println();
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                list1.add(i);
            }
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        int n = list1.size();
        list1.remove(n - 1);
        list1.remove(n - 2);
        list1.remove(n - 3);
        System.out.println(list1);
    }
}
