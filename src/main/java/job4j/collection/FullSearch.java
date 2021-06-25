package job4j.collection;

// 1. Уникальные задачи. [#212653 #117278]
import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Tasks> list) { //метод
        HashSet<String> numbers = new HashSet<>(); // создаем новый результатирующий список
        for (Tasks element : list) { //проходим по списку
            numbers.add(element.getNumber()); //добавляем в новый список элемент
        }
        return numbers; // возвращаем список
    }
}
