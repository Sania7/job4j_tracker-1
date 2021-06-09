package job4j.test3;

public class Plane implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " летит над облаками!");
    }

    @Override
    public void deliver() {
        System.out.println(getClass().getSimpleName() + " доставляет груз по воздуху!");
    }
}
