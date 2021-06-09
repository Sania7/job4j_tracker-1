package job4j.test1;

public class GuineaPig implements Animal{
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " громко пищит для привлечения внимания!");
    }
}
