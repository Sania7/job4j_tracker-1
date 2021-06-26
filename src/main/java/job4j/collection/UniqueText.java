package job4j.collection;

import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean rsl = true;
        // преобразовали строку в массив слов
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        //создали новую коллекцию и добавили в нее массив строк
        HashSet<String> check = new HashSet<>();
        for (String words : origin) {
           check.add(words);
        }
        // проверили массив строк через цикл и метод contains
        for (String str : text) {
            rsl = check.contains(str);
            if (!rsl) {
                break;
            }
        }
        return rsl;
    }
}
