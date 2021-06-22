package job4j.collection;

import java.util.LinkedList;

/**
 * 2. Очередь с приоритетом на LinkedList [#41670 #117269]
 * Метод должен вставлять в нужную позицию элемент.
 * Позиция определяется по полю приоритет.
 * Для вставки использовать add(int index, E value)
 * @param
 */
public class PriorityQueue {
    private LinkedList<Task> tasks = new LinkedList<>();
    public void put(Task task) {
        int index = 0;
        for (Task element : tasks) {
            if (element.getPriority() > task.getPriority()) {
                break;
            }
            index++;
        }
        this.tasks.add(index, task);
    }
    public Task take() {
        return tasks.poll();
    }
}
