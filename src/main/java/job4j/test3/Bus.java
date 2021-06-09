package job4j.test3;

public class Bus implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " передвигается по трассе!");
    }

    @Override
    public void deliver() {
        System.out.println(getClass().getSimpleName() + " доставляет груз по трассе!");
    }
}
