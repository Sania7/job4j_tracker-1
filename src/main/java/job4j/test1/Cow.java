package job4j.test1;

public class Cow implements Animal{
    @Override
    public void sound() {
        System.out.println(getClass().getSimpleName() + " произносит звук: Му - му!");
    }
}
