package job4j.sorting;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSort {
    public static void main(String[] args) {
        Set<Integer> numbers = new TreeSet<>();
        numbers.add(5);
        numbers.add(6);
        numbers.add(3);
        numbers.add(1);
        System.out.println(numbers + " сортировка по возрастанию.");

        System.out.println();
        Set<Integer> numbers2 = new TreeSet<>(Collections.reverseOrder());
        numbers2.add(6);
        numbers2.add(3);
        numbers2.add(9);
        numbers2.add(2);
        System.out.println(numbers2 + " сортировка по убыванию.");
    }
}
