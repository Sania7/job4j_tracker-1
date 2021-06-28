package job4j.sorting;

import java.util.Comparator;


//компаратор который сравнивает количество символов в имени
public class JobDescByNameLn implements Comparator<Job> {
    @Override
    public int compare(Job o1, Job o2) {
        return Integer.compare(o2.getName().length(), o1.getName().length());
    }
}
