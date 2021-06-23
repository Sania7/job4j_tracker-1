package job4j.collection;

import java.util.ArrayList;
import java.util.List;

//4. Конвертация двумерного массива в ArrayList [#320185]
public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            for (int cell : row) {
                list.add(cell);
            }
        }
        return list;
    }
}
