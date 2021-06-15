package job4j.ex;

import java.util.Arrays;


// 0. Что такое исключение. [#320232]
public class BackArray {
    public static void main(String[] args) {
        String[] names = {"Petr", "Ivan", "Nik", "Vasya"};
        int middle = names.length / 2;
        for (int i = 0; i <= middle; i++) {
            String temp = names[i];
            names[i] = names[names.length - i - 1];
            names[names.length - i - 1] = temp;
        }
        System.out.println(Arrays.toString(names));
    }
}
