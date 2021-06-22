package job4j.collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Linked {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        for (int i = 0; i < 5_000_000; i++) {
            list1.add(new Integer(i));
        }
        long start1 = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list1.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для ArrayList (в миллисекундах) = " + (System.currentTimeMillis() - start1));

        System.out.println();


        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5_000_000; i++) {
            list.add(new Integer(i));
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            list.add(2_000_000, new Integer(Integer.MAX_VALUE));
        }
        System.out.println("Время работы для LinkedList (в милисекундах) = " + (System.currentTimeMillis() - start));

    }
}
