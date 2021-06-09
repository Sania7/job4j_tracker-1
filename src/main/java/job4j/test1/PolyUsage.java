package job4j.test1;

public class PolyUsage {
    public static void main(String[] args) {
        Animal cow = new Cow();
        Animal goose = new Goose();
        Animal dog = new Dog();
        Animal guineaPig = new GuineaPig();

        Animal[] animals = new Animal[] {cow, goose, dog, guineaPig};
        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
