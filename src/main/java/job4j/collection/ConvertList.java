package job4j.collection;

import java.util.ArrayList;
import java.util.List;

// 5. Конвертация листа массивов в один лист Integer [#10037 #117264]
public class ConvertList {
    public static List<Integer> convert(List<int[]> list) {
        List<Integer> result = new ArrayList<>();
        for (int[] rows : list) {
            for (int cell : rows) {
                result.add(cell);
            }
        }
        return result;
    }
}
