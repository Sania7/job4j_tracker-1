package job4j.sorting;

import java.util.Comparator;

public class SortByAgeUser implements Comparator<User> {
    @Override
    public int compare(User first, User second) {
        return Integer.compare(first.getAge(), second.getAge());
    }
}
