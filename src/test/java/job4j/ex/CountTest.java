package job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;


//0.3. Тестирование исключений с junit [#219366 #117314]
public class CountTest {
    @Test(expected = IllegalArgumentException.class)// указываем класс исключения
    public void whenStartGreaterThenFinish() {
        Count.add(10, 2);
    }

}