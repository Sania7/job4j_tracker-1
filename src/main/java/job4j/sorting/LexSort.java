package job4j.sorting;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
 /*
 Возвращаем Integer через compare, распарсиваем слово, режем его по точке и берем
 нулевой индекс в слове, аналогично и для второго слова.
 */
        return Integer.compare(Integer.parseInt(left.split("[.]")[0]),
                Integer.parseInt(right.split("[.]") [0]));
    }
}
