package ru.job4j.tracker.validate;

public class DivByZero {
    public static int div(int first, int second) {
        int rsl = -1;
        if (second == 0) {
            System.out.println("When divided by 0, return the default value of -1.");
        } else {
            rsl = first / second;
        }
        return rsl;
    }

    public static void main(String[] args) {
        int rsl = div(10, 0);
        System.out.println(rsl);
    }
}
