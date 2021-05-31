package ru.job4j.tracker.oop;

public class Cat {
   private String food;// поле объекта
   private String name;// поле объекта

   public void show() {
       System.out.println(this.food);
       System.out.println(this.name);
   }
   public void eat(String meat) { // метод объекта
       this.food = meat;
   }
   public void giveNick(String nick) { // метод объекта
       this.name = nick;
   }
    public static void main(String[] args) {
        System.out.println("There are gav`s food.");
        Cat gav = new Cat();
        gav.giveNick("Gav");
        gav.eat("kotleta");
        gav.show();
        System.out.println("There are black`s food.");
        Cat black = new Cat();
        black.giveNick("Black");
        black.eat("fish");
        black.show();
    }
}
