package job4j.ex;


//java.lang.IllegalArgumentException - метод вызывается с некорректными параметрами.

public class Fact {
    public static void main(String[] args) {
        System.out.println(calc(9));
    }
    public static int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Index n is less than 0!");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}
