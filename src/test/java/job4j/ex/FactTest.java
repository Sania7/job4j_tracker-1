package job4j.ex;

import org.junit.Test;

//0.3. Тестирование исключений с junit [#219366 #117314]
public class FactTest {
    @Test(expected = IllegalArgumentException.class)
    public void whenFact() {
        new Fact().calc(-10);
    }

}