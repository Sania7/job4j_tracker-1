package job4j.sorting;

import java.util.Comparator;

public class SortByNameUser implements Comparator<User> {
    @Override
    public int compare(User first, User second) {
        return first.getName().compareTo(second.getName());
    }
}
