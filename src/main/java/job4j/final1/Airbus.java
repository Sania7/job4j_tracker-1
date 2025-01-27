package job4j.final1;

public class Airbus {
    private static final int COUNT_ENGINE = 2;
    private String name;

    public Airbus(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printModel() {
        System.out.println("Модель самолета " + name);
    }

    public void printCountEngine() {
        int countEngine = "A380".equals(name) ? 4 : COUNT_ENGINE;
        System.out.println(countEngine);
    }

    @Override
    public String toString() {
        return "Airbus{"
                +
                "name='"
                + name
                + '\''
                +
                '}';
    }
}
