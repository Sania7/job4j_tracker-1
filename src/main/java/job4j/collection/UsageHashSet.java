package job4j.collection;

import java.util.HashSet;

public class UsageHashSet {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Александр");
        names.add("Александр");
        names.add("Юлия");
        names.add("Иван");
        names.add("Вячеслав");
        for (String name : names) {
            System.out.print(name + " ");
        }
    }
}
