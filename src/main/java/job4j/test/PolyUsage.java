package job4j.test;

public class PolyUsage {
    public static void main(String[] args) {


        Animal animal = new Animal();
        Animal domesticAnimal = new DomesticAnimal();
        Animal cow = new Cow();
        Animal goose = new Goose();
        Animal pet = new Pet();
        Animal guineaPig = new GuineaPig();

        Animal[] animals = new Animal[]{animal, domesticAnimal, cow, goose, pet, guineaPig};
        for(Animal a : animals) {
            a.sound();
        }
    }
}