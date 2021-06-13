package ru.job4j.tracker;


// класс который использует интерфейс Input
public class StubInput implements Input {

    private String[] answers;// поле с вариантами ответов массив строк
    private int position = 0;//счетчик чтобы при повторном вызове мы получали ячейку

    public StubInput(String[] answers) { // конструктор
        this.answers = answers;
    }
    @Override
    public String askStr(String question) {
        return answers[position++];
    }

    @Override
    public int askInt(String question) {
        return Integer.parseInt(askStr(question));
    }
}
