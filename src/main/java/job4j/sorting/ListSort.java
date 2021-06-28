package job4j.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListSort {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,4,3,1,2);
        List<Integer> list1 = Arrays.asList(5,4,3,1,2);
        System.out.println(list);
        Collections.sort(list);//обычная сортировка
        Collections.sort(list1, Collections.reverseOrder());// развернуть сортировку
        System.out.println(list);
        System.out.println(list1);

        System.out.println();
        Integer first = 2;
        Integer second = 2;
        int rsl = first.compareTo(second);
        System.out.println(rsl);

        System.out.println();
        String petr = "Petr";
        String ivan = "Ivan";
        int rslStr = petr.compareTo(ivan);
        System.out.println(rslStr);
    }
}
