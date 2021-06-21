package job4j.oop;

public class Battery {
    private int load;

    public Battery(int power) {
        this.load = power;
    }
    public void exchange(Battery another) {
        another.load = this.load + another.load;
        this.load = 0;
    }


    public static void main(String[] args) {
        Battery first = new Battery(10);
        Battery second = new Battery(5);
        System.out.println("First: " + first.load + " Second: " + second.load);
        first.exchange(second);
        System.out.println("First: " + first.load + " Second: " + second.load);

    }
}
