package job4j.test3;

public class Train implements Vehicle{
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " поезд передвигается по рельсам.");
    }

    @Override
    public void deliver() {
        System.out.println(getClass().getSimpleName() + " доставляет груз по рельсам!");
    }
}
