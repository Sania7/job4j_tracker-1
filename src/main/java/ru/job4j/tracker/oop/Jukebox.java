package ru.job4j.tracker.oop;

import java.util.Scanner;

//1.3. Вызов метода с аргументами. [#166086 #117322]
public class Jukebox {
    public static void music(int position) {
        while (true) {
            if (position == 1) {
                System.out.println("Пусть бегут неуклюже)");
            } else if (position == 2) {
                System.out.println("Спокойной ночи!");
            } else {
                System.out.println("Песня не найденна!");
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        Jukebox.music(num);
    }
}
