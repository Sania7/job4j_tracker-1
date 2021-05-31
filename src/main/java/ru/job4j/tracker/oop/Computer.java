package ru.job4j.tracker.oop;

//1.7. Конструктор [#173889 #117321]
public class Computer {

    private boolean multiMonitor;// поля класса
    private int ssd;
    private String cpu;

    // По сути конструктор это специальный метод который вызывается при создании
    // нового объекта,конструктор нужен для автоматической инициализации переменных.
    //Имя конструктора совпадает с именем класса, в том числе и соблюдая регистр,
    // при этом синтаксически конструктор похож на метод без возвращаемого значения.
    public Computer(boolean multiMonitor, int ssd, String cpu) {
        this.multiMonitor = multiMonitor;
        this.ssd = ssd;
        this.cpu = cpu;
    }
    // конструктор без параметров, в явном виде
    public Computer() {

    }

    // Метод который будет выводить в консоль содержимое наших полей
    public void printInfo() {
        System.out.println("Много мониторов: " + multiMonitor);
        System.out.println("SSD: " + ssd + " GB");
        System.out.println("Модель CPU: " + cpu);
    }
    public static void main(String[] args) {
        //после инициализации переменных,вносим данные сразу в создаваемый объект.
        Computer computer = new Computer(true,500,"Intel Core I7-10700K");// дефолтный конструктор или по умолчанию
        Computer comp = new Computer(true,256,"AMD Ryzen 5 3600");
        Computer computer1 = new Computer();
        computer.printInfo();
        System.out.println();
        comp.printInfo();
        System.out.println();
        computer1.printInfo();
    }
}
