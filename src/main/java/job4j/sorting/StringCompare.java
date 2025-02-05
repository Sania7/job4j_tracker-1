package job4j.sorting;

import java.util.Comparator;


//3. Компаратор для строк [#35008 #117262]
public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 0; i < (Math.min(left.length(), right.length())); i++) {
            char ch1 = left.charAt(i);
            char ch2 = right.charAt(i);
            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }
        return left.length() - right.length();
    }
}