package job4j.sorting;

import java.util.Comparator;


//создаем класс который будет реализовывать сортировку по имени
public class SortByNameJob implements Comparator<Job> {
    @Override
    public int compare(Job first, Job second) {
        return first.getName().compareTo(second.getName());
    }
}
